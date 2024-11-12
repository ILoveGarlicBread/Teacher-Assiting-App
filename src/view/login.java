/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.TeacherController;
import javax.swing.JOptionPane;
import view.roundedBorder;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
/**
 *
 * @author lam
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        newuserButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        passwordbuttonseparator = new javax.swing.JSeparator();
        newuserloginseparator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 300));

        jPanel1.setBackground(new java.awt.Color(67, 76, 94));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        emailLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(emailLabel, gridBagConstraints);

        emailField.setBackground(new java.awt.Color(76, 86, 106));
        emailField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        emailField.setForeground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(emailField, gridBagConstraints);

        passwordLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(passwordLabel, gridBagConstraints);

        passwordField.setBackground(new java.awt.Color(76, 86, 106));
        passwordField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(passwordField, gridBagConstraints);

        newuserButton.setBackground(new java.awt.Color(143, 188, 187));
        newuserButton.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        newuserButton.setForeground(new java.awt.Color(46, 52, 64));
        newuserButton.setText("New user");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel1.add(newuserButton, gridBagConstraints);

        loginButton.setBackground(new java.awt.Color(129, 161, 193));
        loginButton.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(46, 52, 64));
        loginButton.setText("Login");
        loginButton.setToolTipText("");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        jPanel1.add(loginButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(passwordbuttonseparator, gridBagConstraints);

        newuserloginseparator.setBackground(new java.awt.Color(76, 86, 106));
        newuserloginseparator.setForeground(new java.awt.Color(76, 86, 106));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 4;
        jPanel1.add(newuserloginseparator, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        TeacherController teacherController = new TeacherController();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        boolean isAuthenticated = teacherController.authenticateUser(email, password);
        if(isAuthenticated){
            dispose();
            Main mainapp = new Main();
            mainapp.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Login failed, check your email and password.");
        }
    }//GEN-LAST:event_loginButtonMouseClicked

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
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.err.println("Failed to initialize FlatLaf");
        }
        
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton newuserButton;
    private javax.swing.JSeparator newuserloginseparator;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JSeparator passwordbuttonseparator;
    // End of variables declaration//GEN-END:variables
}