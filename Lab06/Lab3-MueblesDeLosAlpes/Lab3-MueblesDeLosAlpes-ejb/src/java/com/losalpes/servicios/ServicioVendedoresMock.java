/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ ServicioVendedoresMock.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.servicios;

import com.losalpes.entities.Vendedor;
import com.losalpes.excepciones.OperacionInvalidaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

/**
 * Implementación de los servicios de administración de un vendedor en el
 * sistema
 *
 */
@Stateless
public class ServicioVendedoresMock implements IServicioVendedoresMockRemote, IServicioVendedoresMockLocal {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    @Resource(mappedName ="jms/cambioDeCargoTopicFactory")
    private ConnectionFactory connectionFactory;

    @Resource(mappedName = "jms/cambioDeCargoTopic")
    private Topic topic;

    private Vendedor cVendedor;

    /**
     * Interface con referencia al servicio de persistencia en el sistema
     */
    @EJB
    private IServicioPersistenciaMockLocal persistencia;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------
    /**
     * Constructor de la clase sin argumentos
     */
    public ServicioVendedoresMock() {
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------
    /**
     * Agrega un vendedor al sistema
     *
     * @param vendedor Nuevo vendedor
     * @throws OperacionInvalidaException Excepción lanzada en caso de error
     */
    @Override
    public void agregarVendedor(Vendedor vendedor) throws OperacionInvalidaException {
        /*
        try
        {
            persistencia.create(vendedor);
        }
        catch (OperacionInvalidaException ex)
        {
            throw new OperacionInvalidaException(ex.getMessage());
        }*/
        try {
            cVendedor = vendedor;
            persistencia.create(vendedor);
        } catch (OperacionInvalidaException ex) {
            throw new OperacionInvalidaException(ex.getMessage());
        }
        try {
            notificarModificacionVendedor();
        } catch (JMSException ex) {
            Logger.getLogger(ServicioVendedoresMock.class.getName()).log(Level.SEVERE, "Error "
                    + "enviando la notificación de creación de un vendedor", ex);
        }
    }

    /**
     * Elimina un vendedor del sistema dado su ID
     *
     * @param id Identificador único del vendedor
     * @throws OperacionInvalidaException Excepción lanzada en caso de error
     */
    @Override
    public void eliminarVendedor(long id) throws OperacionInvalidaException {
        Vendedor v = (Vendedor) persistencia.findById(Vendedor.class, id);
        try {
            persistencia.delete(v);
        } catch (OperacionInvalidaException ex) {
            throw new OperacionInvalidaException(ex.getMessage());
        }
    }

    /**
     * Devuelve todos los vendedores del sistema
     *
     * @return vendedores Vendedores del sistema
     */
    @Override
    public List<Vendedor> getVendedores() {
        return persistencia.findAll(Vendedor.class);
    }

    private Message createModificacionVendendorMessage(Session session) throws JMSException {
        String msg = "Vendedor: " + cVendedor.getNombres() + " " + cVendedor.getApellidos() + "\n";
        msg += "Cargo: " + cVendedor.getPerfil() + "\n";
        msg += "Salario: " + cVendedor.getSalario() + "\n";
        TextMessage tm = session.createTextMessage();
        tm.setText(msg);
        return tm;
    }

    private void notificarModificacionVendedor() throws JMSException {
        Connection connection = connectionFactory.createConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        MessageProducer messageProducer = session.createProducer((Destination) topic);
        try {
            messageProducer.send(createModificacionVendendorMessage(session));
             Logger.getLogger(ServicioVendedoresMock.class.getName()).log(Level.INFO,
           "ServicioVendedoresMock: Se ha enviado la notificación para agregar vendedores \n");
        } catch (JMSException ex) {
            Logger.getLogger(ServicioVendedoresMock.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (JMSException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error cerrando la"
                            + " sesión", e);
                }
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
