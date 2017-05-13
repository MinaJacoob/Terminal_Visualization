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
public class delete_file_panel extends javax.swing.JPanel {
    Operations op;
    Full_GUI fullGUI;
    /**
     * Creates new form delete_file_panel
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    public  delete_file_panel(Full_GUI aThis) throws InterruptedException, IOException {
        this.fullGUI = aThis;
        op = new Operations();
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
        delete_file_textField = new javax.swing.JTextField();
        delete_file_btn = new javax.swing.JButton();

        back_btn.setText("Back To Menu");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("File's Full Name (with the extension):");

        delete_file_btn.setText("Delete File");
        delete_file_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_file_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(back_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(delete_file_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(delete_file_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(delete_file_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(delete_file_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(back_btn)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void delete_file_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_file_btnActionPerformed
        // TODO add your handling code here:
        
        if(op.Delete_files(Choose_directory_panel.selected_directory_path, delete_file_textField.getText())){
        this.fullGUI.cardLayout.show(this.fullGUI.container, "MENU_PANEL");
        } else {
            JOptionPane.showMessageDialog(null,"Please enter a valid name" ,"Invalid File Name",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_delete_file_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        this.fullGUI.cardLayout.show(this.fullGUI.container, "MENU_PANEL");
    }//GEN-LAST:event_back_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton delete_file_btn;
    private javax.swing.JTextField delete_file_textField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}