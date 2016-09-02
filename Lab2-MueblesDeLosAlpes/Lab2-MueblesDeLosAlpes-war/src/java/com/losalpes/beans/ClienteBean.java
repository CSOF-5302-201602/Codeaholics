/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Cliente;
import javax.faces.bean.ManagedBean;
import com.losalpes.servicios.IServicioCliente;
import com.losalpes.servicios.ServicioClienteMock;
import java.util.List;

/**
 * Beans encargado de gestionar los clientes.
 * @author sebascardonac11
 */
@ManagedBean
public class ClienteBean {

    
     /**
     * Representa un nuevo cliente a ingresar
     */
    private Cliente cliente;
    
    /**
     * Relación con la interfaz que provee los servicios necesarios del cliente.
     */
    private IServicioCliente serviceCliente;
    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
        this.serviceCliente = new ServicioClienteMock();
    }
    
    
    
     /**
     * Agrega un nuevo mueble al sistema
     */
    public void agregarCliente()
    {
        this.serviceCliente.agregarCliente(new Cliente());
    }
    
    /**
     * Metodo que expone los clientes que tiene el sistema.
     * @return Una lista de clientes
     */
    public List<Cliente> getClientes(){
              return this.serviceCliente.darClientes();
      
    }
    
}
