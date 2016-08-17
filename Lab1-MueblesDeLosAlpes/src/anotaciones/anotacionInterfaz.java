/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Ejercicio: Taller 1 - anotaciones
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package anotaciones;

import java.lang.annotation.*;

/**
 * Cuando un método anotado con esta clase se ejecuta, los atributos de los tipos básicos quedan inicializados con los valores de esta anotación
 * Cuando se carga una clase anotada, los atributos de los tipos básicos quedan inicializados con los valores de esta anotación
 * Restricción: Para que esta anotación funcione se debe instanciar la entidad por medio del Driver
 * Sebastian Cardona Correa
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface anotacionInterfaz {
    
    String String() default "";
    double Double() default 0.0;
    int Integer() default 200;
    char Char() default '\0';
    boolean Boolean() default false;
    long Long() default -1;
    float Float() default 0;
    
}
