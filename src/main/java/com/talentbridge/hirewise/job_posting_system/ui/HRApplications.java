/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.ui;

import com.talentbridge.hirewise.custom_components.CCApplicationElement;
import com.talentbridge.hirewise.custom_components.CCHRApplicationsElement;
import com.talentbridge.hirewise.custom_components.CCScrollBar;
import com.talentbridge.hirewise.job_posting_system.model.Application;
import com.talentbridge.hirewise.job_posting_system.service.ApplicationService;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author Lenovo
 */
public class HRApplications extends javax.swing.JPanel implements IPage{

    /**
     * Creates new form HRApplications
     */
    public int applicationId;
    public HRApplications() {
        initComponents();
         SearchButton.addActionListener(evt -> onSearch());
        SearchTextField.addActionListener(evt -> onSearch()); 
    }
    
    
    public List<Application> getApplicationPosts(String titleFilter) {
        ApplicationService applicationService = new ApplicationService();

        if ((titleFilter == null || titleFilter.isEmpty())) {
            return applicationService.getAllApplications(); // Tüm kayıtlar
        } else {
            return applicationService.getApplicationsByJobPostTitle(titleFilter);
        }
    }
    
    private void createApplicationsList(String titleFilter) {
        List<Application> applicationsPosts = getApplicationPosts(titleFilter);

        JPanel resultContainer = new JPanel();
        resultContainer.setSize(570, 100 * applicationsPosts.size());
        GridLayout gridLayout = new GridLayout(applicationsPosts.size(), 1);
        gridLayout.setVgap(5);
        resultContainer.setLayout(gridLayout);

        for (Application application : applicationsPosts) {
            CCHRApplicationsElement userListElement = new CCHRApplicationsElement(application);
            applicationId = application.getApplicationId();
            userListElement.setSize(550, 100);
            resultContainer.add(userListElement);
        }

        jScrollPane1.setViewportView(resultContainer);

        jScrollPane1.setVerticalScrollBar(new CCScrollBar());
        CCScrollBar sp = new CCScrollBar();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane1.setHorizontalScrollBar(sp);
    }
    
    
     private void onSearch() {
        String filterText = SearchTextField.getText().trim();
         createApplicationsList(filterText);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        SearchTextField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Applications");

        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(SearchButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addGap(103, 103, 103)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextFieldActionPerformed

    public void onPageSetted() {
        createApplicationsList(null);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
