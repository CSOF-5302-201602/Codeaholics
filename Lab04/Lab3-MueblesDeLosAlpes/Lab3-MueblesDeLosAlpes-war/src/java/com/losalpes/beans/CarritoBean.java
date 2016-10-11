/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ CarritoBean.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.beans;

import com.losalpes.entities.Mueble;
import com.losalpes.entities.Usuario;
import com.losalpes.servicios.IServicioCarritoMockLocal;
import com.losalpes.servicios.IServicioCatalogoMockLocal;
import com.losalpes.servicios.ServicioCarritoMock;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.event.DragDropEvent;

/**
 * Managed Bean encargado del carrito de compras del cliente
 * 
 */
public class CarritoBean implements Serializable
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Relación con la interfaz que provee los servicios necesarios del carrito de compras
     */
    @EJB
    private IServicioCarritoMockLocal carrito;

    /**
     * Relación con la interfaz que provee los servicios necesarios del catálogo.
     */
    @EJB
    private IServicioCatalogoMockLocal catalogo;
    
    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor sin argumentos de la clase
     */
    public CarritoBean()
    {
        //Incializa los servicios
        carrito=new ServicioCarritoMock();
        
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------

    /**
     * Devuelve todos los muebles del sistema
     * @return muebles Lista con todos los muebles del sistema
     */
    public List<Mueble> getMuebles()
    {
        return catalogo.darMuebles();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Remueve un item del carrito
     * @param evento Evento que tiene como parámetro el ID del mueble
     */
    public void removerItemCarrito(ActionEvent evento)
    {
        // Obtiente el ID del mueble
        FacesContext context = FacesContext.getCurrentInstance();
        Map map = context.getExternalContext().getRequestParameterMap();
        int inventoryId = Integer.parseInt((String) map.get("muebleId"));
       

        Mueble item;
        for (int i = 0, max = carrito.getInventario().size(); i < max; i++)
        {
            item = (Mueble) carrito.getInventario().get(i);
            if (item.getReferencia() == inventoryId)
            {
                carrito.removerItem(item, true);
                break;
            }
        }
    }
    
     /**
     * Agrega un item al carrito de compras
     * @param ddEvent Evento que contiene el valor del mueble
     */
    public void agregarItemCarrito(DragDropEvent ddEvent) {
        Mueble mueble = ((Mueble) ddEvent.getData());
        carrito.agregarItem(mueble);
    }

    /**
     * Realiza una compra basado en los items del carrito
     */
    public void comprar()
    {
        if (FacesContext.getCurrentInstance().getExternalContext().getSessionMap().containsKey("loginBean"))
        {
            LoginBean sessionSecurity = (LoginBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("loginBean");
            Usuario user = sessionSecurity.getSesion();
            if (user != null)
            {
                carrito.comprar(user);
            }
            destroyBean();
        }
    }

    /**
     * Devuelve el precio total del inventario
     * @return precioTotal Precio total
     */
    public double getPrecioTotal()
    {
        return carrito.getPrecioTotalInventario();
    }

    /**
     * Devuelve el total de unidades en el carrito
     * @return totalUnidades Total de unidades en el carrito
     */
    public int getTotalUnidades()
    {
        return carrito.getTotalUnidades();
    }

    /**
     * Devuelve la lista con los muebles que se encuentran en el carrito
     * @return inventario Lista con los muebles del carrito
     */
    public List<Mueble> getInventario()
    {
        return carrito.getInventario();
    }

    /**
     * Remueve el presente bean de la sesión en curso
     */
    public void destroyBean()
    {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("carritoBean");
    }
    
}
