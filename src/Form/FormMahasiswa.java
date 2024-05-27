package Form;

import Config.Koneksi;
import java.util.logging.Logger;
import java.util.logging.Level;

import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class FormMahasiswa extends javax.swing.JFrame {

    private Connection conn;

    public FormMahasiswa() {
        initComponents();
        conn = Koneksi.getConnection();
        getData();
        nonAktifButton();
        aktifButton();

    }

    private void getData() {
        DefaultTableModel model = (DefaultTableModel) tb_data.getModel();
        model.setRowCount(0);

        try {
            String sql = "Select * from mahasiswa";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String telepon = rs.getString("telepon");
                String alamat = rs.getString("alamat");

                Object[] rowData = {id, nama, telepon, alamat};
                model.addRow(rowData);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_data = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Tnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Tcari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Talamat = new javax.swing.JTextField();
        Ttelepon = new javax.swing.JTextField();
        BTambah = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Bbatal = new javax.swing.JButton();
        Bhapus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tb_data.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tb_data.setForeground(new java.awt.Color(102, 102, 102));
        tb_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAMA", "TELEPON", "ALAMAT"
            }
        ));
        tb_data.setGridColor(new java.awt.Color(204, 204, 204));
        tb_data.setRowHeight(30);
        tb_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_dataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_data);

        jLabel1.setText("Nama");

        Tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnamaActionPerformed(evt);
            }
        });

        jLabel2.setText("Telepon");

        Tcari.setText("Pencarian");
        Tcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TcariMouseClicked(evt);
            }
        });
        Tcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcariActionPerformed(evt);
            }
        });
        Tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TcariKeyTyped(evt);
            }
        });

        jLabel3.setText("Alamat");

        Talamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TalamatActionPerformed(evt);
            }
        });

        Ttelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TteleponActionPerformed(evt);
            }
        });

        BTambah.setText("TAMBAH");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        Bupdate.setText("UPDATE");
        Bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BupdateActionPerformed(evt);
            }
        });

        Bbatal.setText("BATAL");
        Bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbatalActionPerformed(evt);
            }
        });

        Bhapus.setText("HAPUS");
        Bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BhapusActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATA MAHASISWA");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Bbatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bhapus))
                    .addComponent(jLabel3)
                    .addComponent(Talamat, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(Ttelepon)
                    .addComponent(Tnama)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tcari)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tcari, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ttelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(Talamat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Bupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Bhapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnamaActionPerformed

    private void TalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TalamatActionPerformed

    private void TcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TcariActionPerformed

    private void BupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BupdateActionPerformed
        int selectedRow = tb_data.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diperbarui");
            return;
        }
        String id = tb_data.getValueAt(selectedRow, 0).toString();
        String nama = Tnama.getText();
        String telepon = Ttelepon.getText();
        String alamat = Talamat.getText();
        if (nama.isEmpty() || telepon.isEmpty() || alamat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "update mahasiswa set nama=?, telepon=?, alamat=? where id=? ";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama);
            st.setString(2, telepon);
            st.setString(3, alamat);
            st.setString(4, id);

            int rowUpdate = st.executeUpdate();

            if (rowUpdate > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui");
                resetForm();
                getData();
            }
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE, null, e);
        }


    }//GEN-LAST:event_BupdateActionPerformed

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        String nama = Tnama.getText();
        String telepon = Ttelepon.getText();
        String alamat = Talamat.getText();

        if (nama.isEmpty() || telepon.isEmpty() || alamat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "INSERT INTO mahasiswa (nama,telepon,alamat) VALUES (?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama);
            st.setString(2, telepon);
            st.setString(3, alamat);

            int rowInserted = st.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
                resetForm();
                getData();
            }
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_BTambahActionPerformed

    private void tb_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_dataMouseClicked
        int selectedRow = tb_data.getSelectedRow();
        if (selectedRow != -1) {
            String nama = tb_data.getValueAt(selectedRow, 1).toString();
            String telepon = tb_data.getValueAt(selectedRow, 2).toString();
            String alamat = tb_data.getValueAt(selectedRow, 3).toString();
            Tnama.setText(nama);
            Ttelepon.setText(telepon);
            Talamat.setText(alamat);
        }

        Bupdate.setEnabled(true);
        BTambah.setEnabled(false);

        Bhapus.setEnabled(true);

    }//GEN-LAST:event_tb_dataMouseClicked

    private void TteleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TteleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TteleponActionPerformed

    private void BbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbatalActionPerformed
        resetForm();
        aktifButton();
        nonAktifButton();
    }//GEN-LAST:event_BbatalActionPerformed

    private void BhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BhapusActionPerformed
        int selectedRow = tb_data.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diperbarui");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data ini ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String id = tb_data.getValueAt(selectedRow, 0).toString();

            try {
                String sql = "DELETE FROM mahasiswa where id=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, id);

                int rowDelete = st.executeUpdate();
                if (rowDelete > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus");

                }
                st.close();
            } catch (Exception e) {
                Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetForm();
        getData();
        aktifButton();
        nonAktifButton();
    }//GEN-LAST:event_BhapusActionPerformed

    private void TcariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TcariKeyTyped
        DefaultTableModel model = (DefaultTableModel) tb_data.getModel();
        model.setRowCount(0);
        String cari = Tcari.getText();

        try {
            String sql = "Select * from mahasiswa where nama like ? or telepon like ? or alamat like ? ";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, "%" + cari + "%");
            st.setString(2, "%" + cari + "%");
            st.setString(3, "%" + cari + "%");

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String telepon = rs.getString("telepon");
                String alamat = rs.getString("alamat");

                Object[] rowData = {id, nama, telepon, alamat};
                model.addRow(rowData);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_TcariKeyTyped

    private void TcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TcariMouseClicked
      Tcari.setText("");
    }//GEN-LAST:event_TcariMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTambah;
    private javax.swing.JButton Bbatal;
    private javax.swing.JButton Bhapus;
    private javax.swing.JButton Bupdate;
    private javax.swing.JTextField Talamat;
    private javax.swing.JTextField Tcari;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Ttelepon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tb_data;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        Tnama.setText("");
        Ttelepon.setText("");
        Talamat.setText("");
    }

    private void nonAktifButton() {
        Bupdate.setEnabled(false);
        Bhapus.setEnabled(false);
    }

    private void aktifButton() {
        BTambah.setEnabled(true);
        Bbatal.setEnabled(true);
        Bhapus.setEnabled(true);

    }

}
