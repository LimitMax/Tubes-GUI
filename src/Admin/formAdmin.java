/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Menu.Home;
import Koneksi.koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LimitMax
 */
public class formAdmin extends javax.swing.JInternalFrame {
    
//private DefaultTableModel tabmodel;
    /**
     * Creates new form formAdmin
     */
    public formAdmin() {
        initComponents();
    }
    
    public void tampilAdmin(){
        Object[] row = {"ID Admin", "username"}; 
        DefaultTableModel tabmodel = new DefaultTableModel(null,row);
        JTablebAdmin.setModel(tabmodel); 
        
        koneksi sambung = new koneksi();
        try{
            String sql = "SELECT id_admin,username FROM admin";
            ResultSet res = sambung.stat.executeQuery(sql);
            while(res.next()){
                String id_admin = res.getString("id_admin");
                String username = res.getString("username");
                String[] data = {id_admin,username};
                tabmodel.addRow(data);
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        JTablebAdmin = new javax.swing.JTable();
        btnCloseAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TblRefresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TblTambah = new javax.swing.JButton();
        TblEdit = new javax.swing.JButton();
        TblHapus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TblCari = new javax.swing.JButton();
        txtCariAdmin = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        JTablebAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTablebAdmin.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                JTablebAdminComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(JTablebAdmin);

        btnCloseAdmin.setText("Tutup");
        btnCloseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseAdminActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daftar Admin");

        TblRefresh.setText("Refresh");
        TblRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TblRefreshActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(""), javax.swing.BorderFactory.createCompoundBorder()));

        TblTambah.setText("Tambah ");
        TblTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TblTambahActionPerformed(evt);
            }
        });

        TblEdit.setText("Edit");
        TblEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TblEditActionPerformed(evt);
            }
        });

        TblHapus.setText("Hapus");
        TblHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TblHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TblHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TblEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TblTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TblTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TblEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TblHapus)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(""), javax.swing.BorderFactory.createCompoundBorder()));

        TblCari.setText("Cari");
        TblCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TblCariActionPerformed(evt);
            }
        });

        txtCariAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TblCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCariAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TblCari)
                    .addComponent(txtCariAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCloseAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TblRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 183, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TblRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCloseAdmin))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TblEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TblEditActionPerformed
        // TODO add your handling code here:
        editAdmin edit = new editAdmin();
        edit.setVisible(true);
    }//GEN-LAST:event_TblEditActionPerformed

    private void btnCloseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseAdminActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseAdminActionPerformed

    private void JTablebAdminComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JTablebAdminComponentShown
        // TODO add your handling code here:
        tampilAdmin();
    }//GEN-LAST:event_JTablebAdminComponentShown

    private void TblRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TblRefreshActionPerformed
        // TODO add your handling code here:
        tampilAdmin();
    }//GEN-LAST:event_TblRefreshActionPerformed

    private void TblCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TblCariActionPerformed
        // TODO add your handling code here:
        Object[] row = {"ID Admin", "nama Admin"}; 
        DefaultTableModel tabmodel = new DefaultTableModel(null,row);
        JTablebAdmin.setModel(tabmodel);
        koneksi sambung = new koneksi();
        try{
            String sql = "SELECT id_admin,username FROM admin WHERE id_admin LIKE '%" 
                    +txtCariAdmin.getText()+ "%'" +"or username LIKE '%" +txtCariAdmin.getText()+ "%'";
            ResultSet res = sambung.stat.executeQuery(sql);
            while(res.next()){
                String id_admin = res.getString("id_admin");
                String username = res.getString("username");
                String[] data = {id_admin,username};
                tabmodel.addRow(data);
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }//GEN-LAST:event_TblCariActionPerformed

    private void TblTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TblTambahActionPerformed
        // TODO add your handling code here:
        tambahAdmin tambah = new tambahAdmin();
        tambah.setVisible(true);
    }//GEN-LAST:event_TblTambahActionPerformed

    private void TblHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TblHapusActionPerformed
        // TODO add your handling code here:
        hapusAdmin hapus = new hapusAdmin();
        hapus.setVisible(true);
    }//GEN-LAST:event_TblHapusActionPerformed

    private void txtCariAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTablebAdmin;
    private javax.swing.JButton TblCari;
    private javax.swing.JButton TblEdit;
    private javax.swing.JButton TblHapus;
    private javax.swing.JButton TblRefresh;
    private javax.swing.JButton TblTambah;
    private javax.swing.JButton btnCloseAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCariAdmin;
    // End of variables declaration//GEN-END:variables
}
