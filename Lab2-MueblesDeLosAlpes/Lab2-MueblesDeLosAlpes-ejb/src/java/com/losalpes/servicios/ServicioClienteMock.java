/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import com.losalpes.bos.TipoDocumento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f.hernandez
 */
public class ServicioClienteMock implements IServicioCliente {
    
    private ArrayList<Cliente> clientes;
    
    public ServicioClienteMock()
    {
    
        clientes=new ArrayList<Cliente>();      
        clientes.add(new Cliente(TipoDocumento.CC, 123456, "Foo Bar", 123456, 123456, "Calle tal carrera tal", "Sogamoso", "Boyaca", "CO", "Profesion", "foo@bar.net" ));
    
    }

    @Override
    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
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
        return this.clientes;
    }
    
}
