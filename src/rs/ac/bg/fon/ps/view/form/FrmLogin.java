/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.view.form;

import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.Korisnik;

/**
 *
 * @author USER
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbKorisnickoIme = new javax.swing.JLabel();
        jTxtKorisnickoIme = new javax.swing.JTextField();
        jLbLozinka = new javax.swing.JLabel();
        jPfLozinka = new javax.swing.JPasswordField();
        jBtnUlogujSe = new javax.swing.JButton();
        jKorisnickoImeGreska = new javax.swing.JLabel();
        jLozinkaGreska = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forma za prijavljivanje");

        jLbKorisnickoIme.setText("Korisničko ime:");

        jTxtKorisnickoIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtKorisnickoImeActionPerformed(evt);
            }
        });

        jLbLozinka.setText("Lozinka:");

        jBtnUlogujSe.setText("Uloguj se");
        jBtnUlogujSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUlogujSeActionPerformed(evt);
            }
        });

        jKorisnickoImeGreska.setForeground(new java.awt.Color(255, 0, 0));

        jLozinkaGreska.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnUlogujSe)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLbLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLbKorisnickoIme, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jKorisnickoImeGreska, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtKorisnickoIme)
                            .addComponent(jPfLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLozinkaGreska, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbKorisnickoIme)
                    .addComponent(jTxtKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jKorisnickoImeGreska, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLbLozinka)
                    .addComponent(jPfLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLozinkaGreska, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBtnUlogujSe)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtKorisnickoImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtKorisnickoImeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtKorisnickoImeActionPerformed

    private void jBtnUlogujSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUlogujSeActionPerformed
        /*try {
            validateForm();
            Controller controller = Controller.getInstance();
            Korisnik korisnik = controller.login(jTxtKorisnickoIme.getText().trim(), String.valueOf(jPfLozinka.getPassword()));
            JOptionPane.showMessageDialog(this, "Dobro došli " + korisnik.getImePrezime() + " !", "Upešno logovanje!", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new FrmMain().setVisible(true);
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage(), "Greska prilikom logovanja!", JOptionPane.ERROR_MESSAGE);
        }*/
        
    }//GEN-LAST:event_jBtnUlogujSeActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void loginAddActionListener(ActionListener actionListener){
        jBtnUlogujSe.addActionListener(actionListener);
    }
    
    public JPasswordField getjPfLozinka() {
        return jPfLozinka;
    }

    public JTextField getjTxtKorisnickoIme() {
        return jTxtKorisnickoIme;
    }

    public void setjKorisnickoImeGreska(JLabel jKorisnickoImeGreska) {
        this.jKorisnickoImeGreska = jKorisnickoImeGreska;
    }

    public JLabel getjLbLozinka() {
        return jLbLozinka;
    }

    public void setjPfLozinka(JPasswordField jPfLozinka) {
        this.jPfLozinka = jPfLozinka;
    }

    public JLabel getjLbKorisnickoIme() {
        return jLbKorisnickoIme;
    }

    public void setjTxtKorisnickoIme(JTextField jTxtKorisnickoIme) {
        this.jTxtKorisnickoIme = jTxtKorisnickoIme;
    }
   
    public JLabel getjKorisnickoImeGreska() {
        return jKorisnickoImeGreska;
    }

    public JLabel getjLozinkaGreska() {
        return jLozinkaGreska;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnUlogujSe;
    private javax.swing.JLabel jKorisnickoImeGreska;
    private javax.swing.JLabel jLbKorisnickoIme;
    private javax.swing.JLabel jLbLozinka;
    private javax.swing.JLabel jLozinkaGreska;
    private javax.swing.JPasswordField jPfLozinka;
    private javax.swing.JTextField jTxtKorisnickoIme;
    // End of variables declaration//GEN-END:variables

    
    
    /*private void validateForm() throws Exception {
        
        jKorisnickoImeGreska.setText("");
        jLozinkaGreska.setText("");
        
        String errorMes = "";
        String korisnickoIme = jTxtKorisnickoIme.getText().trim();
        String lozinka = String.valueOf(jPfLozinka.getPassword());
        
        if (korisnickoIme.isEmpty()) {
            jKorisnickoImeGreska.setText("Korisničko ime mora biti uneto!");
            errorMes += "Polje korisničko ime ne sme biti prazno! ";
        }
        
        if (lozinka.isEmpty()) {
            jLozinkaGreska.setText("Lozinka mora biti uneta!");
            errorMes += "Polje lozinka ne sme biti prazno!";
        }
        
        if (!errorMes.isEmpty()) {
            throw new Exception(errorMes);
        }
        
    }*/
}
