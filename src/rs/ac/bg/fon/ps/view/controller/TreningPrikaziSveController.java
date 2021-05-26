/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.Trening;
import rs.ac.bg.fon.ps.view.constant.Constants;
import rs.ac.bg.fon.ps.view.cordinator.MainCordinator;
import rs.ac.bg.fon.ps.view.form.FrmPrikazTreninga;
import rs.ac.bg.fon.ps.view.form.component.table.TreningTableModel;

/**
 *
 * @author USER
 */
public class TreningPrikaziSveController {
    
    private final FrmPrikazTreninga frmPrikaz;

    public TreningPrikaziSveController(FrmPrikazTreninga frmPrikaz) {
        this.frmPrikaz = frmPrikaz;
        addActionListener();
    }

    private void addActionListener() {
        frmPrikaz.getBtnDetailsAddActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int row = frmPrikaz.getjTable().getSelectedRow();
                if (row >= 0) {
                    Trening trening = ((TreningTableModel) frmPrikaz.getjTable().getModel()).getTreningAt(row);
                    MainCordinator.getInstance().addParam(Constants.PARAM_TRENING, trening);
                    MainCordinator.getInstance().openFrmDetaljiTreninga();
                } else {
                    JOptionPane.showMessageDialog(frmPrikaz, "Morate da izaberete trening", "Detalji treninga", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    public void openForm() {
        frmPrikaz.setLocationRelativeTo(MainCordinator.getInstance().getMainController().getFrmMain());
        prepareView();
        frmPrikaz.setVisible(true);
    }
    
    private void prepareView() {
        frmPrikaz.setTitle("Prikaz treninga");
        fillTblTrening();
    }
    
    private void fillTblTrening() {
        List<Trening> treninzi;
        try {
            treninzi = Controller.getInstance().getAllTrening();
            TreningTableModel ptm = new TreningTableModel(treninzi);
            frmPrikaz.getjTable().setModel(ptm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frmPrikaz, "Greska: " + ex.getMessage(), "ERROR DETAILS", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(TreningPrikaziSveController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void refresh() {
        fillTblTrening();
    }
}
