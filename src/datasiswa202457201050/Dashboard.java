/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package datasiswa202457201050;

/**
 *
 * @author binak
 */
public class Dashboard extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        pn_dasar = new javax.swing.JPanel();
        pn_jurusan = new javax.swing.JPanel();
        pn_dlmjurusan = new javax.swing.JPanel();
        lb_guru = new javax.swing.JLabel();
        lb_Qtyjurusan = new javax.swing.JLabel();
        pn_guru = new javax.swing.JPanel();
        pn_dlmguru = new javax.swing.JPanel();
        lb_jurusan = new javax.swing.JLabel();
        lb_Qtyguru = new javax.swing.JLabel();
        pn_siswa = new javax.swing.JPanel();
        pn_dlmsiswa = new javax.swing.JPanel();
        lb_siswa = new javax.swing.JLabel();
        lb_Qtysiswa = new javax.swing.JLabel();
        pn_kelas = new javax.swing.JPanel();
        pn_dlmkelas = new javax.swing.JPanel();
        lb_kelas = new javax.swing.JLabel();
        lb_Qtykelas = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        pn_jurusan.setBackground(new java.awt.Color(255, 255, 255));

        pn_dlmjurusan.setBackground(new java.awt.Color(0, 153, 255));

        lb_guru.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lb_guru.setForeground(new java.awt.Color(255, 255, 255));
        lb_guru.setText("Jumlah Guru");

        javax.swing.GroupLayout pn_dlmjurusanLayout = new javax.swing.GroupLayout(pn_dlmjurusan);
        pn_dlmjurusan.setLayout(pn_dlmjurusanLayout);
        pn_dlmjurusanLayout.setHorizontalGroup(
            pn_dlmjurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dlmjurusanLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lb_guru)
                .addGap(23, 23, 23))
        );
        pn_dlmjurusanLayout.setVerticalGroup(
            pn_dlmjurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dlmjurusanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_guru)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_Qtyjurusan.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_Qtyjurusan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Qtyjurusan.setText("150");

        javax.swing.GroupLayout pn_jurusanLayout = new javax.swing.GroupLayout(pn_jurusan);
        pn_jurusan.setLayout(pn_jurusanLayout);
        pn_jurusanLayout.setHorizontalGroup(
            pn_jurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_dlmjurusan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_Qtyjurusan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_jurusanLayout.setVerticalGroup(
            pn_jurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_jurusanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pn_dlmjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Qtyjurusan)
                .addGap(82, 82, 82))
        );

        pn_guru.setBackground(new java.awt.Color(255, 255, 255));

        pn_dlmguru.setBackground(new java.awt.Color(0, 153, 255));

        lb_jurusan.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lb_jurusan.setForeground(new java.awt.Color(255, 255, 255));
        lb_jurusan.setText("Jumlah Jurusan");

        javax.swing.GroupLayout pn_dlmguruLayout = new javax.swing.GroupLayout(pn_dlmguru);
        pn_dlmguru.setLayout(pn_dlmguruLayout);
        pn_dlmguruLayout.setHorizontalGroup(
            pn_dlmguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dlmguruLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lb_jurusan)
                .addGap(23, 23, 23))
        );
        pn_dlmguruLayout.setVerticalGroup(
            pn_dlmguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dlmguruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_jurusan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_Qtyguru.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_Qtyguru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Qtyguru.setText("3");

        javax.swing.GroupLayout pn_guruLayout = new javax.swing.GroupLayout(pn_guru);
        pn_guru.setLayout(pn_guruLayout);
        pn_guruLayout.setHorizontalGroup(
            pn_guruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_dlmguru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_guruLayout.createSequentialGroup()
                .addComponent(lb_Qtyguru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_guruLayout.setVerticalGroup(
            pn_guruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_guruLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pn_dlmguru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Qtyguru)
                .addGap(82, 82, 82))
        );

        pn_siswa.setBackground(new java.awt.Color(255, 255, 255));
        pn_siswa.setPreferredSize(new java.awt.Dimension(150, 197));

        pn_dlmsiswa.setBackground(new java.awt.Color(0, 153, 255));

        lb_siswa.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lb_siswa.setForeground(new java.awt.Color(255, 255, 255));
        lb_siswa.setText("Jumlah Siswa");

        javax.swing.GroupLayout pn_dlmsiswaLayout = new javax.swing.GroupLayout(pn_dlmsiswa);
        pn_dlmsiswa.setLayout(pn_dlmsiswaLayout);
        pn_dlmsiswaLayout.setHorizontalGroup(
            pn_dlmsiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dlmsiswaLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lb_siswa)
                .addGap(28, 28, 28))
        );
        pn_dlmsiswaLayout.setVerticalGroup(
            pn_dlmsiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dlmsiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_siswa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_Qtysiswa.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_Qtysiswa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Qtysiswa.setText("300");
        lb_Qtysiswa.setToolTipText("");

        javax.swing.GroupLayout pn_siswaLayout = new javax.swing.GroupLayout(pn_siswa);
        pn_siswa.setLayout(pn_siswaLayout);
        pn_siswaLayout.setHorizontalGroup(
            pn_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_dlmsiswa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_Qtysiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_siswaLayout.setVerticalGroup(
            pn_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_siswaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pn_dlmsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Qtysiswa)
                .addGap(82, 82, 82))
        );

        pn_kelas.setBackground(new java.awt.Color(255, 255, 255));

        pn_dlmkelas.setBackground(new java.awt.Color(0, 153, 255));

        lb_kelas.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lb_kelas.setForeground(new java.awt.Color(255, 255, 255));
        lb_kelas.setText("Jumlah Kelas");

        javax.swing.GroupLayout pn_dlmkelasLayout = new javax.swing.GroupLayout(pn_dlmkelas);
        pn_dlmkelas.setLayout(pn_dlmkelasLayout);
        pn_dlmkelasLayout.setHorizontalGroup(
            pn_dlmkelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dlmkelasLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lb_kelas)
                .addGap(28, 28, 28))
        );
        pn_dlmkelasLayout.setVerticalGroup(
            pn_dlmkelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dlmkelasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_kelas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_Qtykelas.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_Qtykelas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Qtykelas.setText("10");
        lb_Qtykelas.setToolTipText("");

        javax.swing.GroupLayout pn_kelasLayout = new javax.swing.GroupLayout(pn_kelas);
        pn_kelas.setLayout(pn_kelasLayout);
        pn_kelasLayout.setHorizontalGroup(
            pn_kelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_dlmkelas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_Qtykelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_kelasLayout.setVerticalGroup(
            pn_kelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kelasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pn_dlmkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Qtykelas)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_guru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(pn_siswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pn_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_siswa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pn_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pn_guru, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(317, Short.MAX_VALUE))
        );

        add(pn_dasar, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_Qtyguru;
    private javax.swing.JLabel lb_Qtyjurusan;
    private javax.swing.JLabel lb_Qtykelas;
    private javax.swing.JLabel lb_Qtysiswa;
    private javax.swing.JLabel lb_guru;
    private javax.swing.JLabel lb_jurusan;
    private javax.swing.JLabel lb_kelas;
    private javax.swing.JLabel lb_siswa;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_dlmguru;
    private javax.swing.JPanel pn_dlmjurusan;
    private javax.swing.JPanel pn_dlmkelas;
    private javax.swing.JPanel pn_dlmsiswa;
    private javax.swing.JPanel pn_guru;
    private javax.swing.JPanel pn_jurusan;
    private javax.swing.JPanel pn_kelas;
    private javax.swing.JPanel pn_siswa;
    // End of variables declaration//GEN-END:variables
}
