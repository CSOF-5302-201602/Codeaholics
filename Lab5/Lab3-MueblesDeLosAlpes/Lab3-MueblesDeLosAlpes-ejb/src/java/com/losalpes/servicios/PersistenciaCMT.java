/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.excepciones.CupoInsuficienteException;
import javax.ejb.Stateless;

/**
 *
 * @author f.hernandez
 */
@Stateless
public class PersistenciaCMT implements PersistenciaCMTLocal {

    public void comprar(Integer valor, Integer tarjeta) throws CupoInsuficienteException {
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void comprar(String parameter) throws CupoInsuficienteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
