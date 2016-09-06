/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.Producto;
import com.losalpes.bos.TipoMueble;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author f.hernandez
 */
public class ServicioProductoMock implements IServicioProducto {
    
    private ArrayList<Producto> productos;
    
    public ServicioProductoMock()
    {
    
        productos = new ArrayList<>();
        
        for( int i=0; i < 4; ++i ) {
            Mueble muebleX1 = new Mueble("RF1","Silla clásica","Una confortable silla con estilo del siglo XIX.",TipoMueble.Interior);
            muebleX1.setDimensiones("10x10x10");
            muebleX1.setMaterial("roble");
            muebleX1.setColor("natural");
            muebleX1.setPeso(50);
            muebleX1.setFoto("FotoX1.png");
            
            productos.add(muebleX1);
            
        }
              
    }

    @Override
    public void agregarProducto(Producto producto) {
       
    }

    @Override
    public void mostrarProducto(String referencia) {
       
    }

    @Override
    public void actualizarProducto(String referencia) {
        
    }

    @Override
    public void eliminarProducto(String referencia) {

        Iterator itr = productos.iterator();
        int index = 0;
        boolean found = false;
        while (itr.hasNext()) {
            Mueble mueble = (Mueble)itr.next();
            if( mueble.getReferencia().equals(referencia)) {
                found = true;
                break;
            }
            ++index;
        }
        
        if (found)
            productos.remove(index);
        
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

    
    
}
