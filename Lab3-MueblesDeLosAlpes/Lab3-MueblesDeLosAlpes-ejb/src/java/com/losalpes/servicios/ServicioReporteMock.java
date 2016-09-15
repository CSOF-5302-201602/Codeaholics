/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ ServicioReporteMock.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes 
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.servicios;

import com.losalpes.entities.Mueble;
import com.losalpes.entities.RegistroVenta;
import java.util.ArrayList;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Singleton;

/**
 * Implementacion de los servicios del reporte.
 * 
 */
@Singleton
public class ServicioReporteMock implements IServicioReporteMockLocal, IServicioReporteMockRemote {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    /**
     * Interface con referencia al servicio de persistencia en el sistema
     */
    @EJB
    private IServicioPersistenciaMockLocal persistencia;

    /**
     * Lista con los registros de las ventas por usuario
     */
    private ArrayList<RegistroVenta> registrosVentas;

    
    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------
    /**
     * Constructor sin argumentos de la clase
     */
    public ServicioReporteMock() {
        registrosVentas = new ArrayList<RegistroVenta>();
        //persistencia = new ServicioPersistenciaMock();
    }


    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------
    /**
     * Devuelve el reporte de las ventas en el mes
     *
     * @return ventasMes Lista con los muebles que se vendieron en el mes
     */
    @Override
    public ArrayList<RegistroVenta> getVentasMes() {
        return registrosVentas;
    }

}
