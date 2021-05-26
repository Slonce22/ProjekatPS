/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.main;

//import rs.ac.bg.fon.ps.view.form.FrmLogin;
import rs.ac.bg.fon.ps.view.cordinator.MainCordinator;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        MainCordinator.getInstance().openLoginForm();
        //new FrmLogin().setVisible(true);
    }
}
