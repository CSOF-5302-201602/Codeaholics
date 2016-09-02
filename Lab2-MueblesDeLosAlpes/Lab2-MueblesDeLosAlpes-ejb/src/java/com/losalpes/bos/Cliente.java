/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

/**
 *
 * @author f.hernandez
 */
public class Cliente {
    
    private TipoDocumento tipoDocumento;
    
    private Integer numeroDocumento;
    
    private String nombreCliente;
    
    private Integer telefonoResidencia;
    
    private Integer telefonoCelular;
    
    private String direccion;
    
    private String ciudad;
    
    private String departamento;
    
    private String pais;
    
    private String profesion;
    
    private String email;

    public Cliente(TipoDocumento tipoDocumento, Integer numeroDocumento, 
            String nombreCliente, Integer telefono, Integer celular, 
            String direccion, String ciudad, String departamento, 
            String pais, String profesion, String email) {
        
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.direccion = direccion;
        this.email = email;
        this.nombreCliente = nombreCliente;
        this.pais = pais;
        this.profesion = profesion;
        this.telefonoCelular = telefonoCelular;
        this.telefonoResidencia = telefonoResidencia;
 
    }
    public Cliente(){}

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getTelefonoResidencia() {
        return telefonoResidencia;
    }

    public void setTelefonoResidencia(Integer telefonoResidencia) {
        this.telefonoResidencia = telefonoResidencia;
    }

    public Integer getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(Integer telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
