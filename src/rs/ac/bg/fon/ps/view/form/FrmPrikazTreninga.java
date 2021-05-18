/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.view.form;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.Trener;
import rs.ac.bg.fon.ps.domain.Trening;
import rs.ac.bg.fon.ps.view.form.component.table.TreningTableModel;
import rs.ac.bg.fon.ps.view.form.util.FormMode;

/**
 *
 * @author USER
 */
public class FrmPrikazTreninga extends javax.swing.JDialog {

    /**
     * Creates new form FrmPrikazTreninga
     */
    public FrmPrikazTreninga(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        
        prepareView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTable = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonDetalji = new javax.swing.JButton();
        jButtonDodaj = new javax.swing.JButton();
        jButtonObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneTable.setViewportView(jTable);

        jButtonDetalji.setText("Detalji");
        jButtonDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetaljiActionPerformed(evt);
            }
        });

        jButtonDodaj.setText("Dodaj");
        jButtonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajActionPerformed(evt);
            }
        });

        jButtonObrisi.setText("Obrisi");
        jButtonObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDetalji)
                    .addComponent(jButtonDodaj)
                    .addComponent(jButtonObrisi))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonDetalji)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDodaj)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonObrisi)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetaljiActionPerformed
        
            //popuniti polja
            
            //ToDo izaberi proizvod
           
               try {
                   new FrmUnosTreninga(null, true, FormMode.FORM_VIEW).setVisible(true);
               } catch (Exception ex) {
                   Logger.getLogger(FrmPrikazTreninga.class.getName()).log(Level.SEVERE, null, ex);
               }

    }//GEN-LAST:event_jButtonDetaljiActionPerformed

    private void jButtonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajActionPerformed
        TreningTableModel ttm = (TreningTableModel) jTable.getModel();

        ttm.addTrening(new Trening());
    }//GEN-LAST:event_jButtonDodajActionPerformed

    private void jButtonObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObrisiActionPerformed
        int row = jTable.getSelectedRow();
        if (row >= 0) {

            try {
                //dialog da li ste sigurni!
                Trening trening = ((TreningTableModel)jTable.getModel()).getTreningAt(row);
                Controller.getInstance().deleteTrening(trening);
                this.dispose();
            } catch (Exception ex) {
                Logger.getLogger(FrmPrikazTreninga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Potrebno je da izaberete trening!");

        }
    }//GEN-LAST:event_jButtonObrisiActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetalji;
    private javax.swing.JButton jButtonDodaj;
    private javax.swing.JButton jButtonObrisi;
    private javax.swing.JScrollPane jScrollPaneTable;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

    private void prepareView() throws Exception {
        setLocationRelativeTo(null);
        setTitle("Pregled treninga");
        fillTbTr();
        fillTbTrTm();
    }

    private void fillTbTr() throws Exception {
        List<Trening> treninzi = Controller.getInstance().getAllTrening();
        
        //TreningTableModel ttm = new TreningTableModel(treninzi);
        
        //jTable.setModel(ttm);
        
        DefaultTableModel dtm = (DefaultTableModel) jTable.getModel(); 
        
        for (Trening trening : treninzi) {
            Object[] rowData = new Object[]{
                trening.getTreningId(),
                trening.getDatumVreme(),
                trening.getTrajanje(),
                trening.getTrener(),
                trening.getNapomena()
            };
            dtm.addRow(rowData);
        }
        
        /*String[] imenaKolona = new String[] {"Trening ID", "Datum i vreme", "Trajanje", "Trener", "Napomena"};
        DefaultTableModel dtm = new DefaultTableModel(imenaKolona, 0);
        
         for (Trening trening : treninzi) {
            Object[] rowData = new Object[]{
                trening.getTreningId(),
                trening.getDatumVreme(),
                trening.getTrajanje(),
                trening.getTrener(),
                trening.getNapomena()
            };
            dtm.addRow(rowData);
        }
         
        jTable.setModel(dtm); */
    }

    private void fillTbTrTm() throws Exception {
        List<Trening> treninzi = Controller.getInstance().getAllTrening();
        
        TreningTableModel ttm = new TreningTableModel(treninzi);
        jTable.setModel(ttm);

        
        List<Trener> listaTrenera = Controller.getInstance().getAllTreneri();
        JComboBox boxTreneri = new JComboBox(listaTrenera.toArray());
        
        TableColumnModel tcm = jTable.getColumnModel();
        TableColumn colTrener = tcm.getColumn(3);
        colTrener.setCellEditor(new DefaultCellEditor(boxTreneri));
    }
}
