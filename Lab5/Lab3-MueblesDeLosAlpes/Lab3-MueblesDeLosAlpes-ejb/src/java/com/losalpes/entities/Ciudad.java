/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ Ciudad.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Clase que representa una ciudad en el sistema
 */
@Entity
public class Ciudad implements Serializable
{
      
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Nombre de la ciudad
     */
    @Id
    private String nombre;

    /**
     * Devuelve el nombre de la ciudad
     * @return nombre Nombre de la ciudad
     */
    public String getNombre()
    {
        return nombre;
    }

    //-----------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------

    /**
     * Constructor de la clase (sin argumentos)
     */
    public Ciudad()
    {

    }

    /**
     * Constructor de la clase (con argumentos)
     * @param nombre
     */
    public Ciudad(String nombre)
    {
        this.nombre = nombre;
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------

    /**
     * Modifica el nombre de la ciudad
     * @param nombre Nuevo nombre de la ciudad
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

}
