/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;



import view.roundedBorder;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author lam
 */
public class Main extends javax.swing.JFrame {

  /**
   * Creates new form Main
   */
  public Main() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        studentButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        classesButton = new javax.swing.JButton();
        calenderButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        topPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        datePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        sidePanel.setBackground(new java.awt.Color(46, 52, 64));

        studentButton.setBackground(new java.awt.Color(191, 97, 106));
        studentButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        studentButton.setForeground(new java.awt.Color(46, 52, 64));
        studentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/graduation.png"))); // NOI18N
        studentButton.setText("Students");
        studentButton.setBorder(new roundedBorder(30));
        studentButton.setBorderPainted(false);
        studentButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        studentButton.setIconTextGap(15);
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });

        reportButton.setBackground(new java.awt.Color(235, 203, 139));
        reportButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        reportButton.setForeground(new java.awt.Color(46, 52, 64));
        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/report.png"))); // NOI18N
        reportButton.setText("Report");
        reportButton.setBorder(new roundedBorder(30));
        reportButton.setBorderPainted(false);
        reportButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reportButton.setIconTextGap(15);

        classesButton.setBackground(new java.awt.Color(208, 135, 112));
        classesButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        classesButton.setForeground(new java.awt.Color(46, 52, 64));
        classesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/profile.png"))); // NOI18N
        classesButton.setText("Classes");
        classesButton.setBorder(new roundedBorder(30));
        classesButton.setBorderPainted(false);
        classesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        classesButton.setIconTextGap(15);

        calenderButton.setBackground(new java.awt.Color(163, 190, 140));
        calenderButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        calenderButton.setForeground(new java.awt.Color(46, 52, 64));
        calenderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/calendar.png"))); // NOI18N
        calenderButton.setText("Calender");
        calenderButton.setBorder(new roundedBorder(30));
        calenderButton.setBorderPainted(false);
        calenderButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        calenderButton.setIconTextGap(15);

        accountButton.setBackground(new java.awt.Color(180, 142, 173));
        accountButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        accountButton.setForeground(new java.awt.Color(46, 52, 64));
        accountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user.png"))); // NOI18N
        accountButton.setText("Account");
        accountButton.setBorder(new roundedBorder(30));
        accountButton.setBorderPainted(false);
        accountButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accountButton.setIconTextGap(15);

        settingsButton.setBackground(new java.awt.Color(143, 188, 187));
        settingsButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        settingsButton.setForeground(new java.awt.Color(46, 52, 64));
        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/setting.png"))); // NOI18N
        settingsButton.setText("Settings");
        settingsButton.setBorder(new roundedBorder(30));
        settingsButton.setBorderPainted(false);
        settingsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settingsButton.setIconTextGap(15);

        dashboardButton.setBackground(new java.awt.Color(129, 161, 193));
        dashboardButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(46, 52, 64));
        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dashboard.png"))); // NOI18N
        dashboardButton.setText("Dashboard");
        dashboardButton.setBorder(new roundedBorder(30));
        dashboardButton.setBorderPainted(false);
        dashboardButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardButton.setIconTextGap(15);

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(studentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addComponent(classesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addComponent(calenderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addComponent(accountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(classesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calenderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1562, Short.MAX_VALUE))
        );

        topPanel.setBackground(new java.awt.Color(67, 76, 94));

        mainPanel.setBackground(new java.awt.Color(67, 76, 94));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1033, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1077, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        datePanel.setBackground(new java.awt.Color(46, 52, 64));

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1095, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_studentButtonActionPerformed
    // TODO add your handling code here:
  }// GEN-LAST:event_studentButtonActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the default
     * look and feel.
     * For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      UIManager.setLookAndFeel(new FlatLightLaf());
    } catch (Exception e) {
      System.err.println("Failed to initialize FlatLaf");
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Main().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JButton calenderButton;
    private javax.swing.JButton classesButton;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JPanel datePanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JButton studentButton;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}