/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotaciones;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 *
 * @author aosorio
 * Logger singleton 
 * 
 */
public class Logger {
    // Atributos
	private static Logger instance = null;
	private static PrintWriter logFile = null;
	
        public static void Log(String pDate, Class claseRepresentada) {      
            String logInfo = pDate + " " + claseRepresentada.getName(); //+ " " + method.getName();
            System.out.println(logInfo);
            info(logInfo);
        }
        
	// Constructores
	protected Logger() {
            try {
                logFile = new PrintWriter("logger.txt", "UTF-8");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();   
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
               
	}

	// Metodos
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

        public static void info( String pInfo ) {
           logFile.println(pInfo);
           logFile.flush();
        }
        
}
