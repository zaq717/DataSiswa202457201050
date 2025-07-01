/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package datasiswa202457201050;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author binak
 */
public class Guru extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    public Guru() {
        initComponents();
        tampilGuru();
        reset();
    }

    void reset() {
        tf_NIP.setText(null);
        tf_NIP.setEditable(true);
        tf_Nama.setText(null);
        cb_JenisKel.setSelectedItem(null);
        tf_Alamat.setText(null);
    }

    void tampilGuru() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIP");
        model.addColumn("Nama Guru");
        model.addColumn("L/P");
        model.addColumn("Alamat");

        String sql = "SELECT * FROM guru";
        try {
            Connection conn = Koneksi.konek();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String NIP = rs.getString("nip");
                String namaGuru = rs.getString("nama_guru");
                String jenisKelamin = rs.getString("gender");
                String alamat = rs.getString("alamat");
                Object[] baris = {NIP, namaGuru, jenisKelamin, alamat};
                model.addRow(baris);
            }
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Gagal mengambil data");

        }
        tb_guru.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_dasar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lb_txtDataJurusan = new javax.swing.JLabel();
        tf_Alamat = new javax.swing.JTextField();
        tf_Nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_TambahDataGuru = new javax.swing.JToggleButton();
        btn_UbahDataGuru = new javax.swing.JToggleButton();
        btn_HapusDataGuru = new javax.swing.JToggleButton();
        btn_ResetDataGuru = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_guru = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cb_JenisKel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tf_NIP = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        lb_txtDataJurusan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_txtDataJurusan.setForeground(new java.awt.Color(255, 255, 255));
        lb_txtDataJurusan.setText("Data Guru");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_txtDataJurusan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_txtDataJurusan)
                .addContainerGap())
        );

        tf_Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_AlamatActionPerformed(evt);
            }
        });

        tf_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NamaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama ");

        jLabel2.setText("NIP");

        btn_TambahDataGuru.setBackground(new java.awt.Color(0, 153, 0));
        btn_TambahDataGuru.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_TambahDataGuru.setForeground(new java.awt.Color(255, 255, 255));
        btn_TambahDataGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons-add-20.png"))); // NOI18N
        btn_TambahDataGuru.setText("Tambah");
        btn_TambahDataGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TambahDataGuruActionPerformed(evt);
            }
        });

        btn_UbahDataGuru.setBackground(new java.awt.Color(255, 153, 0));
        btn_UbahDataGuru.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_UbahDataGuru.setForeground(new java.awt.Color(255, 255, 255));
        btn_UbahDataGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons-write-20.png"))); // NOI18N
        btn_UbahDataGuru.setText("Ubah");
        btn_UbahDataGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UbahDataGuruActionPerformed(evt);
            }
        });

        btn_HapusDataGuru.setBackground(new java.awt.Color(204, 0, 0));
        btn_HapusDataGuru.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_HapusDataGuru.setForeground(new java.awt.Color(255, 255, 255));
        btn_HapusDataGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons-delete-20.png"))); // NOI18N
        btn_HapusDataGuru.setText("Hapus");
        btn_HapusDataGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HapusDataGuruActionPerformed(evt);
            }
        });

        btn_ResetDataGuru.setBackground(new java.awt.Color(0, 153, 255));
        btn_ResetDataGuru.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ResetDataGuru.setForeground(new java.awt.Color(255, 255, 255));
        btn_ResetDataGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons-reset-20 .png"))); // NOI18N
        btn_ResetDataGuru.setText("Reset");
        btn_ResetDataGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetDataGuruActionPerformed(evt);
            }
        });

        tb_guru.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_guru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_guruMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_guru);

        jLabel3.setText("Jenis Kelamin");

        cb_JenisKel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        cb_JenisKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_JenisKelActionPerformed(evt);
            }
        });

        jLabel4.setText("Alamat");

        tf_NIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NIPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dasarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_dasarLayout.createSequentialGroup()
                        .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(tf_Alamat, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(tf_Nama, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(cb_JenisKel, 0, 215, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tf_NIP, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_dasarLayout.createSequentialGroup()
                        .addComponent(btn_TambahDataGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_UbahDataGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_HapusDataGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ResetDataGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_dasarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(tf_NIP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(tf_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_JenisKel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(tf_Alamat))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_TambahDataGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UbahDataGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_HapusDataGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ResetDataGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 62, Short.MAX_VALUE))
        );

        add(pn_dasar, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tf_AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_AlamatActionPerformed

    }//GEN-LAST:event_tf_AlamatActionPerformed

    private void tf_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NamaActionPerformed

    private void btn_TambahDataGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TambahDataGuruActionPerformed
        // TODO add your handling code here:
        String NIP = tf_NIP.getText();
        String namaGuru = tf_Nama.getText();
        String jenisKelamin = cb_JenisKel.getSelectedItem().toString();
        String alamat = tf_Alamat.getText();
        String jk = null;

        switch (jenisKelamin) {
            case "Laki-laki":
                jk = "L";
                break;
            case "Perempuan":
                jk = "P";
                break;
            default:
                jk = null;
                break;
        }
        String sql = "INSERT INTO guru(nip, nama_guru,gender,alamat) VALUES (?,?,?,?) ";
        try {
            Connection conn = Koneksi.konek();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, NIP);
            ps.setString(2, namaGuru);
            ps.setString(3, jk);
            ps.setString(4, alamat);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil di simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        tampilGuru();
        reset();
    }//GEN-LAST:event_btn_TambahDataGuruActionPerformed

    private void btn_UbahDataGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UbahDataGuruActionPerformed
        String NIP = tf_NIP.getText();
        String namaGuru = tf_Nama.getText();
        String jenisKelamin = cb_JenisKel.getSelectedItem().toString();
        String alamat = tf_Alamat.getText();
        String jk = null;

        switch (jenisKelamin) {
            case "Laki-laki":
                jk = "L";
                break;
            case "Perempuan":
                jk = "P";
                break;
            default:
                jk = null;
                break;
        }
        String sql = "UPDATE guru SET nama_guru=?,gender=?,alamat=? WHERE nip=? ";
        try {
            Connection conn = Koneksi.konek();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, namaGuru);
            ps.setString(2, jk);
            ps.setString(3, alamat);
            ps.setString(4, NIP);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        tampilGuru();
        reset();
    }//GEN-LAST:event_btn_UbahDataGuruActionPerformed

    private void btn_HapusDataGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HapusDataGuruActionPerformed
        String nip = tf_NIP.getText();
        try {
            String sql = "DELETE FROM guru WHERE nip='" + nip + "'";
            java.sql.Connection conn = Koneksi.konek();
            java.sql.Statement statement = conn.createStatement();
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        tampilGuru();
        reset();
    }//GEN-LAST:event_btn_HapusDataGuruActionPerformed

    private void btn_ResetDataGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetDataGuruActionPerformed
        reset();
    }//GEN-LAST:event_btn_ResetDataGuruActionPerformed

    private void cb_JenisKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_JenisKelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_JenisKelActionPerformed

    private void tf_NIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NIPActionPerformed

    private void tb_guruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_guruMouseClicked
        int baris = tb_guru.rowAtPoint(evt.getPoint());
        String nip = tb_guru.getValueAt(baris, 0) != null ? tb_guru.getValueAt(baris, 0).toString() : "";
        String nama = tb_guru.getValueAt(baris, 1) != null ? tb_guru.getValueAt(baris, 1).toString() : "";
        String jenisKelamin = tb_guru.getValueAt(baris, 2) != null ? tb_guru.getValueAt(baris, 2).toString() : "";
        String alamat = tb_guru.getValueAt(baris, 3) != null ? tb_guru.getValueAt(baris, 3).toString() : "";

        tf_NIP.setText(nip);
        tf_Nama.setText(nama);
        tf_Alamat.setText(alamat);
        tf_NIP.setEditable(false);
        switch (jenisKelamin) {
            case "L":
                cb_JenisKel.setSelectedItem("Laki-laki");
                break;
            case "P":
                cb_JenisKel.setSelectedItem("Perempuan");
                break;
            default:
                cb_JenisKel.setSelectedItem(null);
                break;
        }
    }//GEN-LAST:event_tb_guruMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_HapusDataGuru;
    private javax.swing.JToggleButton btn_ResetDataGuru;
    private javax.swing.JToggleButton btn_TambahDataGuru;
    private javax.swing.JToggleButton btn_UbahDataGuru;
    private javax.swing.JComboBox<String> cb_JenisKel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_txtDataJurusan;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JTable tb_guru;
    private javax.swing.JTextField tf_Alamat;
    private javax.swing.JTextField tf_NIP;
    private javax.swing.JTextField tf_Nama;
    // End of variables declaration//GEN-END:variables
}
