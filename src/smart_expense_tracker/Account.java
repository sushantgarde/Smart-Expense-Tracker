/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smart_expense_tracker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Account extends javax.swing.JFrame {

    Connection conn = Connect.Connecttodb();
    PreparedStatement pst;
    ResultSet rs;
    double income,expense;
    /**
     * Creates new form Account
     */
    public Account() {
        initComponents();
        loaddetails();
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
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txttotalincome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttotalexpense = new javax.swing.JTextField();
        txtprofitloss = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1125, 50));
        setUndecorated(true);
        setSize(new java.awt.Dimension(270, 810));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 60, 42));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Name ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, 30));

        txtname.setEditable(false);
        txtname.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 220, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, 30));

        txtusername.setEditable(false);
        txtusername.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 220, 40));

        txttotalincome.setEditable(false);
        txttotalincome.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(txttotalincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 220, 40));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Total Income");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, 50));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Total Expense");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 140, 50));

        txttotalexpense.setEditable(false);
        txttotalexpense.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(txttotalexpense, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 220, 40));

        txtprofitloss.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtprofitloss.setToolTipText("");
        getContentPane().add(txtprofitloss, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 330, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account.png"))); // NOI18N
        jLabel5.setText("Account");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 350, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loaddetails(){
        String username = LogIn.SharedData.username;
        try {
            String sql = "SELECT SUM(AMOUNT) AS TOTAL_INCOME FROM INCOME where USERNAME=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
            if(rs.next()){
                double totalAmountincome = rs.getDouble("TOTAL_INCOME");
                income = totalAmountincome;
                String amount = String.valueOf(totalAmountincome);
                txttotalincome.setText(amount);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String sql = "SELECT SUM(AMOUNT) AS TOTAL_EXPENSE FROM EXPENSE where USERNAME=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, username );
            rs = pst.executeQuery();
            if(rs.next()){
                double totalAmountexpense = rs.getDouble("TOTAL_EXPENSE");
                expense = totalAmountexpense;
                String amount = String.valueOf(totalAmountexpense);
                txttotalexpense.setText(amount);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql1 = "SELECT USERNAME,NAME FROM SIGNUP WHERE USERNAME=?";
        try {
            pst = conn.prepareStatement(sql1);
            pst.setString(1, username);
             rs = pst.executeQuery();
             if(rs.next()){
                 String name = rs.getString("NAME");
                 String Username = rs.getString("USERNAME");
                 txtname.setText(name);
                 txtusername.setText(Username);
             }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(income < expense){
            txtprofitloss.setText("Loss of "+(expense-income));
        }
        else{
            txtprofitloss.setText("Profit of "+(income-expense));
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtname;
    private javax.swing.JToggleButton txtprofitloss;
    private javax.swing.JTextField txttotalexpense;
    private javax.swing.JTextField txttotalincome;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
