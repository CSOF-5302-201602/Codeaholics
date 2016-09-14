/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ $Id$
 * CarritoBean.java Universidad de los Andes (Bogotá - Colombia) Departamento de
 * Ingeniería de Sistemas y Computación Licenciado bajo el esquema Academic Free
 * License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.beans;

import com.losalpes.entities.RegistroVenta;
import com.losalpes.servicios.IServicioReporteMockLocal;
import com.losalpes.servicios.ServicioReporteMock;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 * Managed Bean encargado de mostrar el reporte de las ventas del último mes
 *
 */
public class ReporteBean implements Serializable {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    private List<RegistroVenta> registroventas;
    
    /**
     * Relación con la interfaz que provee los servicios de reporte
     */
    @EJB
    private IServicioReporteMockLocal servicioReporte;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------
    public ReporteBean() {
        servicioReporte = new ServicioReporteMock();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------
    /**
     * Retorna el reporte de las ventas
     */
    public List<RegistroVenta> getVentasUltimoMes() {
        return servicioReporte.getVentasMes();
    }

}
