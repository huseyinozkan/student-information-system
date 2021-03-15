/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otomasyon;

import Lib.Lib;
import RequestModel.DataRequest;
import RequestModel.OgrenciDersProgramiRequest;
import RequestModel.OgretmenDersSaatRequest;
import ResponseModel.DataResponse;
import ResponseModel.OgrenciDersProgramiResponse;
import ResponseModel.OgretmenDersSaatResponse;
import com.google.gson.reflect.TypeToken;
import java.awt.Component;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huseyin
 */
public class OgrenciDersProgramiListForm extends javax.swing.JInternalFrame {

    List<OgrenciDersProgramiResponse> ogrenciDersProgramiResponseList;
    DefaultTableModel defaultTableModel;
    String Kullanici_Adi;
    /**
     * Creates new form OgrenciListForm
     */

    private Component backForm;

    public OgrenciDersProgramiListForm(Component backForm, String Kullanici_Adi) {
        initComponents();

        this.backForm = backForm;
        this.Kullanici_Adi = Kullanici_Adi;

        Toolkit tk = Toolkit.getDefaultToolkit();
        int withSize = ((int) tk.getScreenSize().getWidth());
        int heightSize = ((int) tk.getScreenSize().getHeight()) - 150;
        this.setSize(withSize, heightSize);

        defaultTableModel = (DefaultTableModel) tbl_ogrenci_ders_programi.getModel();

        ogrenciDersProgramiList();

    }

    public void ogrenciDersProgramiList() {
        OgrenciDersProgramiRequest ogrenciDersProgramiRequest = new OgrenciDersProgramiRequest();
        ogrenciDersProgramiRequest.setOgrenciNo(this.Kullanici_Adi);

        String json = Lib.jsonResponse("ogrenci_ders_programi_list", new DataRequest(ogrenciDersProgramiRequest));
        DataResponse<OgrenciDersProgramiResponse> dataResponse = Lib.gson.fromJson(json, new TypeToken<DataResponse<OgrenciDersProgramiResponse>>() {
        }.getType());

        ogrenciDersProgramiResponseList = dataResponse.getData(this);
        if (ogrenciDersProgramiResponseList != null) {
            defaultTableModel.setRowCount(0);
            for (OgrenciDersProgramiResponse ogrenciDersprogramiResponse : ogrenciDersProgramiResponseList) {
                Object[] objects = {
                    ogrenciDersprogramiResponse.getGun(),
                    ogrenciDersprogramiResponse.getDersAdi(),
                    ogrenciDersprogramiResponse.getSaati(),
                    ogrenciDersprogramiResponse.getKredi(),
                    ogrenciDersprogramiResponse.getAdSoyad()
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
        tbl_ogrenci_ders_programi = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ders Programı");
        setNormalBounds(new java.awt.Rectangle(100, 50, 140, 0));
        setPreferredSize(new java.awt.Dimension(1370, 600));

        btn_kapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Otomasyon/close.png"))); // NOI18N
        btn_kapat.setText("Kapat");
        btn_kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kapatActionPerformed(evt);
            }
        });

        tbl_ogrenci_ders_programi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GÜN", "DERS ADI", "SAATİ", "KREDİ", "ÖĞRETMEN ADI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ogrenci_ders_programi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ogrenci_ders_programiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_ogrenci_ders_programi);

        jDesktopPane1.setLayer(btn_kapat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_kapat)
                .addContainerGap())
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

 

  
    private void tbl_ogrenci_ders_programiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ogrenci_ders_programiMouseClicked


    }//GEN-LAST:event_tbl_ogrenci_ders_programiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kapat;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ogrenci_ders_programi;
    // End of variables declaration//GEN-END:variables
}
