/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ IServicioReporteMockRemote.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.servicios;

import com.losalpes.entities.RegistroVenta;
import java.util.ArrayList;
import javax.ejb.Remote;

/**
 * Contrato funcional del servicio de reporte de ventas en el mes
 * 
 */
@Remote
public interface IServicioReporteMockRemote {
    /**
     * Devuelve el listado de las ventas del mes
     *
     * @return ventas Lista con las ventas del mes
     */
    public ArrayList<RegistroVenta> getVentasMes();

}
