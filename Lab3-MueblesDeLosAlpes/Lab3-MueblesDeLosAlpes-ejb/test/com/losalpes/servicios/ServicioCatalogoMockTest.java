/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.entities.Mueble;
import java.util.List;
import java.util.Properties;
import javax.naming.InitialContext;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author aosorio
 */
public class ServicioCatalogoMockTest {

    private IServicioCatalogoMockRemote servicioRemoto;

    @Before
    public void setUp() throws Exception {
        try {

            Properties env = new Properties();
            env.put("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            env.put("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            env.put("org.omg.CORBA.ORBInitialPort", "3700");
            InitialContext contexto;
            contexto = new InitialContext(env);
            servicioRemoto = (IServicioCatalogoMockRemote) contexto.lookup("com.losalpes.servicios.IServicioCatalogoMockRemote");

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Test
    public void testCatalogo() throws Exception {

        List<Mueble> muebles = servicioRemoto.darMuebles();
        
        if (muebles.size() < 8) {
            throw new Exception("No se obtiene el correcto numero de muebles");
        }

    }

    @Test
    public void testAgregar() throws Exception {

        try {
            Mueble mueble = new Mueble();
            servicioRemoto.agregarMueble(mueble);
        } catch (Exception e) {
            throw e;
        }

    }

    @Test
    public void testEliminar() throws Exception {

        try {
            servicioRemoto.eliminarMueble(1L);
        } catch (Exception e) {
            throw e;
        }
    }

}
