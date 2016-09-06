/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Cliente;
import com.losalpes.bos.TipoDocumento;
import com.losalpes.servicios.IServicioCarrito;
import javax.faces.bean.ManagedBean;
import com.losalpes.servicios.IServicioCliente;
import com.losalpes.servicios.ServicioCarritoMock;
import com.losalpes.servicios.ServicioClienteMock;
import java.util.List;
import javax.faces.model.SelectItem;

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    /**
     * Relación con la interfaz que provee los servicios necesarios del cliente.
     */
    private IServicioCliente serviceCliente;
    
    private IServicioCarrito carritoCliente;
    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
        this.serviceCliente = new ServicioClienteMock();
        this.carritoCliente = new ServicioCarritoMock();
        this.cliente = new Cliente();
    }
    
    
    
     /**
     * Agrega un nuevo mueble al sistema
     */
    public void agregarCliente()
    {
        this.serviceCliente.agregarCliente(this.cliente);
        this.cliente = new Cliente();
    }
    
    /**
     * Metodo encargado de limpiar los clientes
     */
    public void limpiar(){
        this.cliente = new Cliente();
    }
    /**
     * Metodo que expone los clientes que tiene el sistema.
     * @return Una lista de clientes
     */
    public List<Cliente> getClientes(){
              return this.serviceCliente.darClientes();
      
    }
    
    /**
     * Devuelve los tipos de muebles
     * @return sitems Tipos de muebles en el sistema
     */
    public SelectItem[] getTiposDocumentos()
    {
        TipoDocumento[] tipos=  TipoDocumento.values();
        SelectItem[] sitems = new SelectItem[tipos.length];
        
        for (int i = 0; i < sitems.length; i++)
        {
             sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }

    
}
