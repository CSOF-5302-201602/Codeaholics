/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Producto;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author AOSORIO
 */
@ManagedBean
@SessionScoped
public class CarritoBean {

    ArrayList<Producto> productosCanasta;
    
    /**
     * Creates a new instance of CarritoBean
     */
    public CarritoBean() {
        productosCanasta= new ArrayList<Producto>();
    }
    
    public void listar() {
        
        
    }
    
    //redirecciona al servicio de pago
    public void pagar() {
                
    }
}
