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
public class Producto {

    private String material;

    private String dimensiones;

    private String color;

    private Integer peso;

    private String foto;

    public Producto() {

    }

    public Producto(String material, String dimensiones,
            String color, Integer peso, String foto) {

        this.material = material;
        this.dimensiones = dimensiones;
        this.color = color;
        this.peso = peso;

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }    

}
