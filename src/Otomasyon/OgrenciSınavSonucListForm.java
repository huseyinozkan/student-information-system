/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otomasyon;

import Lib.Lib;
import RequestModel.DataRequest;
import RequestModel.SinavSonuclariRequest;
import ResponseModel.DataResponse;
import ResponseModel.SinavSonuclariResponse;
import com.google.gson.reflect.TypeToken;
import java.awt.Component;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huseyin
 */
public class OgrenciSınavSonucListForm extends javax.swing.JInternalFrame {

    List<SinavSonuclariResponse> sinavSonuclariResponseList;
    DefaultTableModel defaultTableModel;
    String Kullanici_Adi;
    /**
     * Creates new form OgrenciListForm
     */

    private Component backForm;

    public OgrenciSınavSonucListForm(Component backForm, String Kullanici_Adi) {
        initComponents();

        this.backForm = backForm;
        this.Kullanici_Adi = Kullanici_Adi;

        Toolkit tk = Toolkit.getDefaultToolkit();
        int withSize = ((int) tk.getScreenSize().getWidth());
        int heightSize = ((int) tk.getScreenSize().getHeight()) - 150;
        this.setSize(withSize, heightSize);

        defaultTableModel = (DefaultTableModel) tbl_sınav_sonuc.getModel();

        sinavSonuclariList();
        timerGanoHesapla();

    }

    public void timerGanoHesapla() {

        if (tbl_sınav_sonuc.getRowCount() != 0) {
            defaultTableModel = (DefaultTableModel) tbl_sınav_sonuc.getModel();
            float kredi_toplam = 0.0f, kredi_carpim = 0.0f;

            for (int i = 0; i < tbl_sınav_sonuc.getRowCount(); i++) {
                if (defaultTableModel.getValueAt(i, 6).toString().equals("AA")) {
                    kredi_carpim += (float) (Float.parseFloat(defaultTableModel.getValueAt(i, 1).toString()) * 4.0f);
                } else if (defaultTableModel.getValueAt(i, 6).toString().equals("BA")) {
                    kredi_carpim += (float) (Float.parseFloat(defaultTableModel.getValueAt(i, 1).toString()) * 3.5f);
                } else if (defaultTableModel.getValueAt(i, 6).toString().equals("BB")) {
                    kredi_carpim += (float) (Float.parseFloat(defaultTableModel.getValueAt(i, 1).toString()) * 3.0f);
                } else if (defaultTableModel.getValueAt(i, 6).toString().equals("CB")) {
                    kredi_carpim += (float) (Float.parseFloat(defaultTableModel.getValueAt(i, 1).toString()) * 2.5f);
                } else if (defaultTableModel.getValueAt(i, 6).toString().equals("CC")) {
                    kredi_carpim += (float) (Float.parseFloat(defaultTableModel.getValueAt(i, 1).toString()) * 2.0f);
                } else if (defaultTableModel.getValueAt(i, 6).toString().equals("DC")) {
                    kredi_carpim += (float) (Float.parseFloat(defaultTableModel.getValueAt(i, 1).toString()) * 1.5f);
                } else if (defaultTableModel.getValueAt(i, 6).toString().equals("DD")) {
                    kredi_carpim += (float) (Float.parseFloat(defaultTableModel.getValueAt(i, 1).toString()) * 1.0f);
                } else if (defaultTableModel.getValueAt(i, 6).toString().equals("FD")) {
                    kredi_carpim += (float) (Float.parseFloat(defaultTableModel.getValueAt(i, 1).toString()) * 0.5f);
                } else if (defaultTableModel.getValueAt(i, 6).toString().equals("FF")) {
                    kredi_carpim += (float) (Float.parseFloat(defaultTableModel.getValueAt(i, 1).toString()) * 0.0f);
                }
                kredi_toplam += (float) Float.parseFloat(defaultTableModel.getValueAt(i, 1).toString());
            }
            if (kredi_carpim != 0.0f) {
                lbl_gano.setText((String.valueOf(((float) kredi_carpim / (float) kredi_toplam))).substring(0, 4));
            }
        }

    }

    public void sinavSonuclariList() {
        SinavSonuclariRequest sinavSonuclariRequest = new SinavSonuclariRequest();
        sinavSonuclariRequest.setOgrenciNo(this.Kullanici_Adi);

        String json = Lib.jsonResponse("sinav_sonuclari", new DataRequest(sinavSonuclariRequest));
        DataResponse<SinavSonuclariResponse> dataResponse = Lib.gson.fromJson(json, new TypeToken<DataResponse<SinavSonuclariResponse>>() {
        }.getType());

        sinavSonuclariResponseList = dataResponse.getData(this);
        if (sinavSonuclariResponseList != null) {
            defaultTableModel.setRowCount(0);
            for (SinavSonuclariResponse sinavSonuclariResponse : sinavSonuclariResponseList) {

                float butunleme, vize, _final, ortalama;
                String harf_notu = "";

                butunleme = Float.parseFloat(sinavSonuclariResponse.getButunleme());
                vize = Float.parseFloat(sinavSonuclariResponse.getVize());
                _final = Float.parseFloat(sinavSonuclariResponse.getFinal());

                if (_final > butunleme) {
                    ortalama = (vize * 40) / 100 + (_final * 60) / 100;
                } else {
                    ortalama = (vize * 40) / 100 + (butunleme * 60) / 100;
                }

                if (ortalama >= 0 && ortalama < 30) {
                    harf_notu = "FF";
                } else if (ortalama >= 30 && ortalama < 40) {
                    harf_notu = "FD";
                } else if (ortalama >= 40 && ortalama < 50) {
                    harf_notu = "DD";
                } else if (ortalama >= 50 && ortalama < 60) {
                    harf_notu = "DC";
                } else if (ortalama >= 60 && ortalama < 70) {
                    harf_notu = "CC";
                } else if (ortalama >= 70 && ortalama < 80) {
                    harf_notu = "CB";
                } else if (ortalama >= 80 && ortalama < 85) {
                    harf_notu = "BB";
                } else if (ortalama >= 85 && ortalama < 90) {
                    harf_notu = "BA";
                } else if (ortalama >= 90 && ortalama <= 100) {
                    harf_notu = "AA";
                }

                Object[] objects = {
                    sinavSonuclariResponse.getDersAdi(),
                    sinavSonuclariResponse.getKredi(),
                    sinavSonuclariResponse.getVize(),
                    sinavSonuclariResponse.getFinal(),
                    sinavSonuclariResponse.getButunleme(),
                    String.valueOf(ortalama),
                    harf_notu

                };
                defaultTableModel.addRow(objects);
            }
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btn_kapat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sınav_sonuc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_gano = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Sınav Sonuçları");
        setNormalBounds(new java.awt.Rectangle(100, 50, 140, 0));
        setPreferredSize(new java.awt.Dimension(1370, 600));

        btn_kapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Otomasyon/close.png"))); // NOI18N
        btn_kapat.setText("Kapat");
        btn_kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kapatActionPerformed(evt);
            }
        });

        tbl_sınav_sonuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DERS ADI", "KREDİ", "VİZE", "FİNAL", "BÜTÜNLEME", "ORTALAMA", "HARF NOTU"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_sınav_sonuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sınav_sonucMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sınav_sonuc);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GANO :");
        jLabel1.setToolTipText("");

        lbl_gano.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_gano.setForeground(new java.awt.Color(255, 255, 255));
        lbl_gano.setText("0.00");
        lbl_gano.setName("lbl_gano"); // NOI18N

        jDesktopPane1.setLayer(btn_kapat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbl_gano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(lbl_gano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lbl_gano))
                    .addComponent(btn_kapat))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kapatActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_btn_kapatActionPerformed


    private void tbl_sınav_sonucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sınav_sonucMouseClicked


    }//GEN-LAST:event_tbl_sınav_sonucMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kapat;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_gano;
    private javax.swing.JTable tbl_sınav_sonuc;
    // End of variables declaration//GEN-END:variables
}
