/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Producto;
import java.util.List;

/**
 *
 * @author f.hernandez
 */
public interface IServicioProducto {

    public void agregarProducto(Producto producto);

    public void mostrarProducto( String referencia);

    public void actualizarProducto( String referencia);

    public void eliminarProducto( String referencia );

    public List<Producto> darProductos();

}
