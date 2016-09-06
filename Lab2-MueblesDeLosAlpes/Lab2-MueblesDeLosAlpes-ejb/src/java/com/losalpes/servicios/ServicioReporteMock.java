/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import static com.losalpes.bos.Datos.ventas;
import com.losalpes.bos.Mueble;
import com.losalpes.bos.Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f.hernandez
 */
public class ServicioReporteMock implements IServicioReporte {
    
    //private ArrayList<Reporte> clientes;
    
    public ServicioReporteMock()
    {
    
        ventas=new ArrayList<Venta>();  
        
   
        ventas.add(new Venta(1000, 2, "11/01/2016", "11/01/2016", "Bogota"));
        ventas.add(new Venta(1000, 2, "11/01/2016", "11/01/2016", "Bogota"));
        ventas.add(new Venta(1000, 2, "11/01/2016", "11/01/2016", "Bogota"));
    
    }

    public void agregarMueble(Mueble mueble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Mueble> darMuebles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Venta> darVentas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
