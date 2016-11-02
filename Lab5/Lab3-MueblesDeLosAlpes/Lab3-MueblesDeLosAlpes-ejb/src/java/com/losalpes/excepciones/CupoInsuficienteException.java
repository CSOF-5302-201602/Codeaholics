/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.excepciones;

/**
 *
 * @author f.hernandez
 */
public class CupoInsuficienteException extends Exception {
    
        /**
     * Constructor de la clase.
     * @param mensaje Mensaje de la excepción
     */
    public CupoInsuficienteException( String mensaje ){
        super( mensaje );
    }
}
