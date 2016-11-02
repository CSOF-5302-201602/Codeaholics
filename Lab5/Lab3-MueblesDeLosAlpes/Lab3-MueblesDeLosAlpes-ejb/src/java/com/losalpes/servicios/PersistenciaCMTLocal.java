/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.excepciones.CupoInsuficienteException;
import javax.ejb.Local;

/**
 *
 * @author f.hernandez
 */
@Local
public interface PersistenciaCMTLocal {

    void comprar(String parameter) throws CupoInsuficienteException;
    
}
