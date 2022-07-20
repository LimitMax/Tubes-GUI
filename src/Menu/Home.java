/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import Admin.formAdmin;

import Guru.formGuru;

import Mapel.formMapel;
import Nilai.formNilai;

import java.awt.Dimension;
import kelas.formKelas;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import javax.swing.UIManager;
import siswa.formSiswa;

/**
 *
 * @author LimitMax
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        showPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSiswa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuDataGuru = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuKelas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuPelajaran = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuNilai = new javax.swing.JMenuItem();
        JmenuADmin = new javax.swing.JMenu();
        jMenuAdmin = new javax.swing.JMenuItem();
        JmenuLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 24)); // NOI18N
        jLabel1.setText("Selamat Datang Di Sistem Penilaian");

        jLabel2.setFont(new java.awt.Font("DFPOP1-W9", 1, 36)); // NOI18N
        jLabel2.setText("SDN Sindanghaji 3");

        showPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        showPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout showPaneLayout = new javax.swing.GroupLayout(showPane);
        showPane.setLayout(showPaneLayout);
        showPaneLayout.setHorizontalGroup(
            showPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showPaneLayout.createSequentialGroup()
                .addGroup(showPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showPaneLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(showPaneLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(539, Short.MAX_VALUE))
        );
        showPaneLayout.setVerticalGroup(
            showPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showPaneLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        jMenu1.setText("Siswa");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuSiswa.setText("data Siswa");
        jMenuSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSiswaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSiswa);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Guru");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuDataGuru.setText("Data Guru");
        jMenuDataGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDataGuruActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuDataGuru);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Kelas");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuKelas.setText("Data Daftar  Kelas");
        jMenuKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKelasActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuKelas);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Pelajaran");
        jMenu7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuPelajaran.setText("Data Pelajaran");
        jMenuPelajaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPelajaranActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuPelajaran);

        jMenuBar1.add(jMenu7);

        jMenu6.setText("Nilai");
        jMenu6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuNilai.setText("Data Nilai");
        jMenuNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNilaiActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuNilai);

        jMenuBar1.add(jMenu6);

        JmenuADmin.setText("Admin");
        JmenuADmin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JmenuADmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmenuADminActionPerformed(evt);
            }
        });

        jMenuAdmin.setText("Data Admin");
        jMenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAdminActionPerformed(evt);
            }
        });
        JmenuADmin.add(jMenuAdmin);

        JmenuLogout.setText("Logout");
        JmenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmenuLogoutActionPerformed(evt);
            }
        });
        JmenuADmin.add(JmenuLogout);

        jMenuBar1.add(JmenuADmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(showPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSiswaActionPerformed
        // TODO add your handling code here:
        formSiswa siswa = new formSiswa();

        // ambil size screen dan size form admin
        Dimension layarutama = this.getSize();
        Dimension layarsiswa = siswa.getSize();
        // set form admin di tengah screen
        siswa.setLocation(layarutama.width/2-layarsiswa.width/2,layarutama.height/2-layarsiswa.height/2);

        // Menampilkan menu admin di dekstop pane
        showPane.add(siswa);
        siswa.setVisible(true);
        siswa.tampilSiswa();
    }//GEN-LAST:event_jMenuSiswaActionPerformed

    private void jMenuDataGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDataGuruActionPerformed
        // TODO add your handling code here:
        formGuru guru = new formGuru();

        // ambil size screen dan size form admin
        Dimension layarutama = this.getSize();
        Dimension layarguru = guru.getSize();
        // set form admin di tengah screen
        guru.setLocation(layarutama.width/2-layarguru.width/2,layarutama.height/2-layarguru.height/2);

        // Menampilkan menu admin di dekstop pane
        showPane.add(guru);
        guru.setVisible(true);
        guru.tampilGuru();
    }//GEN-LAST:event_jMenuDataGuruActionPerformed

    private void jMenuKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKelasActionPerformed
        // TODO add your handling code here:
        formKelas kelas = new formKelas();

        // ambil size screen dan size form admin
        Dimension layarutama = this.getSize();
        Dimension layaradmin = kelas.getSize();
        // set form admin di tengah screen
        kelas.setLocation(layarutama.width/2-layaradmin.width/2,layarutama.height/2-layaradmin.height/2);

        // Menampilkan menu admin di dekstop pane
        showPane.add(kelas);
        kelas.setVisible(true);
        kelas.tampilKelas();
    }//GEN-LAST:event_jMenuKelasActionPerformed

    private void jMenuPelajaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPelajaranActionPerformed
        // TODO add your handling code here:
        formMapel mapel = new formMapel();
        
        // ambil size screen dan size form mapel
        Dimension layarutama = this.getSize();
        Dimension layarmapel = mapel.getSize();
        // set form mapel di tengah screen
        mapel.setLocation(layarutama.width/2-layarmapel.width/2,layarutama.height/2-layarmapel.height/2);

        // Menampilkan menu admin di dekstop pane
        showPane.add(mapel);
        mapel.setVisible(true);
        mapel.tampilMapel();
    }//GEN-LAST:event_jMenuPelajaranActionPerformed

    private void jMenuNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNilaiActionPerformed
        // TODO add your handling code here:
        formNilai nilai = new formNilai();
        
        // ambil size screen dan size form admin
        Dimension layarutama = this.getSize();
        Dimension layaradmin = nilai.getSize();
        // set form admin di tengah screen
        nilai.setLocation(layarutama.width/2-layaradmin.width/2,layarutama.height/2-layaradmin.height/2);
        
        //show menu nilai
        showPane.add(nilai);
        nilai.setVisible(true);
        nilai.tampilNilai();
    }//GEN-LAST:event_jMenuNilaiActionPerformed

    private void jMenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAdminActionPerformed
        // TODO add your handling code here:
        formAdmin admin = new formAdmin();

        // ambil size screen dan size form admin
        Dimension layarutama = this.getSize();
        Dimension layaradmin = admin.getSize();
        // set form admin di tengah screen
        admin.setLocation(layarutama.width/2-layaradmin.width/2,layarutama.height/2-layaradmin.height/2);

        // Menampilkan menu admin di dekstop pane
        showPane.add(admin);
        admin.setVisible(true);
        admin.tampilAdmin();
    }//GEN-LAST:event_jMenuAdminActionPerformed

    private void JmenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmenuLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JmenuLogoutActionPerformed

    private void JmenuADminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmenuADminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmenuADminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new AluminiumLookAndFeel());
                } catch (Exception e) {
                }
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmenuADmin;
    private javax.swing.JMenuItem JmenuLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDataGuru;
    private javax.swing.JMenuItem jMenuKelas;
    private javax.swing.JMenuItem jMenuNilai;
    private javax.swing.JMenuItem jMenuPelajaran;
    private javax.swing.JMenuItem jMenuSiswa;
    private javax.swing.JDesktopPane showPane;
    // End of variables declaration//GEN-END:variables
}
