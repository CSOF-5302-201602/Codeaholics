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
public class PersistenciaBMT implements PersistenciaBMTLocal {

    @Override
    public void comprar(Integer valor, Integer tarjeta) throws CupoInsuficienteException {
    }
}
