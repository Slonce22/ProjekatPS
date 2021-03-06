/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.view.form;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.Trener;
import rs.ac.bg.fon.ps.domain.Trening;
import rs.ac.bg.fon.ps.view.form.util.FormMode;

/**
 *
 * @author USER
 */
public class FrmUnosTreninga extends javax.swing.JDialog {

    /**
     * Creates new form FrmUnosTreningaNovo
     */
    public FrmUnosTreninga(java.awt.Frame parent, boolean modal, FormMode formMode) throws Exception {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        prepareView(formMode);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnAzuriraj = new javax.swing.JButton();
        jBtnIzmene = new javax.swing.JButton();
        jBtnObrisi = new javax.swing.JButton();
        jBtnOdustani = new javax.swing.JButton();
        jBtnSacuvaj = new javax.swing.JButton();
        jLbDatum = new javax.swing.JLabel();
        jLbNapomena = new javax.swing.JLabel();
        jTxtDatum = new javax.swing.JTextField();
        jLbErDatum = new javax.swing.JLabel();
        jLbTreningID = new javax.swing.JLabel();
        jTxtTreningID = new javax.swing.JTextField();
        jLbErIdTreninga = new javax.swing.JLabel();
        jLbTrajanje = new javax.swing.JLabel();
        jTxtTrajanje = new javax.swing.JTextField();
        jLbErTrajanje = new javax.swing.JLabel();
        jLbTrener = new javax.swing.JLabel();
        jComboTrener = new javax.swing.JComboBox();
        jLbErTrener = new javax.swing.JLabel();
        jScrollPaneNapomena = new javax.swing.JScrollPane();
        jTextNapomena = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnAzuriraj.setText("Azuriraj");

        jBtnIzmene.setText("Izmeni");
        jBtnIzmene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIzmeneActionPerformed(evt);
            }
        });

        jBtnObrisi.setText("Obrisi");

        jBtnOdustani.setText("Odustani");
        jBtnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOdustaniActionPerformed(evt);
            }
        });

        jBtnSacuvaj.setText("Sacuvaj");
        jBtnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSacuvajActionPerformed(evt);
            }
        });

        jLbDatum.setText("Datum: ");

        jLbNapomena.setText("Napomena:");

        jLbTreningID.setText("TreningID: ");

        jLbTrajanje.setText("Trajanje:");

        jTxtTrajanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTrajanjeActionPerformed(evt);
            }
        });

        jLbTrener.setText("Trener:");

        jTextNapomena.setColumns(20);
        jTextNapomena.setRows(5);
        jScrollPaneNapomena.setViewportView(jTextNapomena);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnAzuriraj, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbNapomena)
                            .addComponent(jLbTreningID)
                            .addComponent(jLbTrajanje)
                            .addComponent(jLbTrener)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLbDatum)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneNapomena, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIzmene, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLbErTrener, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLbErIdTreninga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLbErTrajanje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtTrajanje, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboTrener, javax.swing.GroupLayout.Alignment.TRAILING, 0, 393, Short.MAX_VALUE))
                        .addComponent(jTxtTreningID, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTxtDatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                        .addComponent(jLbErDatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbDatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbErDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtTreningID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbTreningID))
                .addGap(7, 7, 7)
                .addComponent(jLbErIdTreninga, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbTrajanje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbErTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboTrener, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbTrener))
                .addGap(10, 10, 10)
                .addComponent(jLbErTrener, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbNapomena)
                    .addComponent(jScrollPaneNapomena, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSacuvaj)
                    .addComponent(jBtnAzuriraj)
                    .addComponent(jBtnIzmene)
                    .addComponent(jBtnObrisi)
                    .addComponent(jBtnOdustani))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtTrajanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTrajanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTrajanjeActionPerformed

    private void jBtnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSacuvajActionPerformed
        try {
            validateForm();
            Trening trening = new Trening();
        
            trening.setTreningId(Long.parseLong(jTxtTreningID.getText().trim()));
            trening.setNapomena(jTextNapomena.getText().trim());
            trening.setTrajanje(Double.parseDouble(jTxtTrajanje.getText().trim()));
            trening.setTrener((Trener) jComboTrener.getSelectedItem());
            trening.setDatumVreme(jTxtDatum.getText().trim());
        
            Controller.getInstance().addTrening(trening);
        
            JOptionPane.showMessageDialog(this, "Trening je uspesno zakazan!", "Dodat trening", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nisu pravilno uneta jedno ili sva polja", "Neuspesno zakazivanje treninga", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnSacuvajActionPerformed

    private void jBtnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnOdustaniActionPerformed

    private void jBtnIzmeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIzmeneActionPerformed
        
            try {
                new FrmUnosTreninga(null, true, FormMode.FORM_EDIT).setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(FrmUnosTreninga.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jBtnIzmeneActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAzuriraj;
    private javax.swing.JButton jBtnIzmene;
    private javax.swing.JButton jBtnObrisi;
    private javax.swing.JButton jBtnOdustani;
    private javax.swing.JButton jBtnSacuvaj;
    private javax.swing.JComboBox jComboTrener;
    private javax.swing.JLabel jLbDatum;
    private javax.swing.JLabel jLbErDatum;
    private javax.swing.JLabel jLbErIdTreninga;
    private javax.swing.JLabel jLbErTrajanje;
    private javax.swing.JLabel jLbErTrener;
    private javax.swing.JLabel jLbNapomena;
    private javax.swing.JLabel jLbTrajanje;
    private javax.swing.JLabel jLbTrener;
    private javax.swing.JLabel jLbTreningID;
    private javax.swing.JScrollPane jScrollPaneNapomena;
    private javax.swing.JTextArea jTextNapomena;
    private javax.swing.JTextField jTxtDatum;
    private javax.swing.JTextField jTxtTrajanje;
    private javax.swing.JTextField jTxtTreningID;
    // End of variables declaration//GEN-END:variables

    private void prepareView(FormMode formMode) throws Exception {
        fillComboTreneri();
        setupComponents(formMode);
    }

    private void fillComboTreneri() throws Exception {
        jComboTrener.removeAllItems();
       
       List <Trener> treneri = Controller.getInstance().getAllTreneri();
       for (Trener trener : treneri) {
           jComboTrener.addItem(trener);
       }
    }

    private void setupComponents(FormMode formMode) {
        switch(formMode) {
            case FORM_ADD:
                jBtnSacuvaj.setVisible(true);
                jBtnObrisi.setEnabled(false);
                jBtnOdustani.setVisible(true);
                jBtnIzmene.setEnabled(false);
                jBtnAzuriraj.setEnabled(false);
                break;
            case FORM_VIEW:
                jBtnSacuvaj.setEnabled(false);
                jBtnObrisi.setVisible(true);
                jBtnOdustani.setVisible(true);
                jBtnIzmene.setVisible(true);
                jBtnAzuriraj.setEnabled(false);
                
                jTxtTreningID.setEditable(false);
                jTxtDatum.setEditable(false);
                jTxtTrajanje.setEditable(false);
                jTextNapomena.setEditable(false);
                jComboTrener.setEditable(false);
                break;
            case FORM_EDIT:
                jBtnSacuvaj.setVisible(true);
                jBtnObrisi.setEnabled(false);
                jBtnOdustani.setVisible(true);
                jBtnIzmene.setEnabled(false);
                jBtnAzuriraj.setVisible(true);

                jTxtTreningID.setEnabled(false);
                jTxtDatum.setEnabled(false);
                jTextNapomena.setEnabled(false);
                break;
        }
    }

    private void validateForm() throws Exception {
        jLbErIdTreninga.setText("");
        jLbErDatum.setText("");
        jLbErTrajanje.setText("");
        jLbErTrener.setText("");
        
        String errorMes = "";
        
        String idTreninga = jTxtTreningID.getText().trim();
        String datum = jTxtDatum.getText().trim();
        String trajanje = jTxtTrajanje.getText().trim();
        Trener trener = (Trener) jComboTrener.getSelectedItem();
        
        if (idTreninga.isEmpty()) {
            jLbErIdTreninga.setText("Polje za ID treninga mora biti uneto!");
            errorMes += "Nije uneto polje za ID!";
        }
        
        if (datum.isEmpty()) {
            jLbErDatum.setText("Polje za datum i vreme mora biti uneto!");
            errorMes += "Nije uneto polje za datum i vreme";
        }
        
        if (trajanje.isEmpty()) {
            jLbErTrajanje.setText("Polje za trajanje treninga mora biti uneto!");
            errorMes += "Nije uneto polje za trajanje treninga";
        }
        
        if (trener == null) {
            jLbErTrener.setText("Trener mora biti izabran!");
            errorMes += "Nije izabran trener";
        }
        
        if (!errorMes.isEmpty()) {
            throw new Exception(errorMes);
        }
    }
}
