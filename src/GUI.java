
import java.awt.CardLayout;
import java.util.Arrays;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hafidz
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private Kompetisi komp;
    private database db;
    public GUI() {
        initComponents();
    }
    private void fillListKompetisi(){
        DefaultListModel m = new DefaultListModel();
        String allData = komp.getListKompetisi();
        String[] dataTuple = allData.split(" \n");
        String[][] data = new String[dataTuple.length][];
        String view;
        for (int i = 0; i < dataTuple.length;i++){
            data[i] = dataTuple[i].split(" ; ");
            view = Arrays.toString(data[i]);
            m.addElement(view);
        }
        listKompetisi.setModel(m);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guiMainMenu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        guiDaftarKompetisi = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKompetisi = new javax.swing.JList();
        btnEditKompetisi = new javax.swing.JButton();
        btnPilihKompetisi = new javax.swing.JButton();
        btnHapusKompetisi = new javax.swing.JButton();
        btnBuatKompetisi = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDetilKompetisi = new javax.swing.JTextArea();
        guiMainKompetisi = new javax.swing.JPanel();
        btnTambahPeserta = new javax.swing.JButton();
        btnKlasemen = new javax.swing.JButton();
        btnPertandingan = new javax.swing.JButton();
        btnBack21 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textLiveUpdate = new javax.swing.JTextArea();
        guiTambahPeserta = new javax.swing.JPanel();
        Input = new javax.swing.JPanel();
        labelNamaTIM = new javax.swing.JLabel();
        textFieldNamaTIM = new javax.swing.JTextField();
        labelNamaPeserta = new javax.swing.JLabel();
        textFieldNamaPeserta = new javax.swing.JTextField();
        labelNoPunggung = new javax.swing.JLabel();
        spinnerNoPunggung = new javax.swing.JSpinner();
        labelPosisi = new javax.swing.JLabel();
        comboBoxPosisi = new javax.swing.JComboBox();
        btnAddPeserta = new javax.swing.JButton();
        btnBack22 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        guiPertandingan = new javax.swing.JPanel();
        tabbedPanePertandingan = new javax.swing.JTabbedPane();
        btnBack23 = new javax.swing.JButton();
        guiKlasemen = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack24 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Klasemen Futsal");
        getContentPane().setLayout(new java.awt.CardLayout());

        jButton1.setText("Enter the Dragon");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Help me");

        javax.swing.GroupLayout guiMainMenuLayout = new javax.swing.GroupLayout(guiMainMenu);
        guiMainMenu.setLayout(guiMainMenuLayout);
        guiMainMenuLayout.setHorizontalGroup(
            guiMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiMainMenuLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jButton1)
                .addGap(230, 230, 230))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(34, 34, 34))
        );
        guiMainMenuLayout.setVerticalGroup(
            guiMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(109, 109, 109))
        );

        getContentPane().add(guiMainMenu, "card2");

        listKompetisi.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listKompetisi);

        btnEditKompetisi.setText("Edit");

        btnPilihKompetisi.setText("Pilih");
        btnPilihKompetisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihKompetisiActionPerformed(evt);
            }
        });

        btnHapusKompetisi.setText("Hapus");

        btnBuatKompetisi.setText("Buat Kompetisi");
        btnBuatKompetisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuatKompetisiActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        textDetilKompetisi.setColumns(20);
        textDetilKompetisi.setRows(5);
        textDetilKompetisi.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));
        jScrollPane2.setViewportView(textDetilKompetisi);

        javax.swing.GroupLayout guiDaftarKompetisiLayout = new javax.swing.GroupLayout(guiDaftarKompetisi);
        guiDaftarKompetisi.setLayout(guiDaftarKompetisiLayout);
        guiDaftarKompetisiLayout.setHorizontalGroup(
            guiDaftarKompetisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiDaftarKompetisiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiDaftarKompetisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiDaftarKompetisiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addGroup(guiDaftarKompetisiLayout.createSequentialGroup()
                        .addComponent(btnBuatKompetisi, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditKompetisi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPilihKompetisi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapusKompetisi, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiDaftarKompetisiLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        guiDaftarKompetisiLayout.setVerticalGroup(
            guiDaftarKompetisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiDaftarKompetisiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiDaftarKompetisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(guiDaftarKompetisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiDaftarKompetisiLayout.createSequentialGroup()
                        .addGroup(guiDaftarKompetisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuatKompetisi)
                            .addComponent(btnEditKompetisi)
                            .addComponent(btnPilihKompetisi))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiDaftarKompetisiLayout.createSequentialGroup()
                        .addComponent(btnHapusKompetisi)
                        .addGap(38, 38, 38)))
                .addComponent(btnBack)
                .addContainerGap())
        );

        getContentPane().add(guiDaftarKompetisi, "card3");

        btnTambahPeserta.setText("Tambah Peserta");

        btnKlasemen.setText("Klasemen");

        btnPertandingan.setText("Pertandingan");

        btnBack21.setText("Back");
        btnBack21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack21ActionPerformed(evt);
            }
        });

        textLiveUpdate.setColumns(20);
        textLiveUpdate.setRows(5);
        textLiveUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Live Update"));
        jScrollPane3.setViewportView(textLiveUpdate);

        javax.swing.GroupLayout guiMainKompetisiLayout = new javax.swing.GroupLayout(guiMainKompetisi);
        guiMainKompetisi.setLayout(guiMainKompetisiLayout);
        guiMainKompetisiLayout.setHorizontalGroup(
            guiMainKompetisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiMainKompetisiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiMainKompetisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiMainKompetisiLayout.createSequentialGroup()
                        .addGroup(guiMainKompetisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTambahPeserta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKlasemen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPertandingan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiMainKompetisiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack21)))
                .addContainerGap())
        );
        guiMainKompetisiLayout.setVerticalGroup(
            guiMainKompetisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiMainKompetisiLayout.createSequentialGroup()
                .addGroup(guiMainKompetisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiMainKompetisiLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnTambahPeserta)
                        .addGap(18, 18, 18)
                        .addComponent(btnKlasemen)
                        .addGap(18, 18, 18)
                        .addComponent(btnPertandingan)
                        .addGap(102, 102, 102))
                    .addGroup(guiMainKompetisiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnBack21)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(guiMainKompetisi, "card4");

        labelNamaTIM.setText("Nama TIM :");

        labelNamaPeserta.setText("Nama Peserta :");

        labelNoPunggung.setText("Nomor Punggung :");

        spinnerNoPunggung.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        labelPosisi.setText("Posisi :");

        comboBoxPosisi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout InputLayout = new javax.swing.GroupLayout(Input);
        Input.setLayout(InputLayout);
        InputLayout.setHorizontalGroup(
            InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
            .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InputLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(InputLayout.createSequentialGroup()
                            .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelNamaTIM)
                                .addComponent(labelNamaPeserta))
                            .addGap(26, 26, 26)
                            .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldNamaTIM)
                                .addComponent(textFieldNamaPeserta)))
                        .addGroup(InputLayout.createSequentialGroup()
                            .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelNoPunggung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelPosisi, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBoxPosisi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinnerNoPunggung, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 140, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        InputLayout.setVerticalGroup(
            InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InputLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNamaTIM)
                        .addComponent(textFieldNamaTIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNamaPeserta)
                        .addComponent(textFieldNamaPeserta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNoPunggung)
                        .addComponent(spinnerNoPunggung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPosisi)
                        .addComponent(comboBoxPosisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnAddPeserta.setText("Add Peserta");

        btnBack22.setText("Back");
        btnBack22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack22ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Recently Added"));
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout guiTambahPesertaLayout = new javax.swing.GroupLayout(guiTambahPeserta);
        guiTambahPeserta.setLayout(guiTambahPesertaLayout);
        guiTambahPesertaLayout.setHorizontalGroup(
            guiTambahPesertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiTambahPesertaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiTambahPesertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiTambahPesertaLayout.createSequentialGroup()
                        .addComponent(btnAddPeserta)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 223, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiTambahPesertaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack22)))
                .addContainerGap())
            .addGroup(guiTambahPesertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(guiTambahPesertaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        guiTambahPesertaLayout.setVerticalGroup(
            guiTambahPesertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiTambahPesertaLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(guiTambahPesertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiTambahPesertaLayout.createSequentialGroup()
                        .addComponent(btnAddPeserta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack22)
                .addContainerGap())
            .addGroup(guiTambahPesertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(guiTambahPesertaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );

        getContentPane().add(guiTambahPeserta, "card5");

        btnBack23.setText("Back");
        btnBack23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout guiPertandinganLayout = new javax.swing.GroupLayout(guiPertandingan);
        guiPertandingan.setLayout(guiPertandinganLayout);
        guiPertandinganLayout.setHorizontalGroup(
            guiPertandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiPertandinganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiPertandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabbedPanePertandingan)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiPertandinganLayout.createSequentialGroup()
                        .addGap(0, 545, Short.MAX_VALUE)
                        .addComponent(btnBack23)))
                .addContainerGap())
        );
        guiPertandinganLayout.setVerticalGroup(
            guiPertandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiPertandinganLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(tabbedPanePertandingan, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(btnBack23)
                .addContainerGap())
        );

        getContentPane().add(guiPertandingan, "card6");

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder("Hasil Klasemen"));
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
        jScrollPane5.setViewportView(jTable1);

        btnBack24.setText("Back");
        btnBack24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout guiKlasemenLayout = new javax.swing.GroupLayout(guiKlasemen);
        guiKlasemen.setLayout(guiKlasemenLayout);
        guiKlasemenLayout.setHorizontalGroup(
            guiKlasemenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiKlasemenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack24)
                .addContainerGap())
            .addGroup(guiKlasemenLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        guiKlasemenLayout.setVerticalGroup(
            guiKlasemenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiKlasemenLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack24)
                .addContainerGap())
        );

        getContentPane().add(guiKlasemen, "card7");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPilihKompetisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihKompetisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihKompetisiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout x = (CardLayout)getContentPane().getLayout();
        x.show(getContentPane(),"card3");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout x = (CardLayout)getContentPane().getLayout();
        x.show(getContentPane(),"card2");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBack21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack21ActionPerformed
        // TODO add your handling code here:
        CardLayout x = (CardLayout)getContentPane().getLayout();
        x.show(getContentPane(),"card3");
    }//GEN-LAST:event_btnBack21ActionPerformed

    private void btnBack22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack22ActionPerformed
        // TODO add your handling code here:
        CardLayout x = (CardLayout)getContentPane().getLayout();
        x.show(getContentPane(),"card3");
    }//GEN-LAST:event_btnBack22ActionPerformed

    private void btnBack23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack23ActionPerformed
        // TODO add your handling code here:
        CardLayout x = (CardLayout)getContentPane().getLayout();
        x.show(getContentPane(),"card3");
    }//GEN-LAST:event_btnBack23ActionPerformed

    private void btnBack24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack24ActionPerformed
        // TODO add your handling code here:
        CardLayout x = (CardLayout)getContentPane().getLayout();
        x.show(getContentPane(),"card3");
    }//GEN-LAST:event_btnBack24ActionPerformed

    private void btnBuatKompetisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatKompetisiActionPerformed
        // TODO add your handling code here:
        Object namaKompetisi = JOptionPane.showInputDialog("nama kompetisi : ");
        Object maxTim = JOptionPane.showInputDialog("Masukan jumlah maksimal tim : ");
        komp = new Kompetisi(((String) namaKompetisi.toString()),(Integer.valueOf((String) maxTim)));
        komp.saveKompetisi();
        textDetilKompetisi.append("Data berhasil dimasukan \n");
        String allData = komp.getListKompetisi();
        String[] dataTuple = allData.split(" \n");
        String[][] data = new String[dataTuple.length][];
        for (int i = 0; i < dataTuple.length;i++){
            data[i] = dataTuple[i].split(" ; ");
            textDetilKompetisi.append(dataTuple[i]);
        }
        
        fillListKompetisi();
        
    }//GEN-LAST:event_btnBuatKompetisiActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Input;
    private javax.swing.JButton btnAddPeserta;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack21;
    private javax.swing.JButton btnBack22;
    private javax.swing.JButton btnBack23;
    private javax.swing.JButton btnBack24;
    private javax.swing.JButton btnBuatKompetisi;
    private javax.swing.JButton btnEditKompetisi;
    private javax.swing.JButton btnHapusKompetisi;
    private javax.swing.JButton btnKlasemen;
    private javax.swing.JButton btnPertandingan;
    private javax.swing.JButton btnPilihKompetisi;
    private javax.swing.JButton btnTambahPeserta;
    private javax.swing.JComboBox comboBoxPosisi;
    private javax.swing.JPanel guiDaftarKompetisi;
    private javax.swing.JPanel guiKlasemen;
    private javax.swing.JPanel guiMainKompetisi;
    private javax.swing.JPanel guiMainMenu;
    private javax.swing.JPanel guiPertandingan;
    private javax.swing.JPanel guiTambahPeserta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelNamaPeserta;
    private javax.swing.JLabel labelNamaTIM;
    private javax.swing.JLabel labelNoPunggung;
    private javax.swing.JLabel labelPosisi;
    private javax.swing.JList listKompetisi;
    private javax.swing.JSpinner spinnerNoPunggung;
    private javax.swing.JTabbedPane tabbedPanePertandingan;
    private javax.swing.JTextArea textDetilKompetisi;
    private javax.swing.JTextField textFieldNamaPeserta;
    private javax.swing.JTextField textFieldNamaTIM;
    private javax.swing.JTextArea textLiveUpdate;
    // End of variables declaration//GEN-END:variables
}