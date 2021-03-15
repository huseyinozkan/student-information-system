/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otomasyon;

import Lib.Lib;
import RequestModel.AkademikRequest;
import RequestModel.DataRequest;
import RequestModel.OgrenciRequest;
import ResponseModel.AkademikResponse;
import ResponseModel.DataResponse;
import ResponseModel.OgrenciResponse;
import com.google.gson.reflect.TypeToken;
import java.awt.Component;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huseyin
 */
public class AkademikListForm extends javax.swing.JInternalFrame {

    List<AkademikResponse> akademikResponseList;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form OgrenciListForm
     */

    private Component backForm;

    public AkademikListForm(Component backForm) {
        initComponents();

        this.backForm = backForm;

        Toolkit tk = Toolkit.getDefaultToolkit();
        int withSize = ((int) tk.getScreenSize().getWidth());
        int heightSize = ((int) tk.getScreenSize().getHeight()) - 150;
        this.setSize(withSize, heightSize);

        defaultTableModel = (DefaultTableModel) tbl_akademik_list.getModel();

        akademikList();

    }

    public void akademikList() {
        String filtre = "%" + edt_filtre.getText() + "%";
        AkademikRequest akademikRequest = new AkademikRequest();
        akademikRequest.setFiltre(filtre);

        String json = Lib.jsonResponse("akademik_list", new DataRequest(akademikRequest));
        DataResponse<AkademikResponse> dataResponse = Lib.gson.fromJson(json, new TypeToken<DataResponse<AkademikResponse>>() {
        }.getType());

        akademikResponseList = dataResponse.getData(this);
        if (akademikResponseList != null) {
            defaultTableModel.setRowCount(0);
            for (AkademikResponse akademikResponse : akademikResponseList) {
                Object[] objects = {
                    akademikResponse.getId(),
                    akademikResponse.getAdSoyad(),
                    akademikResponse.getKullaniciAdi(),
                    akademikResponse.getSifre(),
                    akademikResponse.getTc(),
                    akademikResponse.getBrans(),
                    akademikResponse.getMail(),
                    akademikResponse.getTelefon(),
                    akademikResponse.getIl(),
                    akademikResponse.getIlce(),
                    akademikResponse.getDogumTarihi()
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
        tbl_akademik_list = new javax.swing.JTable();
        btn_ekle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        edt_filtre = new javax.swing.JTextField();
        btn_filtrele = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Akademisyen Listesi");
        setNormalBounds(new java.awt.Rectangle(100, 50, 140, 0));
        setPreferredSize(new java.awt.Dimension(1370, 600));

        btn_kapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Otomasyon/close.png"))); // NOI18N
        btn_kapat.setText("Kapat");
        btn_kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kapatActionPerformed(evt);
            }
        });

        tbl_akademik_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "AD SOYAD", "KULLANICI ADI", "SİFRE", "TC", "BRANŞ", "MAİL", "TELEFON", "İL", "İLCE", "DOĞUM TARİHİ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_akademik_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_akademik_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_akademik_list);

        btn_ekle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Otomasyon/add.png"))); // NOI18N
        btn_ekle.setText("Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });

        btn_sil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Otomasyon/delete.png"))); // NOI18N
        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_guncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Otomasyon/update.png"))); // NOI18N
        btn_guncelle.setText("Güncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_filtrele.setText("Filtrele");
        btn_filtrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtreleActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btn_kapat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_ekle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_sil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_guncelle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edt_filtre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_filtrele, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(edt_filtre, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_filtrele)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edt_filtre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_filtrele))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kapat)
                    .addComponent(btn_ekle)
                    .addComponent(btn_sil)
                    .addComponent(btn_guncelle))
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

    private void ogrenci_sil() {

        String id = defaultTableModel.getValueAt(tbl_akademik_list.getSelectedRow(), 0).toString();

        AkademikRequest akademikRequest = new AkademikRequest();
        akademikRequest.setId(id);
        String json = Lib.jsonResponse("delete_akademik", new DataRequest(akademikRequest));
        DataResponse<AkademikResponse> dataResponse = Lib.gson.fromJson(json, new TypeToken<DataResponse<AkademikResponse>>() {
        }.getType());

        akademikResponseList = dataResponse.getData(this);
        if (akademikResponseList != null) {
            akademikList();
        }

    }

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        if (tbl_akademik_list.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(backForm, "Satır Seçiniz!");
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(backForm, "Silmek İstediğinize Emin misiniz?", "Uyarı", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                ogrenci_sil();
            }
        }

    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed

        AkademikEditForm akademikEditForm = new AkademikEditForm(null, true, this);
        akademikEditForm.show();
        akademikList();

    }//GEN-LAST:event_btn_ekleActionPerformed

    private void akademikGuncelle() {
        if (tbl_akademik_list.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen Akademisyen Seçiniz!");
        } else {

            int row = tbl_akademik_list.getSelectedRow();

            String id = defaultTableModel.getValueAt(row, 0).toString();
            String ad_soyad = defaultTableModel.getValueAt(row, 1).toString();
            String kullanici_adi = defaultTableModel.getValueAt(row, 2).toString();
            String sifre = defaultTableModel.getValueAt(row, 3).toString();
            String tc = defaultTableModel.getValueAt(row, 4).toString();
            String brans = defaultTableModel.getValueAt(row, 5).toString();
            String mail = defaultTableModel.getValueAt(row, 6).toString();
            String telefon = defaultTableModel.getValueAt(row, 7).toString();
            String il = defaultTableModel.getValueAt(row, 8).toString();
            String ilce = defaultTableModel.getValueAt(row, 9).toString();
            String dogum_tarihi = defaultTableModel.getValueAt(row, 10).toString();

            AkademikEditForm akademikEditForm = new AkademikEditForm(null, true, this, id, kullanici_adi, ad_soyad, tc, sifre, brans, mail, telefon, il, ilce, dogum_tarihi);
            akademikEditForm.show();
            akademikList();
        }
    }
    
    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
        
        akademikGuncelle();

    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void btn_filtreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtreleActionPerformed
        if (edt_filtre.getText() != "") {
            akademikList();
        }

    }//GEN-LAST:event_btn_filtreleActionPerformed

    private void tbl_akademik_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_akademik_listMouseClicked

        if (evt.getClickCount() == 2) {
            akademikGuncelle();
        }

    }//GEN-LAST:event_tbl_akademik_listMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_filtrele;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_kapat;
    private javax.swing.JButton btn_sil;
    private javax.swing.JTextField edt_filtre;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_akademik_list;
    // End of variables declaration//GEN-END:variables
}
