package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.user.User;
import com.talentbridge.hirewise.user.UserService;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.service.EmployeeService;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class LoginPanel extends javax.swing.JPanel implements IPage {

    private String loginType = "hirewise";
    UserService userService = new UserService();
    EmployeeService empService = new EmployeeService();

    public LoginPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hirewiseRadioBtn = new javax.swing.JRadioButton();
        talentBridgeRadioBtn = new javax.swing.JRadioButton();
        warningLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login Type");

        buttonGroup1.add(hirewiseRadioBtn);
        hirewiseRadioBtn.setSelected(true);
        hirewiseRadioBtn.setText("Hirewise");
        hirewiseRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirewiseRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(talentBridgeRadioBtn);
        talentBridgeRadioBtn.setText("TalentBridge");
        talentBridgeRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talentBridgeRadioBtnActionPerformed(evt);
            }
        });

        warningLabel.setText(" ");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(usernameField)
                    .addComponent(warningLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hirewiseRadioBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(talentBridgeRadioBtn))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hirewiseRadioBtn)
                    .addComponent(talentBridgeRadioBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(warningLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton)
                .addGap(150, 150, 150))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void talentBridgeRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talentBridgeRadioBtnActionPerformed
        // TODO add your handling code here:
        loginType = "talentbridge";
    }//GEN-LAST:event_talentBridgeRadioBtnActionPerformed

    private void hirewiseRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirewiseRadioBtnActionPerformed
        // TODO add your handling code here:
        loginType = "hirewise";
    }//GEN-LAST:event_hirewiseRadioBtnActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String username = usernameField.getText();
        String password = passwordField.getText();
        User account = null;
        try {
            account = userService.authenticate(username, password);
        } catch (Exception e) {
            warningLabel.setText("Invalid username or password.");
            return;
        }

        JPanel page = MainFrame.instance.getDepartmentPage();
        String account_type = "";
        if (loginType.equals("hirewise")) {
            try {
                Employee emp = empService.getEmployeeByUserId(account.getUserId());
                try {
                    String position_title = empService.getPositionTitleForEmployee(emp.getEmployeeId());
                    if (position_title.equals("HR")) {
                        account_type = "hirewise_hr";
                        MainFrame.instance.setEmployee(emp);
                        page = MainFrame.instance.getProfilePage();
                    } else {
                        account_type = "hirewise_user";
                        page = MainFrame.instance.getProfilePage();
                    }
                } catch (RuntimeException e) {
                    account_type = "hirewise_user";
                    page = MainFrame.instance.getProfilePage();
                }
            } catch (Exception e) {
                account_type = "hirewise_user";
                page = MainFrame.instance.getProfilePage();
            }
        } else if (loginType.equals("talentbridge")) {
            if (account.getRole().equals("admin")) {
                account_type = "talentbridge_admin";
            } else {
                try {
                    Employee emp = empService.getEmployeeByUserId(account.getUserId());
                    String position_title = empService.getPositionTitleForEmployee(emp.getEmployeeId());
                    MainFrame.instance.setEmployee(emp);
                    if (position_title.equals("Manager")) {
                        account_type = "talentbridge_manager";
                        page = MainFrame.instance.getProfilePage();
                    } else {
                        account_type = "talentbridge_emp";
                        page = MainFrame.instance.getProfilePage();
                    }
                } catch (Exception e) {
                    warningLabel.setText("No Employee Found with This Information");
                    return;
                }
            }
        }

        MainFrame.instance.setAccount(account);
        MainFrame.instance.setLoggedSystem(account_type);
        MainFrame.instance.login();
        MainFrame.instance.setPage(page);
    }//GEN-LAST:event_loginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton hirewiseRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JRadioButton talentBridgeRadioBtn;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {

    }
}
