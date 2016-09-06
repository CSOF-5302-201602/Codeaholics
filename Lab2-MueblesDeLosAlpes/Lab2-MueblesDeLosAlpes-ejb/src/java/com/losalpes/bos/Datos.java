/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

import java.util.ArrayList;

/**
 *
 * @author AOSORIO
 * 
 * Datos: create a single instance of all of these data objects
 * 
 * Implementations: in future these objects will be stored in a DB
 * 
 */
public class Datos {

    public static ArrayList<Mueble> muebles = new ArrayList<Mueble>();

    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 

    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public static ArrayList<Producto> productos = new ArrayList<Producto>();

    public static ArrayList<Venta> ventas = new ArrayList<Venta>();

    public static ArrayList<Compras> compras = new ArrayList<Compras>();
    
    public static ArrayList<Despachos> despachos = new ArrayList<Despachos>();
    

}
