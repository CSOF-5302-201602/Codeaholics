/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ IServicioReporteMockLocal.java
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
import javax.ejb.Local;

/**
 * Contrato funcional de los servicios para el carrito de compras
 * 
 */
@Local
public interface IServicioReporteMockLocal {
    /**
     * Devuelve el listado de las ventas del mes
     *
     * @return ventas Lista con las ventas del mes
     */
    public ArrayList<RegistroVenta> getVentasMes();

}
