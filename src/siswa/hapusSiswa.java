/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siswa;

import Koneksi.koneksi;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author muham
 */
public class hapusSiswa extends javax.swing.JFrame {

    /**
     * Creates new form hapusSiswa
     */
    public hapusSiswa() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        txthapus = new javax.swing.JTextField();
        btntutup = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Form Hapus Data Siswa ");

        jLabel2.setText("Masukkan NIS siswa yang ingin dihapus : ");

        btntutup.setText("Tutup");
        btntutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntutupActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txthapus, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btntutup)
                                .addGap(90, 90, 90)
                                .addComponent(btnreset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsubmit))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txthapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntutup)
                    .addComponent(btnreset)
                    .addComponent(btnsubmit))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntutupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btntutupActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        txthapus.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        koneksi sambung = new koneksi();
        try{
            String sql = "DELETE FROM siswa WHERE nis='"+txthapus.getText()+"'";
            sambung.stat.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Admin dengan ID: "+txthapus.getText()+" berhasil di hapus");
            dispose();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JButton btntutup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txthapus;
    // End of variables declaration//GEN-END:variables
}