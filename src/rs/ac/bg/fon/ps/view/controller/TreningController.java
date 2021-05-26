/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.Trener;
import rs.ac.bg.fon.ps.domain.Trening;
import rs.ac.bg.fon.ps.view.constant.Constants;
import rs.ac.bg.fon.ps.view.cordinator.MainCordinator;
import rs.ac.bg.fon.ps.view.form.FrmUnosTreninga;
import rs.ac.bg.fon.ps.view.form.util.FormMode;

/**
 *
 * @author USER
 */
public class TreningController {
    
    private final FrmUnosTreninga frmTrening;

    public TreningController(FrmUnosTreninga frmTrening) {
        this.frmTrening = frmTrening;
        addActionListeners();
    }

    private void addActionListeners() {
        frmTrening.addSaveBtnActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }

            private void save() {
                try {
                    Trening trening = new Trening();
                    trening.setTreningId(Long.parseLong(frmTrening.getjTxtTreningID().getText().trim()));
                    trening.setTrajanje(Double.parseDouble(frmTrening.getjTxtTrajanje().getText().trim()));
                    trening.setNapomena(frmTrening.getjTextNapomena().getText().trim());
                    trening.setDatumVreme(frmTrening.getjTxtDatum().getText().trim());
                    trening.setTrener((Trener)frmTrening.getjComboTrener().getSelectedItem());
                    
                    Controller.getInstance().addTrening(trening);
                    JOptionPane.showMessageDialog(frmTrening, "Trening je uspesno sacuvan!");
                    frmTrening.dispose();
                } catch (Exception ex) {
                    Logger.getLogger(TreningController.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(frmTrening, ex.getMessage());
                }
            }
        });
        
        frmTrening.addEnableChangesBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setupComponents(FormMode.FORM_EDIT);
            }
        });
        
        frmTrening.addCancelBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancel();
            }

            private void cancel() {
                frmTrening.dispose();
            }
        });
        
        frmTrening.addDeleteBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete();
            }

            private void delete() {
                Trening trening = makeTreningFromForm();
                try {
                    Controller.getInstance().deleteTrening(trening);
                    JOptionPane.showMessageDialog(frmTrening, "Trening je uspesno obrisan!\n", "Brisanje treninga", JOptionPane.INFORMATION_MESSAGE);
                    frmTrening.dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frmTrening, "Greska u brisanju treninga!\n" + ex.getMessage(), "Brisanje treninga", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(TreningController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        frmTrening.addEditBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edit();
            }

            private void edit() {
                Trening trening = makeTreningFromForm();
                try {
                    Controller.getInstance().editTrening(trening);
                    JOptionPane.showMessageDialog(frmTrening, "Trening je uspesno izmenjen!\n", "Izmena treninga", JOptionPane.INFORMATION_MESSAGE);
                    frmTrening.dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frmTrening, "Greska u izmeni treninga!\n" + ex.getMessage(), "Izmena treninga", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(TreningController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }
    
    public void openForm(FormMode formMode) {
        frmTrening.setLocationRelativeTo(MainCordinator.getInstance().getMainController().getFrmMain());
        prepareView(formMode);
        frmTrening.setVisible(true);
    }
    
    private void prepareView(FormMode formMode) {
        fillCbTrener();
        setupComponents(formMode);
    }
    
    private void fillCbTrener() {
        frmTrening.getjComboTrener().removeAllItems();
        List<Trener> treneri = Controller.getInstance().getAllTreneri();
        frmTrening.getjComboTrener().setModel(new DefaultComboBoxModel<>(treneri.toArray()));
    }
    
    private void setupComponents(FormMode formMode) {
        switch (formMode) {
            case FORM_ADD:
                frmTrening.getjBtnOdustani().setEnabled(true);
                frmTrening.getjBtnObrisi().setEnabled(false);
                frmTrening.getjBtnIzmene().setEnabled(false);
                frmTrening.getjBtnAzuriraj().setEnabled(false);
                frmTrening.getjBtnSacuvaj().setEnabled(true);

                frmTrening.getjTxtTreningID().setEnabled(true);
                frmTrening.getjTxtTrajanje().setEnabled(true);
                frmTrening.getjTxtDatum().setEnabled(true);
                frmTrening.getjTextNapomena().setEnabled(true);
                frmTrening.getjComboTrener().setEnabled(true);
                break;
            case FORM_VIEW:
                frmTrening.getjBtnOdustani().setEnabled(true);
                frmTrening.getjBtnObrisi().setEnabled(true);
                frmTrening.getjBtnIzmene().setEnabled(false);
                frmTrening.getjBtnAzuriraj().setEnabled(true);
                frmTrening.getjBtnSacuvaj().setEnabled(false);

                //zabrani izmenu vrednosti
                frmTrening.getjTxtTreningID().setEnabled(false);
                frmTrening.getjTxtTrajanje().setEnabled(false);
                frmTrening.getjTxtDatum().setEnabled(false);
                frmTrening.getjTextNapomena().setEnabled(false);
                frmTrening.getjComboTrener().setEnabled(false);

                //get trening
                Trening trening = MainCordinator.getInstance().getParam(Constants.PARAM_TRENING);
                frmTrening.getjTxtTreningID().setText(trening.getTreningId()+ "");
                frmTrening.getjTxtTrajanje().setText(trening.getTrajanje()+"");
                frmTrening.getjTxtDatum().setText(trening.getDatumVreme());
                frmTrening.getjTextNapomena().setText(trening.getNapomena());
                frmTrening.getjComboTrener().setSelectedItem(trening.getTrener());
                break;
            case FORM_EDIT:
                frmTrening.getjBtnOdustani().setEnabled(true);
                frmTrening.getjBtnObrisi().setEnabled(false);
                frmTrening.getjBtnIzmene().setEnabled(true);
                frmTrening.getjBtnAzuriraj().setEnabled(false);
                frmTrening.getjBtnSacuvaj().setEnabled(false);

                //zabrani izmenu vrednosti
                frmTrening.getjTxtTreningID().setEnabled(false);
                frmTrening.getjTxtTrajanje().setEnabled(true);
                frmTrening.getjTxtDatum().setEnabled(true);
                frmTrening.getjTextNapomena().setEnabled(true);
                frmTrening.getjComboTrener().setEnabled(true);
                break;
        }
    }
    
    private Trening makeTreningFromForm() {
        Trening trening = new Trening();
        trening.setTreningId(Long.parseLong(frmTrening.getjTxtTreningID().getText().trim()));
        trening.setTrajanje(Double.parseDouble(frmTrening.getjTxtTrajanje().getText().trim()));
        trening.setNapomena(frmTrening.getjTextNapomena().getText().trim());
        trening.setDatumVreme(frmTrening.getjTxtDatum().getText().trim());
        trening.setTrener((Trener) frmTrening.getjComboTrener().getSelectedItem());
        return trening;
    }
}
