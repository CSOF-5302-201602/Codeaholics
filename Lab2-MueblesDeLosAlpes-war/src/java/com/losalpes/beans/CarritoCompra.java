/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Mueble;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.component.datatable.DataTable;

/**
 *
 * @author am.cordoba1
 */
@SessionScoped
@ManagedBean
public class CarritoCompra {

    public CarritoCompra() {
    }

    public String guardarCompra() {
        FacesContext context = FacesContext.getCurrentInstance();
        DataTable dataTable = (DataTable) context.getViewRoot().findComponent("muebles");
        int cantidadMuebles = dataTable.getColumnsCount();
        for (int i = 0; i < cantidadMuebles; i++)
        {        
        Mueble temporal = (Mueble)dataTable.getRowData();
            System.out.println(temporal);
        }
        return "catalogo.xhtml";
    }

}
