/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.view.controller;

import java.awt.event.ActionEvent;
import rs.ac.bg.fon.ps.view.cordinator.MainCordinator;
import rs.ac.bg.fon.ps.view.form.FrmMain;

/**
 *
 * @author USER
 */
public class MainController {
    
    private final FrmMain frmMain;
    
    public MainController(FrmMain frmMain){
        this.frmMain = frmMain;
        addActionListener();
    }

    public void openForm(){
        frmMain.setVisible(true);
    }
    
    private void addActionListener() {
        frmMain.jmiTreningNoviActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                jmiTreningNoviActionPerformed(evt);
            }
            
            private void jmiTreningNoviActionPerformed(ActionEvent evt){
                MainCordinator.getInstance().openFrmUnosTreninga();
            }
        });
        frmMain.jmiTreningPrikaziSveActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                jmiTreningPrikaziSveActionPerformed(evt);
            }
            
            private void jmiTreningPrikaziSveActionPerformed(ActionEvent evt){
                MainCordinator.getInstance().openFrmPrikazTreninga();
            }
        });
    }
    
    public FrmMain getFrmMain(){
        return frmMain;
    }
}
