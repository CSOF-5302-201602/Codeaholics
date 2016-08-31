
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
    
        clientes=new ArrayList<Cliente>();
        
        clientes.add(new Cliente(TipoDocumento.CC, 123456, "Foo Bar", 123456, 123456, "Calle tal carrera tal", "Sogamoso", "Boyaca", "CO", "Profesion", "foo@bar.net" ));
    }

    @Override
    public void agregarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarCliente(Integer numeroDocumento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarCliente(Integer numeroDocumento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarCliente(Integer numeroDocumento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> darClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
