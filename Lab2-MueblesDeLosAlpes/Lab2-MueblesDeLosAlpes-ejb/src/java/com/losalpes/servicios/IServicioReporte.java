/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ IServicioCatalogo.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.servicios;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.Producto;
import com.losalpes.bos.Venta;
import java.util.List;


/**
 * Contrato funcional de los servicios que se le prestan al catálogo
 */
public interface IServicioReporte
{

    /**
     * Devuelve las ventas diarias por tipo de mueble
     * @return muebles Lista de muebles
     */
    public List<Venta> darVentas();
    
}
