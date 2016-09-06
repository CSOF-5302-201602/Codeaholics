/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.Producto;
import java.util.List;

/**
 *
 * @author AOSORIO
 */
public interface IServicioCarrito {
    
        /**
     * Agrega un producto al carrito
     * @param producto Nuevo producto
     */
    public void agregarProducto(Producto producto);

    /**
     * Devuelve todos los muebles del sistema
     * @return muebles Lista de muebles
     */
    public List<Producto> darProductos();
    
    /**
     * Redirecciona al servicio de pago en linea
     */
    public void pagar();
    
}
