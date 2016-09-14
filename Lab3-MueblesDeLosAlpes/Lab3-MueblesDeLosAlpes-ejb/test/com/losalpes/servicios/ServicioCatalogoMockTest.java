/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import java.util.Properties;
import javax.naming.InitialContext;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author aosorio
 */
public class ServicioCatalogoMockTest {
    
    private IServicioCatalogoMockLocal servicioLocal;
    private IServicioCatalogoMockRemote servicioRemoto;
    
    @Before
    public void setUp() throws Exception
    {
        try
        {
            Properties env = new Properties();
            env.put("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            env.put("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            env.put("org.omg.CORBA.ORBInitialPort", "3700");
            InitialContext contexto;
            contexto = new InitialContext(env);
            
            servicioLocal = (IServicioCatalogoMockLocal) contexto.lookup("com.losalpes.servicios.IServicioCatalogoMockLocal");
            servicioRemoto = (IServicioCatalogoMockRemote) contexto.lookup("com.losalpes.servicios.IServicioCatalogoMockRemote");
  
            
        } 
        catch (Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

    @Test
    public void testCatalogoLocal() throws Exception
    {
        
    }
    
    @Test
    public void testCatalogoRemoto() throws Exception
    {
        
    }
    
}