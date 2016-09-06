/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.Producto;
import com.losalpes.servicios.IServicioCarrito;
import com.losalpes.servicios.IServicioProducto;
import com.losalpes.servicios.ServicioCarritoMock;
import com.losalpes.servicios.ServicioProductoMock;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

/**
 *
 * @author AOSORIO
 */
@ManagedBean
@SessionScoped
public class ProductoBean {

    private Producto producto;
    
    private IServicioCarrito carrito;
    
    private IServicioProducto catalogoProductos;
    
    
    /**
     * Creates a new instance of ProductoBean
     */
    public ProductoBean() {
        
        producto = new Producto();
        carrito = new ServicioCarritoMock();
        catalogoProductos = new ServicioProductoMock();

    }
    
    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
       
    public List<Mueble> getProductos() {
        return catalogoProductos.darProductos();
    }
    
    public void comprar(Mueble prod) {
        carrito.agregarProducto(prod); //Agregar al carrito de compras
        catalogoProductos.eliminarProducto(prod.getReferencia()); //Eliminar del catalogo de productos disponibles 
    }
    
    public void pagar() {
        
    }
    
    public String getCarrito() {
        

        
        return "";
        
    }
    
}
