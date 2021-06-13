
import java.sql.*;
import java.awt.Dimension;

import javax.swing.JOptionPane;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Patient_signuppage extends javax.swing.JFrame {

    /**
     * Creates new form Patient_signuppage
     */
    public Patient_signuppage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        p_age = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        p_date = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        p_bloodgroup = new javax.swing.JTextField();
        p_name = new javax.swing.JTextField();
        p_phonenumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p_emailid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        p_address = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Date");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(42, 127, 186));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Details");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 90));

        jButton1.setBackground(new java.awt.Color(42, 127, 186));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 90, 40));

        jButton2.setBackground(new java.awt.Color(42, 127, 186));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 90, 40));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 40));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 90, 40));
        jPanel1.add(p_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 50, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Phone Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, 40));

        p_date.setBackground(new java.awt.Color(255, 255, 255));
        p_date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(p_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 140, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Blood Group");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, 40));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 80, 30));

        p_bloodgroup.setBackground(new java.awt.Color(255, 255, 255));
        p_bloodgroup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(p_bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 70, 30));

        p_name.setBackground(new java.awt.Color(255, 255, 255));
        p_name.setForeground(new java.awt.Color(0, 0, 0));
        p_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(p_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 30));

        p_phonenumber.setBackground(new java.awt.Color(255, 255, 255));
        p_phonenumber.setForeground(new java.awt.Color(0, 0, 0));
        p_phonenumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(p_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 170, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, 40));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 40));

        p_emailid.setBackground(new java.awt.Color(255, 255, 255));
        p_emailid.setForeground(new java.awt.Color(0, 0, 0));
        p_emailid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(p_emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 200, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("+91");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 40, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        p_address.setBackground(new java.awt.Color(255, 255, 255));
        p_address.setColumns(20);
        p_address.setRows(5);
        jScrollPane1.setViewportView(p_address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 110, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 870, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:    patient_Loginform
        dispose();
        patient_Loginform ps = new patient_Loginform();
        ps.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String patientname = p_name.getText();
        String phonenumber = p_phonenumber.getText();
        String EmailId = p_emailid.getText();
        String Gender = (String) jComboBox1.getSelectedItem();
        String bloodgroup = p_bloodgroup.getText();
        String dateofbirth = p_date.getText();
        String address = p_address.getText();
        int age = (Integer) p_age.getValue();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://bsodd4fwcjnds07m8f9v-mysql.services.clever-cloud.com/bsodd4fwcjnds07m8f9v?useSSL=false", "u3qctvs2k0aq4900", "KQ6ciVFMkN41tXdrw8gY");
            Statement stm = con.createStatement();
            String createQuery = "Insert into patient_account values('" + patientname + "','" + dateofbirth + "','" + age + "','" + Gender + "','" + EmailId + "','" + bloodgroup + "','" + phonenumber + "','" + address + "' );";
            stm.execute(createQuery);
            JOptionPane.showMessageDialog(this, "Patient Profile Created!");
            p_address.setText("");
            p_age.setValue(Integer.parseInt("0"));
            p_bloodgroup.setText("");
            p_date.setText("");
            p_emailid.setText("");
           jComboBox1.setSelectedIndex(0);
            p_name.setText("");
            p_phonenumber.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter valid details");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Patient_signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_signuppage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea p_address;
    private javax.swing.JSpinner p_age;
    private javax.swing.JTextField p_bloodgroup;
    private javax.swing.JTextField p_date;
    private javax.swing.JTextField p_emailid;
    private javax.swing.JTextField p_name;
    private javax.swing.JTextField p_phonenumber;
    // End of variables declaration//GEN-END:variables
}
