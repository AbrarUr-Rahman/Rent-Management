/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_View;

import Model.DBConnect;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Niloy
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setLocationRelativeTo(null); //center form in the screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUpperPanel = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        jLowerPanel = new javax.swing.JPanel();
        noteLabel = new javax.swing.JLabel();
        userLabel1 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        ownerButton = new javax.swing.JButton();
        customerButton = new javax.swing.JButton();
        passLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jUpperPanel.setBackground(new java.awt.Color(46, 204, 113));

        Header.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Header.setForeground(new java.awt.Color(46, 49, 49));
        Header.setText("House Rental System");

        minLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        minLabel.setText("_");
        minLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minLabelMouseClicked(evt);
            }
        });

        closeLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        closeLabel.setText("X");
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jUpperPanelLayout = new javax.swing.GroupLayout(jUpperPanel);
        jUpperPanel.setLayout(jUpperPanelLayout);
        jUpperPanelLayout.setHorizontalGroup(
            jUpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jUpperPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minLabel)
                .addGap(29, 29, 29)
                .addComponent(closeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jUpperPanelLayout.setVerticalGroup(
            jUpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jUpperPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jUpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeLabel)
                    .addComponent(Header))
                .addGap(19, 19, 19))
            .addGroup(jUpperPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLowerPanel.setBackground(new java.awt.Color(44, 62, 80));

        noteLabel.setFont(new java.awt.Font("Yu Gothic Light", 3, 18)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(207, 0, 15));

        userLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(89, 171, 227));
        userLabel1.setText("USERNAME :");

        userField.setBackground(new java.awt.Color(189, 195, 199));
        userField.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });

        passField.setBackground(new java.awt.Color(189, 195, 199));
        passField.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        loginButton.setBackground(new java.awt.Color(25, 181, 254));
        loginButton.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        ownerButton.setBackground(new java.awt.Color(25, 181, 254));
        ownerButton.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        ownerButton.setText("Create Owner Account");
        ownerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerButtonActionPerformed(evt);
            }
        });

        customerButton.setBackground(new java.awt.Color(25, 181, 254));
        customerButton.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        customerButton.setText("Create Customer Account");
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });

        passLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        passLabel1.setForeground(new java.awt.Color(89, 171, 227));
        passLabel1.setText("PASSWORD :");

        javax.swing.GroupLayout jLowerPanelLayout = new javax.swing.GroupLayout(jLowerPanel);
        jLowerPanel.setLayout(jLowerPanelLayout);
        jLowerPanelLayout.setHorizontalGroup(
            jLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLowerPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLowerPanelLayout.createSequentialGroup()
                        .addGroup(jLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLowerPanelLayout.createSequentialGroup()
                                .addComponent(customerButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                .addComponent(ownerButton))
                            .addGroup(jLowerPanelLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(userLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(passField))))
                        .addGap(103, 103, 103))
                    .addGroup(jLowerPanelLayout.createSequentialGroup()
                        .addGroup(jLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginButton)
                            .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLowerPanelLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(passLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(549, Short.MAX_VALUE)))
        );
        jLowerPanelLayout.setVerticalGroup(
            jLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLowerPanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLabel1))
                .addGap(65, 65, 65)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addGap(15, 15, 15)
                .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerButton)
                    .addComponent(ownerButton))
                .addGap(95, 95, 95))
            .addGroup(jLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLowerPanelLayout.createSequentialGroup()
                    .addGap(207, 207, 207)
                    .addComponent(passLabel1)
                    .addContainerGap(285, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jUpperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jUpperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        // TODO add your handling code here:
        new newCustomerAcc().setVisible(true);
        this.close();
    }//GEN-LAST:event_customerButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        DBConnect log=new DBConnect();
        while(true)
        {
            try 
            {
                if(!log.login(userField.getText(), passField.getText()))
                {
                    noteLabel.setText("Invalid USERNAME or PASSWORD!");
                    break;
                }
                else
                {
                    String check=log.userType(userField.getText());
                    if("customer".equals(check))
                    {
                        new customerHome(userField.getText()).setVisible(true);
                        this.close();
                    }
                    else
                    {
                        new ownerHome(userField.getText()).setVisible(true);
                        this.close();
                    }
                    break;
                }
            } 
            catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void ownerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerButtonActionPerformed
        // TODO add your handling code here:
        new newOwnerAcc().setVisible(true);
        this.close();
    }//GEN-LAST:event_ownerButtonActionPerformed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed
    public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    public void noteSetter(String s)
    {
        noteLabel.setText(s);
    }
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JButton customerButton;
    private javax.swing.JPanel jLowerPanel;
    private javax.swing.JPanel jUpperPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JButton ownerButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel1;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel1;
    // End of variables declaration//GEN-END:variables
}
