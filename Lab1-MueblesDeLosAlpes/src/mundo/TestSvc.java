/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import interfaces.ITestSvc;

/**
 *
 * @author AOSORIO
 */
public class TestSvc implements ITestSvc {

    boolean hasLogon = false;

    public void doLogin() {
        System.out.println("Please log on to system Muebles Los Alpes");
    }

    public void giveAccess() {
        if (hasLogon) {
            System.out.println("Ok ... you have access");
        }
    }

}
