/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import anotaciones.RunAfter;
import anotaciones.RunBefore;

/**
 *
 * @author AOSORIO
 */
public interface ITestSvc {

    @RunBefore
    public void doLogin();
    
    @RunAfter
    public void giveAccess();

}
