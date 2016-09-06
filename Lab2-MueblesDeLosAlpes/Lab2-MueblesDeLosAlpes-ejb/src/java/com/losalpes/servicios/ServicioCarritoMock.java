/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AOSORIO
 */
public class ServicioCarritoMock implements IServicioCarrito {
    
     private ArrayList<Producto> productos;

     public ServicioCarritoMock() {
         productos = new ArrayList<Producto>();
         
         //productos.add(new Producto());
         
     }
     
    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public List<Producto> darProductos() {
        return productos;
    }

    @Override
    public void pagar() {
        
    }

    
    
}
