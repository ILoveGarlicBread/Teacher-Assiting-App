/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import view.roundedBorder;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import controller.*;
import javax.swing.JOptionPane;


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
  LocalDate dateObj = LocalDate.now();
  DateTimeFormatter dayFormat = DateTimeFormatter.ofPattern("dd");
  DateTimeFormatter monthFormat = DateTimeFormatter.ofPattern("MMM");
  public String dayTime(){
      return dateObj.format(dayFormat);
  }
  public String monthTime(){
      return dateObj.format(monthFormat);
  }
  public void loadStudentData(){
      StudentController studentcontroller = new StudentController();
      studentcontroller.loadStudentTable(studentTable);
  }
  public boolean insertStudentData(String name,String email){
      StudentController studentcontroller = new StudentController();
      return studentcontroller.insertStudentTable(name, email);
  }  
  public boolean deleteStudentData(int ID){
      StudentController studentcontroller = new StudentController();
      return studentcontroller.deleteStudentTable(ID);
  }
  public boolean updateStudentData(String name, int ID, String email){
      StudentController studentcontroller = new StudentController();
      return studentcontroller.updateStudentTable(name, ID, email);
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

        jTextField1 = new javax.swing.JTextField();
        sidePanel = new javax.swing.JPanel();
        studentButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        classesButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        datePanel = new javax.swing.JPanel();
        dayLabel = new javax.swing.JLabel();
        monthLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JTabbedPane();
        dashboardPanel = new javax.swing.JPanel();
        studentsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        studentaddButton = new javax.swing.JButton();
        studentnameTextField = new javax.swing.JTextField();
        studentemailTextField = new javax.swing.JTextField();
        studentdeleteButton = new javax.swing.JButton();
        studentupdateButton = new javax.swing.JButton();
        studentsearchButton = new javax.swing.JButton();
        reportPanel = new javax.swing.JPanel();
        accountPanel = new javax.swing.JPanel();
        settingPanel = new javax.swing.JPanel();
        classesPanel = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(46, 52, 64));

        studentButton.setBackground(new java.awt.Color(46, 52, 64));
        studentButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        studentButton.setForeground(new java.awt.Color(229, 233, 240));
        studentButton.setText("Students");
        studentButton.setBorderPainted(false);
        studentButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        studentButton.setIconTextGap(15);
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });

        reportButton.setBackground(new java.awt.Color(46, 52, 64));
        reportButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        reportButton.setForeground(new java.awt.Color(229, 233, 240));
        reportButton.setText("Report");
        reportButton.setBorderPainted(false);
        reportButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reportButton.setIconTextGap(15);
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        classesButton.setBackground(new java.awt.Color(46, 52, 64));
        classesButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        classesButton.setForeground(new java.awt.Color(229, 233, 240));
        classesButton.setText("Classes");
        classesButton.setBorderPainted(false);
        classesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        classesButton.setIconTextGap(15);
        classesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classesButtonActionPerformed(evt);
            }
        });

        accountButton.setBackground(new java.awt.Color(46, 52, 64));
        accountButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        accountButton.setForeground(new java.awt.Color(229, 233, 240));
        accountButton.setText("Account");
        accountButton.setBorderPainted(false);
        accountButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accountButton.setIconTextGap(15);
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        settingsButton.setBackground(new java.awt.Color(46, 52, 64));
        settingsButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        settingsButton.setForeground(new java.awt.Color(229, 233, 240));
        settingsButton.setText("Settings");
        settingsButton.setBorderPainted(false);
        settingsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settingsButton.setIconTextGap(15);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        dashboardButton.setBackground(new java.awt.Color(59, 66, 81));
        dashboardButton.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(229, 233, 240));
        dashboardButton.setText("Dashboard");
        dashboardButton.setBorderPainted(false);
        dashboardButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardButton.setIconTextGap(15);
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(accountButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(classesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 199, 220, 670));

        datePanel.setBackground(new java.awt.Color(46, 52, 64));

        dayLabel.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        dayLabel.setForeground(new java.awt.Color(229, 233, 240));
        dayLabel.setText(LocalDate.now().format(dayFormat));

        monthLabel.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        monthLabel.setForeground(new java.awt.Color(136, 192, 208));
        monthLabel.setText(dateObj.format(monthFormat));

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayLabel)
                    .addComponent(monthLabel))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        getContentPane().add(datePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        mainPanel.setBackground(new java.awt.Color(76, 86, 106));

        dashboardPanel.setBackground(new java.awt.Color(59, 66, 82));

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );

        mainPanel.addTab("tab1", dashboardPanel);

        studentsPanel.setBackground(new java.awt.Color(59, 66, 82));

        jScrollPane1.setForeground(new java.awt.Color(153, 255, 255));

        studentTable.setBackground(new java.awt.Color(59, 66, 82));
        studentTable.setForeground(new java.awt.Color(229, 233, 240));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        studentTable.setFocusable(false);
        studentTable.setGridColor(new java.awt.Color(229, 233, 240));
        studentTable.getTableHeader().setBackground(new java.awt.Color(76, 86, 106));
        studentTable.getTableHeader().setForeground(new java.awt.Color(229, 233, 240));

        studentTable.setGridColor(new java.awt.Color(46, 52, 64));
        studentTable.setSelectionBackground(new java.awt.Color(229, 233, 240));
        studentTable.setSelectionForeground(new java.awt.Color(46, 52, 64));
        studentTable.setShowGrid(true);
        jScrollPane1.setViewportView(studentTable);

        jButton1.setBackground(new java.awt.Color(76, 86, 106));
        jButton1.setForeground(new java.awt.Color(229, 233, 240));
        jButton1.setText("Refresh");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        studentaddButton.setBackground(new java.awt.Color(76, 86, 106));
        studentaddButton.setForeground(new java.awt.Color(229, 233, 240));
        studentaddButton.setText("Add");
        studentaddButton.setBorderPainted(false);
        studentaddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentaddButtonActionPerformed(evt);
            }
        });

        studentnameTextField.setBackground(new java.awt.Color(67, 76, 94));
        studentnameTextField.setForeground(new java.awt.Color(229, 233, 240));
        studentnameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(59, 66, 81), 3, true));
        studentnameTextField.setCaretColor(new java.awt.Color(229, 233, 240));
        studentnameTextField.setPreferredSize(new java.awt.Dimension(80, 31));

        studentemailTextField.setBackground(new java.awt.Color(67, 76, 94));
        studentemailTextField.setForeground(new java.awt.Color(229, 233, 240));
        studentemailTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(59, 66, 81), 3, true));
        studentemailTextField.setCaretColor(new java.awt.Color(229, 233, 240));
        studentemailTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        studentemailTextField.setPreferredSize(new java.awt.Dimension(80, 31));

        studentdeleteButton.setBackground(new java.awt.Color(76, 86, 106));
        studentdeleteButton.setForeground(new java.awt.Color(229, 233, 240));
        studentdeleteButton.setText("Delete Selected");
        studentdeleteButton.setBorderPainted(false);
        studentdeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentdeleteButtonActionPerformed(evt);
            }
        });

        studentupdateButton.setBackground(new java.awt.Color(76, 86, 106));
        studentupdateButton.setForeground(new java.awt.Color(229, 233, 240));
        studentupdateButton.setText("Update Selected");
        studentupdateButton.setBorderPainted(false);
        studentupdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentupdateButtonActionPerformed(evt);
            }
        });

        studentsearchButton.setBackground(new java.awt.Color(76, 86, 106));
        studentsearchButton.setForeground(new java.awt.Color(229, 233, 240));
        studentsearchButton.setText("Search");
        studentsearchButton.setBorderPainted(false);
        studentsearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentsPanelLayout = new javax.swing.GroupLayout(studentsPanel);
        studentsPanel.setLayout(studentsPanelLayout);
        studentsPanelLayout.setHorizontalGroup(
            studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, studentsPanelLayout.createSequentialGroup()
                        .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(studentnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, studentsPanelLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(studentupdateButton)))
                        .addGap(18, 18, 18)
                        .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentsPanelLayout.createSequentialGroup()
                                .addComponent(studentemailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(studentaddButton)
                                .addGap(18, 18, 18)
                                .addComponent(studentsearchButton))
                            .addComponent(studentdeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        studentsPanelLayout.setVerticalGroup(
            studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentaddButton)
                        .addComponent(studentsearchButton)
                        .addComponent(studentemailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(studentupdateButton)
                    .addComponent(studentdeleteButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        mainPanel.addTab("tab2", studentsPanel);

        reportPanel.setBackground(new java.awt.Color(59, 66, 82));

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );

        mainPanel.addTab("tab4", reportPanel);

        accountPanel.setBackground(new java.awt.Color(59, 66, 82));

        javax.swing.GroupLayout accountPanelLayout = new javax.swing.GroupLayout(accountPanel);
        accountPanel.setLayout(accountPanelLayout);
        accountPanelLayout.setHorizontalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        accountPanelLayout.setVerticalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );

        mainPanel.addTab("tab6", accountPanel);

        settingPanel.setBackground(new java.awt.Color(59, 66, 82));

        javax.swing.GroupLayout settingPanelLayout = new javax.swing.GroupLayout(settingPanel);
        settingPanel.setLayout(settingPanelLayout);
        settingPanelLayout.setHorizontalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        settingPanelLayout.setVerticalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );

        mainPanel.addTab("tab7", settingPanel);

        classesPanel.setBackground(new java.awt.Color(59, 66, 82));

        javax.swing.GroupLayout classesPanelLayout = new javax.swing.GroupLayout(classesPanel);
        classesPanel.setLayout(classesPanelLayout);
        classesPanelLayout.setHorizontalGroup(
            classesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        classesPanelLayout.setVerticalGroup(
            classesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );

        mainPanel.addTab("tab3", classesPanel);

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -62, 1060, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        // TODO add your handling code here:
       mainPanel.setSelectedIndex(0);
       dashboardButton.setBackground(new java.awt.Color(59, 66, 81));
       studentButton.setBackground(new java.awt.Color(46, 52, 64));
       classesButton.setBackground(new java.awt.Color(46, 52, 64));
       accountButton.setBackground(new java.awt.Color(46, 52, 64));
       settingsButton.setBackground(new java.awt.Color(46, 52, 64));
       reportButton.setBackground(new java.awt.Color(46, 52, 64));
    }//GEN-LAST:event_dashboardButtonActionPerformed

    private void classesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classesButtonActionPerformed
        // TODO add your handling code here:
       mainPanel.setSelectedIndex(2);
       dashboardButton.setBackground(new java.awt.Color(46, 52, 64));
       studentButton.setBackground(new java.awt.Color(46, 52, 64));
       classesButton.setBackground(new java.awt.Color(59, 66, 81));
       accountButton.setBackground(new java.awt.Color(46, 52, 64));
       settingsButton.setBackground(new java.awt.Color(46, 52, 64));
       reportButton.setBackground(new java.awt.Color(46, 52, 64));
    }//GEN-LAST:event_classesButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.setSelectedIndex(3);
        dashboardButton.setBackground(new java.awt.Color(46, 52, 64));
       studentButton.setBackground(new java.awt.Color(46, 52, 64));
       reportButton.setBackground(new java.awt.Color(59, 66, 81));
       accountButton.setBackground(new java.awt.Color(46, 52, 64));
       settingsButton.setBackground(new java.awt.Color(46, 52, 64));
       classesButton.setBackground(new java.awt.Color(46, 52, 64));
    }//GEN-LAST:event_reportButtonActionPerformed

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.setSelectedIndex(4);
        dashboardButton.setBackground(new java.awt.Color(46, 52, 64));
       studentButton.setBackground(new java.awt.Color(46, 52, 64));
       accountButton.setBackground(new java.awt.Color(59, 66, 81));
       classesButton.setBackground(new java.awt.Color(46, 52, 64));
       settingsButton.setBackground(new java.awt.Color(46, 52, 64));
       reportButton.setBackground(new java.awt.Color(46, 52, 64));
    }//GEN-LAST:event_accountButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.setSelectedIndex(5);
        dashboardButton.setBackground(new java.awt.Color(46, 52, 64));
       studentButton.setBackground(new java.awt.Color(46, 52, 64));
       settingsButton.setBackground(new java.awt.Color(59, 66, 81));
       accountButton.setBackground(new java.awt.Color(46, 52, 64));
       classesButton.setBackground(new java.awt.Color(46, 52, 64));
       reportButton.setBackground(new java.awt.Color(46, 52, 64));
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadStudentData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studentsearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentsearchButtonActionPerformed

    private void studentaddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentaddButtonActionPerformed
        String name = studentnameTextField.getText();
        String email = studentemailTextField.getText();
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this student?","Confirm insert",JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION){
            boolean success = insertStudentData(name, email);
            if(success){
                JOptionPane.showMessageDialog(this, "Student added successfully.");
                loadStudentData();
            }
            
        } 
        
    }//GEN-LAST:event_studentaddButtonActionPerformed

    private void studentdeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentdeleteButtonActionPerformed
        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a student to delete.");
            return;
        }
        int studentId = (int) studentTable.getValueAt(selectedRow, 1);
        int confirm = JOptionPane.showConfirmDialog(
                null, 
                "Are you sure you want to delete this student?", 
                "Confirm Delete", 
                JOptionPane.YES_NO_OPTION
        );
        if (confirm == JOptionPane.YES_OPTION){
            boolean success = deleteStudentData(studentId);
            if(success){
                JOptionPane.showMessageDialog(null, "Student deleted successfully.");
                loadStudentData();
            }
            
        }
    }//GEN-LAST:event_studentdeleteButtonActionPerformed

    private void studentupdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentupdateButtonActionPerformed
        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a student to update.");
            return;
        }
        String studentName = (String) studentTable.getValueAt(selectedRow, 0);
        int studentId = (int) studentTable.getValueAt(selectedRow, 1);
        String studentEmail = (String) studentTable.getValueAt(selectedRow, 2);
        int confirm = JOptionPane.showConfirmDialog(
                null, 
                "Are you sure you want to update this student info?", 
                "Confirm Update", 
                JOptionPane.YES_NO_OPTION
        );
        if (confirm == JOptionPane.YES_OPTION){
            boolean success = updateStudentData(studentName,studentId,studentEmail);
            if(success){
                JOptionPane.showMessageDialog(null, "Student update successfully.");
                loadStudentData();
            }
            
        }
    }//GEN-LAST:event_studentupdateButtonActionPerformed

    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_studentButtonActionPerformed
        mainPanel.setSelectedIndex(1);
        loadStudentData();
        dashboardButton.setBackground(new java.awt.Color(46, 52, 64));
       classesButton.setBackground(new java.awt.Color(46, 52, 64));
       studentButton.setBackground(new java.awt.Color(59, 66, 81));
       accountButton.setBackground(new java.awt.Color(46, 52, 64));
       settingsButton.setBackground(new java.awt.Color(46, 52, 64));
       reportButton.setBackground(new java.awt.Color(46, 52, 64));
        
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
    private javax.swing.JPanel accountPanel;
    private javax.swing.JButton classesButton;
    private javax.swing.JPanel classesPanel;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel datePanel;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTabbedPane mainPanel;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JButton reportButton;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JPanel settingPanel;
    private javax.swing.JButton settingsButton;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JButton studentButton;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton studentaddButton;
    private javax.swing.JButton studentdeleteButton;
    private javax.swing.JTextField studentemailTextField;
    private javax.swing.JTextField studentnameTextField;
    private javax.swing.JPanel studentsPanel;
    private javax.swing.JButton studentsearchButton;
    private javax.swing.JButton studentupdateButton;
    // End of variables declaration//GEN-END:variables
}
