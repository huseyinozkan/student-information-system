/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otomasyon;

import Lib.Lib;
import RequestModel.DataRequest;
import RequestModel.OgrenciKimlikRequest;
import RequestModel.OgrenciRequest;
import RequestModel.OgretmenKimlikRequest;
import ResponseModel.DataResponse;
import ResponseModel.OgrenciKimlikResponse;
import ResponseModel.OgrenciResponse;
import ResponseModel.OgretmenKimlikResponse;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author huseyin
 */
public class OgrenciKimlikForm extends javax.swing.JDialog {
    
    private String kullanici_adi;

    /**
     * Creates new form OgretmenKimlikForm
     */
    public OgrenciKimlikForm(java.awt.Frame parent, boolean modal, String kullanici_adi) {
        super(parent, modal);
        initComponents();
        
        this.kullanici_adi = kullanici_adi;
        
        bilgileri_getir();
    }

    private OgrenciKimlikForm(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void bilgileri_getir(){
        List<OgrenciKimlikResponse> ogrenciKimlikResponseList;
        
        OgrenciKimlikRequest ogrenciKimlikRequest = new OgrenciKimlikRequest();
        ogrenciKimlikRequest.setKullaniciAdi(this.kullanici_adi);

        String json = Lib.jsonResponse("ogrenci_kimlik_list", new DataRequest(ogrenciKimlikRequest));
        DataResponse<OgrenciKimlikResponse> dataResponse = Lib.gson.fromJson(json, new TypeToken<DataResponse<OgrenciKimlikResponse>>() {
        }.getType());

        ogrenciKimlikResponseList = dataResponse.getData(this);
        if (ogrenciKimlikResponseList != null) {
            for (OgrenciKimlikResponse ogrenciKimlikResponse : ogrenciKimlikResponseList) {
                    lbl_ad_soyad.setText(ogrenciKimlikResponse.getAdSoyad());
                    lbl_sinif.setText(ogrenciKimlikResponse.getSinif());
                    lbl_bolum.setText(ogrenciKimlikResponse.getBolum());
                    lbl_ogrenci_no.setText(ogrenciKimlikResponse.getOgrenciNo());
                    lbl_tc.setText(ogrenciKimlikResponse.getTc());
                    lbl_mail.setText(ogrenciKimlikResponse.getMail());
                    lbl_telefon.setText(ogrenciKimlikResponse.getTelefon());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_ad_soyad = new javax.swing.JLabel();
        lbl_sinif = new javax.swing.JLabel();
        lbl_bolum = new javax.swing.JLabel();
        lbl_ogrenci_no = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_tc = new javax.swing.JLabel();
        lbl_mail = new javax.swing.JLabel();
        lbl_telefon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Ad Soyad :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("S??n??f :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("B??l??m :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("????renci No :");

        lbl_ad_soyad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_ad_soyad.setForeground(new java.awt.Color(0, 0, 102));
        lbl_ad_soyad.setText("...");

        lbl_sinif.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_sinif.setForeground(new java.awt.Color(0, 0, 102));
        lbl_sinif.setText("...");

        lbl_bolum.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_bolum.setForeground(new java.awt.Color(0, 0, 102));
        lbl_bolum.setText("...");

        lbl_ogrenci_no.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_ogrenci_no.setForeground(new java.awt.Color(0, 0, 102));
        lbl_ogrenci_no.setText("...");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Telefon :");

        lbl_tc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_tc.setForeground(new java.awt.Color(0, 0, 102));
        lbl_tc.setText("...");

        lbl_mail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_mail.setForeground(new java.awt.Color(0, 0, 102));
        lbl_mail.setText("...");

        lbl_telefon.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_telefon.setForeground(new java.awt.Color(0, 0, 102));
        lbl_telefon.setText("...");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Tc :");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Mail :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ogrenci_no)
                            .addComponent(lbl_bolum)
                            .addComponent(lbl_sinif)
                            .addComponent(lbl_ad_soyad)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_mail)
                            .addComponent(lbl_tc)
                            .addComponent(lbl_telefon))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_ad_soyad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_sinif))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_bolum))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_ogrenci_no))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_tc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbl_mail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_telefon))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(OgretmenKimlikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OgretmenKimlikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OgretmenKimlikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OgretmenKimlikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OgrenciKimlikForm dialog = new OgrenciKimlikForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_ad_soyad;
    private javax.swing.JLabel lbl_bolum;
    private javax.swing.JLabel lbl_mail;
    private javax.swing.JLabel lbl_ogrenci_no;
    private javax.swing.JLabel lbl_sinif;
    private javax.swing.JLabel lbl_tc;
    private javax.swing.JLabel lbl_telefon;
    // End of variables declaration//GEN-END:variables
}
