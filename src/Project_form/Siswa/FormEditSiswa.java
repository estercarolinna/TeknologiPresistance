/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_form.Siswa;

import Project_Dao.DaoSiswa;
import Project_Dao.DaoTingkatan;
import Project_Entity.Siswa;
import Project_Entity.Tingkatan;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Eidoyonatan
 */
public class FormEditSiswa extends javax.swing.JFrame {

    private DaoSiswa daoSiswa;
    private Siswa Updatetsiswa;
    private FormSiswa formSiswa;

    public void setFormSiswa(FormSiswa formSiswa) {
        this.formSiswa = formSiswa;
    }

    public void setUpdatetsiswa(Siswa Updatetsiswa) {
        this.Updatetsiswa = Updatetsiswa;


        nistxt.setText(Updatetsiswa.getNis());
        namatxt.setText(Updatetsiswa.getNama());
        alamattxt.setText(Updatetsiswa.getAlamat());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strBirthday = sdf.format(Updatetsiswa.getTanggallahir());
        tanggallahirtxt.setText(strBirthday);

        cmbtingkat.setSelectedItem(Updatetsiswa.getTingkatan().getId()
                + " . " + Updatetsiswa.getTingkatan().getTingkatan());
    }

    public void setDaoSiswa(DaoSiswa daoSiswa) {
        this.daoSiswa = daoSiswa;
    }
    private DaoTingkatan daoTingkatan;

    /**
     * Creates new form FormAddSiswa
     */
    public FormEditSiswa(java.awt.Frame parent, boolean modal) {
        initComponents();
        daoTingkatan = new DaoTingkatan();
        List<Tingkatan> tingkatans = daoTingkatan.finds();
        String data[] = new String[tingkatans.size()];
        int index = 0;
        for (Tingkatan obj : tingkatans) {
            data[index] = obj.getId() + "." + obj.getTingkatan();
            ++index;
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(data);
        cmbtingkat.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_edit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nistxt = new javax.swing.JTextField();
        namatxt = new javax.swing.JTextField();
        alamattxt = new javax.swing.JTextField();
        tanggallahirtxt = new javax.swing.JTextField();
        cmbtingkat = new javax.swing.JComboBox();
        btn_cancel = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        jLabel5.setText("Tingkat");

        jLabel4.setText("Tanggal Lahir");

        jLabel3.setText("Alamat");

        jLabel2.setText("Nama");

        jLabel1.setText("Nis");

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nistxt, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(namatxt)
                            .addComponent(alamattxt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanggallahirtxt)
                            .addComponent(cmbtingkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nistxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alamattxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tanggallahirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmbtingkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_edit)
                    .addComponent(btn_cancel))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Personal  personal = new Personal();
            Updatetsiswa.setNis(nistxt.getText());
            Updatetsiswa.setNama(namatxt.getText());
            Updatetsiswa.setAlamat(alamattxt.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date birDate = sdf.parse(tanggallahirtxt.getText());
            Updatetsiswa.setTanggallahir(birDate);

            StringTokenizer token = new StringTokenizer(cmbtingkat.getSelectedItem().toString(), ". ");
            Long idGroup = Long.parseLong(token.nextToken());
            Tingkatan tmp = daoTingkatan.find(idGroup);

            Updatetsiswa.setTingkatan(tmp);

            daoSiswa.update(Updatetsiswa);

            dispose();
            

        } catch (ParseException ex) {
            Logger.getLogger(FormEditSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormAddSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormAddSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormAddSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormAddSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormAddSiswa().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamattxt;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_edit;
    private javax.swing.JComboBox cmbtingkat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namatxt;
    private javax.swing.JTextField nistxt;
    private javax.swing.JTextField tanggallahirtxt;
    // End of variables declaration//GEN-END:variables
}
