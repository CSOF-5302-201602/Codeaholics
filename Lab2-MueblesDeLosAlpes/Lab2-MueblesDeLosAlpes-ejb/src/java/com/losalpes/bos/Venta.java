/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

import java.util.Date;

/**
 *
 * @author aosorio
 */
public class Venta {
    
    //private Producto product;
    private Integer precio;
    private Integer cantidad;
    private String fechaGeneracion;
    private String fechaInicio;
    private String ciudad;

    public Venta(Integer precio, Integer cantidad, String fechaGeneracion, String fechaInicio, String ciudad) {
        
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaGeneracion = fechaGeneracion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
