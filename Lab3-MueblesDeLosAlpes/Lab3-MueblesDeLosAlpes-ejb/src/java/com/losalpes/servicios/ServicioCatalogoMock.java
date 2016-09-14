/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.entities.Mueble;
import com.losalpes.excepciones.OperacionInvalidaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 *
 * @author s.cardona12
 */
@Stateful
public class ServicioCatalogoMock implements IServicioCatalogoMockLocal, IServicioCatalogoMockRemote {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    
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
    public ServicioCatalogoMock()
    {
    }
    
    //-----------------------------------------------------------
    // MÃ©todos
    //-----------------------------------------------------------

    /**
     * Agrega un mueble al sistema
     * @param mueble Nuevo mueble
     * @throws OperacionInvalidaException ExcepciÃ³n lanzada en caso de error
     */
    @Override
    public void agregarMueble(Mueble mueble) {
         try
        {
            persistencia.create(mueble);
        }
        catch (OperacionInvalidaException ex)
        {
             try {
                 throw new OperacionInvalidaException(ex.getMessage());
             } catch (OperacionInvalidaException ex1) {
                 Logger.getLogger(ServicioCatalogoMock.class.getName()).log(Level.SEVERE, null, ex1);
             }
        }
    }

    /**
     * Elimina un mueble del sistema dado su ID
     * @param id Identificador del mueble
     */
    @Override
    public void eliminarMueble(long id) {
        Mueble m =(Mueble) persistencia.findById(Mueble.class, id);
        try
        {
            persistencia.delete(m);
        } catch (OperacionInvalidaException ex)
        {
            try {
                throw new OperacionInvalidaException(ex.getMessage());
            } catch (OperacionInvalidaException ex1) {
                Logger.getLogger(ServicioCatalogoMock.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
        }
    }

    /**
     * Devuelve todos los muebles del sistema
     * @return muebles muebles del sistema
     */
    @Override
    public List<Mueble> darMuebles() {
        return persistencia.findAll(Mueble.class);
    }

    @Override
    public void removerEjemplarMueble(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
