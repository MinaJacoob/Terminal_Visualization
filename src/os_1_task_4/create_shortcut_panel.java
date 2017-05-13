/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_1_task_4;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class create_shortcut_panel extends javax.swing.JPanel {

    Operations op;
    Full_GUI fullGUI;

    /**
     * Creates new form create_shortcut_panel
     */
    public create_shortcut_panel(Full_GUI aThis) throws InterruptedException, IOException {
        op = new Operations();
        fullGUI = aThis;

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

        back_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        create_aymblic_link_textField = new javax.swing.JTextField();
        create_symbolic_link_btn = new javax.swing.JButton();

        back_btn.setText("Back To Menu");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Name for Symbolic Link: ");

        create_symbolic_link_btn.setText("Create Symbolic Link");
        create_symbolic_link_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_symbolic_link_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(back_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(create_aymblic_link_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(create_symbolic_link_btn)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(create_aymblic_link_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(create_symbolic_link_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(back_btn)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void create_symbolic_link_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_symbolic_link_btnActionPerformed
        // TODO add your handling code here:

        if (op.Create_symbolic_link(Choose_directory_panel.selected_directory_path, create_aymblic_link_textField.getText())) {
            this.fullGUI.cardLayout.show(this.fullGUI.container, "MENU_PANEL");
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid name", "Invalid File Name", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_create_symbolic_link_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        this.fullGUI.cardLayout.show(this.fullGUI.container, "MENU_PANEL");
    }//GEN-LAST:event_back_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JTextField create_aymblic_link_textField;
    private javax.swing.JButton create_symbolic_link_btn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}