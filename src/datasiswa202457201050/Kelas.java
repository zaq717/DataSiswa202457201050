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
public class Kelas extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    public Kelas() {
        initComponents();
        reset();
        load_tabel_kelas();
        comboJurusan();
        comboWali();
    }

    void reset() {
        tf_KodeKelas.setText(null);
        tf_KodeKelas.setEditable(true);
        tf_NamaKelas.setText(null);
        cb_Jurusan.setSelectedItem(null);
        cb_Tingkatan.setSelectedItem(null);
        cb_WaliKelas.setSelectedItem(null);
    }

    void load_tabel_kelas() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Kelas");
        model.addColumn("Nama Kelas");
        model.addColumn("Tingkatan");
        model.addColumn("Jurusan");
        model.addColumn("Wali Kelas");

        String sql = "SELECT k.id_kelas, k.nama_kelas, k.tingkatan, j.nama_jurusan, g.nama_guru "
                + "FROM kelas k "
                + "LEFT JOIN jurusan j ON k.kode_jur = j.kode_jur "
                + "LEFT JOIN guru g ON k.nip_wali_kelas = g.nip";

        try {
            // Buka koneksi ke database
            Connection conn = Koneksi.konek();
            // Siapkan pernyataan SQL
            Statement statement = conn.createStatement();
            // Jalankan query dan ambil hasilnya
            ResultSet resultSet = statement.executeQuery(sql);
            // Baca setiap baris data dari hasil query
            while (resultSet.next()) {
                String KodeKelas = resultSet.getString("id_kelas");
                String NamaKelas = resultSet.getString("nama_kelas");
                String Tingkatan = resultSet.getString("tingkatan");
                String Jurusan = resultSet.getString("nama_jurusan");
                String WaliKelas = resultSet.getString("nama_guru");
                model.addRow(new Object[]{KodeKelas, NamaKelas, Tingkatan, Jurusan, WaliKelas});
            }
            // Masukkan data ke dalam tabel
            tb_Kelas.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal mengambil data!");
        }
    }

    // Method untuk mengisi combo box jurusan dari database
    void comboJurusan() {
        try {
            String sql = "SELECT * FROM jurusan";
            Connection conn = Koneksi.konek();
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                cb_Jurusan.addItem(resultSet.getString("nama_jurusan"));
            }
        } catch (SQLException e) {
            // Kosongkan pilihan jika terjadi kesalahan
            cb_Jurusan.setSelectedItem(null);
        }
    }

    // Method untuk mengisi combo box wali kelas dari database
    void comboWali() {
        try {
            String sql = "SELECT * FROM guru";
            Connection conn = Koneksi.konek();
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                cb_WaliKelas.addItem(resultSet.getString("nama_guru"));
            }
        } catch (SQLException e) {
            // Kosongkan pilihan jika terjadi kesalahan
            cb_WaliKelas.setSelectedItem(null);
        }
    }

    String kodeJurusan(String NamaJurusan) {
        String sql = "SELECT * FROM jurusan WHERE nama_jurusan = ?";
        try {
            Connection conn = Koneksi.konek();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, NamaJurusan);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                return resultSet.getString("kode_jur");
            }
        } catch (SQLException e) {
            return "";
        }
        return "";
    }

    String NIP(String NamaGuru) {
        String sql = "SELECT * FROM guru WHERE nama_guru = ?";
        try {
            Connection conn = Koneksi.konek();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, NamaGuru);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                return resultSet.getString("nip");
            }
        } catch (SQLException e) {
            return "";
        }
        return "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_dasar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lb_txtDataJurusan = new javax.swing.JLabel();
        tf_NamaKelas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_TambahDataKelas = new javax.swing.JToggleButton();
        btn_UbahDataKelas = new javax.swing.JToggleButton();
        btn_HapusDataKelas = new javax.swing.JToggleButton();
        btn_ResetDataKelas = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Kelas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cb_WaliKelas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tf_KodeKelas = new javax.swing.JTextField();
        cb_Tingkatan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cb_Jurusan = new javax.swing.JComboBox<>();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        lb_txtDataJurusan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_txtDataJurusan.setForeground(new java.awt.Color(255, 255, 255));
        lb_txtDataJurusan.setText("Data Kelas");

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

        tf_NamaKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NamaKelasActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama Kelas");

        jLabel2.setText("Kode Kelas");

        btn_TambahDataKelas.setBackground(new java.awt.Color(0, 153, 0));
        btn_TambahDataKelas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_TambahDataKelas.setForeground(new java.awt.Color(255, 255, 255));
        btn_TambahDataKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons-add-20.png"))); // NOI18N
        btn_TambahDataKelas.setText("Tambah");
        btn_TambahDataKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TambahDataKelasActionPerformed(evt);
            }
        });

        btn_UbahDataKelas.setBackground(new java.awt.Color(255, 153, 0));
        btn_UbahDataKelas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_UbahDataKelas.setForeground(new java.awt.Color(255, 255, 255));
        btn_UbahDataKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons-write-20.png"))); // NOI18N
        btn_UbahDataKelas.setText("Ubah");
        btn_UbahDataKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UbahDataKelasActionPerformed(evt);
            }
        });

        btn_HapusDataKelas.setBackground(new java.awt.Color(204, 0, 0));
        btn_HapusDataKelas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_HapusDataKelas.setForeground(new java.awt.Color(255, 255, 255));
        btn_HapusDataKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons-delete-20.png"))); // NOI18N
        btn_HapusDataKelas.setText("Hapus");
        btn_HapusDataKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HapusDataKelasActionPerformed(evt);
            }
        });

        btn_ResetDataKelas.setBackground(new java.awt.Color(0, 153, 255));
        btn_ResetDataKelas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ResetDataKelas.setForeground(new java.awt.Color(255, 255, 255));
        btn_ResetDataKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons-reset-20 .png"))); // NOI18N
        btn_ResetDataKelas.setText("Reset");
        btn_ResetDataKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetDataKelasActionPerformed(evt);
            }
        });

        tb_Kelas.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_Kelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_KelasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Kelas);

        jLabel3.setText("Tingkatan");

        cb_WaliKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_WaliKelasActionPerformed(evt);
            }
        });

        jLabel4.setText("Jurusan");

        tf_KodeKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_KodeKelasActionPerformed(evt);
            }
        });

        cb_Tingkatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12" }));
        cb_Tingkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TingkatanActionPerformed(evt);
            }
        });

        jLabel5.setText("Wali Kelas");

        cb_Jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_JurusanActionPerformed(evt);
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
                    .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(tf_NamaKelas)
                        .addComponent(cb_WaliKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_Tingkatan, javax.swing.GroupLayout.Alignment.TRAILING, 0, 221, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(tf_KodeKelas, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(cb_Jurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_dasarLayout.createSequentialGroup()
                        .addComponent(btn_TambahDataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_UbahDataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_HapusDataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ResetDataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_dasarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(tf_KodeKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(tf_NamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(cb_Tingkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(cb_Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(cb_WaliKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_TambahDataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UbahDataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_HapusDataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ResetDataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 62, Short.MAX_VALUE))
        );

        add(pn_dasar, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tf_NamaKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NamaKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NamaKelasActionPerformed

    private void btn_TambahDataKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TambahDataKelasActionPerformed
        String KodeKelas = tf_KodeKelas.getText();
        String NamaKelas = tf_NamaKelas.getText();
        String Tingkatan = cb_Tingkatan.getSelectedItem().toString();
        String Jurusan = kodeJurusan(cb_Jurusan.getSelectedItem().toString());
        String WaliKelas = NIP(cb_WaliKelas.getSelectedItem().toString());

        try {
            String sql = "INSERT INTO kelas(id_kelas, nama_kelas, tingkatan, kode_jur, nip_wali_kelas) VALUES(?, ?, ?, ?, ?)";
            Connection conn = Koneksi.konek();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, KodeKelas);
            statement.setString(2, NamaKelas);
            statement.setString(3, Tingkatan);
            statement.setString(4, Jurusan);
            statement.setString(5, WaliKelas);

            statement.execute();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
            load_tabel_kelas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan!");
        }

    }//GEN-LAST:event_btn_TambahDataKelasActionPerformed

    private void btn_UbahDataKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UbahDataKelasActionPerformed
        String KodeKelas = tf_KodeKelas.getText();
        String NamaKelas = tf_NamaKelas.getText();
        String Tingkatan = cb_Tingkatan.getSelectedItem().toString();
        String Jurusan = kodeJurusan(cb_Jurusan.getSelectedItem().toString());
        String WaliKelas = NIP(cb_WaliKelas.getSelectedItem().toString());

        try {
            String sql = "UPDATE kelas SET nama_kelas=?, tingkatan=?, kode_jur=?, nip_wali_kelas=? WHERE id_kelas=?";
            Connection conn = Koneksi.konek();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, NamaKelas);
            statement.setString(2, Tingkatan);
            statement.setString(3, Jurusan);
            statement.setString(4, WaliKelas);
            statement.setString(5, KodeKelas);

            statement.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
            load_tabel_kelas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal diubah!");
        }
    }//GEN-LAST:event_btn_UbahDataKelasActionPerformed

    private void btn_HapusDataKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HapusDataKelasActionPerformed
        String KodeKelas = tf_KodeKelas.getText();

        try {
            String sql = "DELETE FROM kelas WHERE id_kelas=?";
            Connection conn = Koneksi.konek();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, KodeKelas);
            statement.execute();

            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            load_tabel_kelas();
            reset();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus!");
        }

    }//GEN-LAST:event_btn_HapusDataKelasActionPerformed

    private void btn_ResetDataKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetDataKelasActionPerformed
        reset();
    }//GEN-LAST:event_btn_ResetDataKelasActionPerformed

    private void cb_WaliKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_WaliKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_WaliKelasActionPerformed

    private void tf_KodeKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_KodeKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_KodeKelasActionPerformed

    private void cb_TingkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TingkatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_TingkatanActionPerformed

    private void cb_JurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_JurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_JurusanActionPerformed

    private void tb_KelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_KelasMouseClicked
        int barisYangDipilih = tb_Kelas.rowAtPoint(evt.getPoint());

        String KodeKelas = tb_Kelas.getValueAt(barisYangDipilih, 0).toString();
        String NamaKelas = tb_Kelas.getValueAt(barisYangDipilih, 1).toString();
        String Tingkatan = tb_Kelas.getValueAt(barisYangDipilih, 2).toString();
        String Jurusan = tb_Kelas.getValueAt(barisYangDipilih, 3).toString();

        String WaliKelas;

        if (tb_Kelas.getValueAt(barisYangDipilih, 4) != null) {
            WaliKelas = tb_Kelas.getValueAt(barisYangDipilih, 4).toString();
        } else {
            WaliKelas = null;
        }

        tf_KodeKelas.setText(KodeKelas);
        tf_KodeKelas.setEditable(false);

        tf_NamaKelas.setText(NamaKelas);

        cb_Tingkatan.setSelectedItem(Tingkatan);

        cb_Jurusan.setSelectedItem(Jurusan);

        cb_WaliKelas.setSelectedItem(WaliKelas);

    }//GEN-LAST:event_tb_KelasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_HapusDataKelas;
    private javax.swing.JToggleButton btn_ResetDataKelas;
    private javax.swing.JToggleButton btn_TambahDataKelas;
    private javax.swing.JToggleButton btn_UbahDataKelas;
    private javax.swing.JComboBox<String> cb_Jurusan;
    private javax.swing.JComboBox<String> cb_Tingkatan;
    private javax.swing.JComboBox<String> cb_WaliKelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_txtDataJurusan;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JTable tb_Kelas;
    private javax.swing.JTextField tf_KodeKelas;
    private javax.swing.JTextField tf_NamaKelas;
    // End of variables declaration//GEN-END:variables
}
