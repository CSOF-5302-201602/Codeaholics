
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f.hernandez
 */
public class ServicioProductoMock implements IServicioProducto {
    
    private ArrayList<Producto> productos;
    
    public ServicioProductoMock()
    {
    
        productos=new ArrayList<Producto>();
        
        productos.add(new Producto("material", "dimensiones", "color", 1232, "foto"));
    }

    @Override
    public void agregarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarProducto(String referencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarProducto(String referencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarProducto(String referencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> darProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
