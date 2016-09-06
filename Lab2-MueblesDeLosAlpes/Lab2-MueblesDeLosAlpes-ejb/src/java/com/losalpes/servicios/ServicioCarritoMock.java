/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author AOSORIO
 */
public class ServicioCarritoMock implements IServicioCarrito {
    
     private ArrayList<Producto> productos;

     public ServicioCarritoMock() {
         productos = new ArrayList<Producto>();         
     }
     
    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public List<Mueble> darProductos() {
        
        List<Mueble> muebles = new ArrayList<>();
        Iterator itr = productos.iterator();
        
        while (itr.hasNext()) {
            muebles.add( (Mueble)itr.next());
        }
        
        return muebles;
        
    }

    @Override
    public void pagar() {
        
    }

    
    
}
