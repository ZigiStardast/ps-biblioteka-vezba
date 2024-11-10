/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.Controller;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author LENOVO
 */
public class FormaKnjiga extends javax.swing.JDialog {
    private Controller controller;
    private GlavnaForma gf;
    private Knjiga knjigaZaIzmenu;
    /**
     * Creates new form FormaKnjiga
     */
    public FormaKnjiga(java.awt.Frame parent, boolean modal, Knjiga knjigaZaIzmenu) {
        super(parent, modal);
        initComponents();
        gf = (GlavnaForma) parent;
        controller = Controller.getInstance();
        setLocation(50, 50);
        popuniComboBoxAutorima();
        
        if (knjigaZaIzmenu != null) {
            this.knjigaZaIzmenu = knjigaZaIzmenu;
            txtFieldNaziv.setText(knjigaZaIzmenu.getNaslov());
            comboAutor.setSelectedItem(knjigaZaIzmenu.getAutor());
            txtFieldIsbn.setText(knjigaZaIzmenu.getISBN());
            comboZanr.setSelectedItem(knjigaZaIzmenu.getZanr());
            txtFieldGodinaIzdanja.setText(String.valueOf(knjigaZaIzmenu.getGodinaIzdanja()));
            btnDodaj.setVisible(false);
            
            txtFieldIsbn.setEditable(false);
        }
        else {
            btnIzmeni.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFieldNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFieldIsbn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboAutor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtFieldGodinaIzdanja = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnOdustani = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboZanr = new javax.swing.JComboBox<>();
        btnIzmeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naziv:");

        jLabel2.setText("ISBN:");

        jLabel3.setText("Autor:");

        jLabel4.setText("Godina izdanja:");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        jLabel5.setText("Zanr:");

        comboZanr.setModel(new DefaultComboBoxModel(Zanr.values()));

        btnIzmeni.setText("Izmeni");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFieldNaziv)
                                .addComponent(txtFieldIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                            .addComponent(comboAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldGodinaIzdanja, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnIzmeni)
                        .addGap(18, 18, 18)
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOdustani)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFieldGodinaIzdanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnOdustani)
                    .addComponent(btnIzmeni))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        // TODO add your handling code here:
        
        String naslov = txtFieldNaziv.getText();
        Autor autor = (Autor) comboAutor.getSelectedItem();
        String ISBN = txtFieldIsbn.getText();
        Zanr zanr = (Zanr) comboZanr.getSelectedItem();
        int godinaIzdanja;
        try {
        godinaIzdanja = Integer.parseInt(txtFieldGodinaIzdanja.getText());
        
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Godina izdanja mora biti broj!", "Greska", JOptionPane.ERROR);
            return;   
        }
        Knjiga k = new Knjiga(naslov, autor, ISBN, godinaIzdanja, zanr);
        controller.dodajKnjigu(k);
        JOptionPane.showMessageDialog(this, "Knjiga je uspesno dodata!", "Uspesno dodavanje", JOptionPane.INFORMATION_MESSAGE);
        
        gf.osveziTabelu();
        this.dispose();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        String naslov = txtFieldNaziv.getText();
        Autor autor = (Autor) comboAutor.getSelectedItem();
        String isbn = txtFieldIsbn.getText();
        int godinaIzdanja;
        try {
            godinaIzdanja = Integer.parseInt(txtFieldGodinaIzdanja.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Godina izdanja mora biti broj!", "Greska", JOptionPane.ERROR);
            return;
        }
        Zanr zanr = (Zanr) comboZanr.getSelectedItem();
        knjigaZaIzmenu.setNaslov(naslov);
        knjigaZaIzmenu.setAutor(autor);
        knjigaZaIzmenu.setGodinaIzdanja(godinaIzdanja);
        knjigaZaIzmenu.setZanr(zanr);
        
       JOptionPane.showMessageDialog(this, "Knjiga je uspesno izmenjena!", "Uspesna izmena!", JOptionPane.INFORMATION_MESSAGE);
       gf.osveziTabelu();
       this.dispose();
    }//GEN-LAST:event_btnIzmeniActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the dialog */
    /*    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormaKnjiga dialog = new FormaKnjiga(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnOdustani;
    private javax.swing.JComboBox<Autor> comboAutor;
    private javax.swing.JComboBox<String> comboZanr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtFieldGodinaIzdanja;
    private javax.swing.JTextField txtFieldIsbn;
    private javax.swing.JTextField txtFieldNaziv;
    // End of variables declaration//GEN-END:variables

    private void popuniComboBoxAutorima() {
       comboAutor.removeAllItems();
       List<Autor> autori = controller.getListaAutora();
        for (Autor autor : autori) {
            comboAutor.addItem(autor);
        }
    }
}