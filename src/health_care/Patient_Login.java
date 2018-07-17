/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health_care;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Aunshon
 */
public class Patient_Login extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    
    public Patient_Login() {
        setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("hospital.png")));
        setTitle("Patient Login");
        initComponents();
        conn=Health_Care_Database_Connection.ConnecrDb();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        usernamef = new javax.swing.JTextField();
        passwordf = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Patient Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 120, 30));
        jPanel1.add(usernamef, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 290, 30));

        passwordf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfActionPerformed(evt);
            }
        });
        jPanel1.add(passwordf, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 290, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        jLabel4.setText("Report Or Forgot Password ?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        jLabel5.setText("Register now ?");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 100, 30));

        id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 110, 80));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/patient.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 860, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           new Home().setVisible(true);
           dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Patient_Register().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Patient_Passwoerd_Recovery().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    public void info(){
        try{
            
            String query="select * from tbl_patient where P_username='"+usernamef.getText()+"' and P_username='"+passwordf.getText()+"'";
            pst=conn.prepareStatement(query);
            rs = pst.executeQuery();
            while(rs.next()){
                id.setText(rs.getString("P_id"));
            }
            pst.close();
            rs.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String query=("select * from tbl_patient where P_username=? and P_password=?");
        try{
            pst=conn.prepareStatement(query);
            pst.setString(1,usernamef.getText());
            pst.setString(2,passwordf.getText());
            rs=pst.executeQuery();

            int count=0;
            while(rs.next()){

                count=count+1;
            }

            if (count==1){
                
                info();
                String user=usernamef.getText();
                String pass=passwordf.getText();
                
                new patient_galary().setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Wrong username or password");
            }
            

            rs.close();
            pst.close();
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

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
            java.util.logging.Logger.getLogger(Patient_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordf;
    private javax.swing.JTextField usernamef;
    // End of variables declaration//GEN-END:variables

}
