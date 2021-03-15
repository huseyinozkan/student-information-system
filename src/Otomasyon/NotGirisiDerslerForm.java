/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otomasyon;

import Lib.Lib;
import RequestModel.DataRequest;
import RequestModel.NotGirisiDersListesiRequest;
import ResponseModel.DataResponse;
import ResponseModel.NotGirisiDersListesiResponse;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huseyin
 */
public class NotGirisiDerslerForm extends javax.swing.JDialog {

    List<NotGirisiDersListesiResponse> notGirisiDersListesiResponseList;
    DefaultTableModel defaultTableModel;
    private String kullanici_adi;

    /**
     * Creates new form NotGirisiDerslerForm
     */
    public NotGirisiDerslerForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public NotGirisiDerslerForm(java.awt.Frame parent, boolean modal, String kullanici_adi) {
        super(parent, modal);
        initComponents();
        this.kullanici_adi = kullanici_adi;

        not_girisi_ders_listesi();
    }

    public void not_girisi_ders_listesi() {
        defaultTableModel = (DefaultTableModel) tbl_dersler.getModel();

        NotGirisiDersListesiRequest notGirisiDersListesiRequest = new NotGirisiDersListesiRequest();
        notGirisiDersListesiRequest.setKullaniciAdi(this.kullanici_adi);

        String json = Lib.jsonResponse("not_girisi_ders_listesi", new DataRequest(notGirisiDersListesiRequest));
        DataResponse<NotGirisiDersListesiResponse> dataResponse = Lib.gson.fromJson(json, new TypeToken<DataResponse<NotGirisiDersListesiResponse>>() {
        }.getType());

        notGirisiDersListesiResponseList = dataResponse.getData(this);
        if (notGirisiDersListesiResponseList != null) {
            defaultTableModel.setRowCount(0);
            for (NotGirisiDersListesiResponse notGirisiDersListesiResponse : notGirisiDersListesiResponseList) {
                Object[] objects = {
                    notGirisiDersListesiResponse.getDersAdi(),
                    notGirisiDersListesiResponse.getKredi(),
                    notGirisiDersListesiResponse.getDonem()
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dersler = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ders Listesi");
        setBounds(new java.awt.Rectangle(350, 100, 0, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Otomasyon/ok.png"))); // NOI18N
        jButton1.setText("Seç");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Dersler");

        tbl_dersler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DERS ADI", "KREDİ", "DONEM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_dersler);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Otomasyon/close.png"))); // NOI18N
        jButton2.setText("Vazgeç");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (tbl_dersler.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen Ders Seciniz");
        } else {
            String secili_ders = defaultTableModel.getValueAt(tbl_dersler.getSelectedRow(), 0).toString();

            NotGirisiForm notGirisiForm = new NotGirisiForm(null, true, this.kullanici_adi, secili_ders);
            notGirisiForm.show();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NotGirisiDerslerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotGirisiDerslerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotGirisiDerslerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotGirisiDerslerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NotGirisiDerslerForm dialog = new NotGirisiDerslerForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_dersler;
    // End of variables declaration//GEN-END:variables
}