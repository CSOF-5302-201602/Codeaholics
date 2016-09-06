/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.Producto;
import com.losalpes.servicios.IServicioCarrito;
import com.losalpes.servicios.ServicioCarritoMock;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author AOSORIO
 */
@ManagedBean
@SessionScoped
public class CarritoBean {
 
    private IServicioCarrito carrito;
    
    /**
     * Creates a new instance of CarritoBean
     */
    public CarritoBean() {
        
        carrito= new ServicioCarritoMock();
    }
    
    public List<Mueble> getProductos() { 
        
        return carrito.darProductos();       
    }
    
    //redirecciona al servicio de pago
    public void pagar() {
           
        carrito.pagar();       
    }
    
}
