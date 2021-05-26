/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.Korisnik;
import rs.ac.bg.fon.ps.view.constant.Constants;
import rs.ac.bg.fon.ps.view.cordinator.MainCordinator;
import rs.ac.bg.fon.ps.view.form.FrmLogin;
import rs.ac.bg.fon.ps.view.form.FrmMain;

/**
 *
 * @author USER
 */
public class LoginController {
    
    private final FrmLogin frmLogin;
    
    public LoginController(FrmLogin frmLogin) {
        this.frmLogin = frmLogin;
        addActionListener();
    }
    
    public void openForm() {
        frmLogin.setVisible(true);
    }

    private void addActionListener() {
        frmLogin.loginAddActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    loginUser(actionEvent);
                }
                
                private void loginUser(ActionEvent actionEvent){
                    resetForm();
                    /*try{
                        String username = frmLogin.getjTxtKorisnickoIme().getText().trim();
                        String password = String.copyValueOf(frmLogin.getjPfLozinka().getPassword());
                        validateForm(username, password);
                        
                        Korisnik korisnik = Controller.getInstance().login(username, password);
                        JOptionPane.showMessageDialog(frmLogin, 
                                "Dobrodošli " + korisnik.getImePrezime(),
                                "Login", JOptionPane.INFORMATION_MESSAGE);
                        frmLogin.dispose();
                        
                        MainCordinator.getInstance().openMainForm();
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(frmLogin, e.getMessage(), "Login error", JOptionPane.);
                    }*/
                    try {
                        String username = frmLogin.getjTxtKorisnickoIme().getText().trim();
                        String password = String.copyValueOf(frmLogin.getjPfLozinka().getPassword());
                        validateForm(username, password);
                        Controller controller = Controller.getInstance();
                        Korisnik korisnik = controller.login(frmLogin.getjTxtKorisnickoIme().getText().trim(), String.valueOf(frmLogin.getjPfLozinka().getPassword()));
                        JOptionPane.showMessageDialog(frmLogin, "Dobro došli " + korisnik.getImePrezime() + " !", "Upešno logovanje!", JOptionPane.INFORMATION_MESSAGE);
                        frmLogin.dispose();
                        MainCordinator.getInstance().addParam(Constants.CURRENT_USER, korisnik);
                        MainCordinator.getInstance().openMainForm();
                    } catch (Exception e) {
                        //System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog(frmLogin, e.getMessage(), "Greska prilikom logovanja!", JOptionPane.ERROR_MESSAGE);
                    }
                }
                
                private void resetForm() {
                    frmLogin.getjKorisnickoImeGreska().setText("");
                    frmLogin.getjLozinkaGreska().setText("");
                }
                
                private void validateForm(String username, String password) throws Exception {
                String errorMessage = "";
                if (username.isEmpty()) {
                    frmLogin.getjKorisnickoImeGreska().setText("Korisnicko ime mora biti uneto!");
                    errorMessage += "Korisnicko ime mora biti uneto!\n";
                }
                if (password.isEmpty()) {
                    frmLogin.getjLozinkaGreska().setText("Lozinka ne mora biti uneta!");
                    errorMessage += "Lozinka ne mora biti uneta!\n";
                }
                if (!errorMessage.isEmpty()) {
                    throw new Exception(errorMessage);
                }
            }
        });
    }
}
