/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.gatuslaostudentsapp;

/**
 *
 * @author Maraudger
 */
import com.mongodb.client.FindIterable;
import javax.swing.*;
import java.util.Arrays;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;
public class AddStudentForm extends javax.swing.JPanel {
     private JDialog dialog; 
     private int dialogResult;
     private int mode;
     private String objectID;
     private StringBuilder sb = new StringBuilder();
     
    
    /**
     * Creates new form AddStudentForm
     */
    public AddStudentForm(JDialog dialog, int mode, String id) {
        this.dialog = dialog;
        this.mode = mode;
        this.objectID = id;
        initComponents();
        
        if(mode==1){
            
            populateForm();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMn = new javax.swing.JTextPane();
        txtLn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtASubjects = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Student Information");

        jLabel2.setText("First Name");

        txtFn.setToolTipText("Enter students first name here");

        jLabel3.setText("Middle Name");

        jScrollPane1.setViewportView(txtMn);

        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Subjects");

        txtASubjects.setColumns(20);
        txtASubjects.setRows(5);
        jScrollPane2.setViewportView(txtASubjects);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setText("**Separate Subjects with commas e.g Science, Math, AP, religion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(txtFn)
                            .addComponent(txtLn))))
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(txtFn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel)
                        .addComponent(btnSave))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(mode==0){
            Document stDoc = new Document();
            stDoc.append("first_name", txtFn.getText().toUpperCase().trim());
            stDoc.append("middle_name", txtMn.getText().toUpperCase().trim());
            stDoc.append("last_name", txtLn.getText().toUpperCase().trim());
            String[] temp = txtASubjects.getText().trim().split(",");
            Document subsDoc = new Document();
            for (int i = 0; i < temp.length; i++) {
                subsDoc.append(""+i, temp[i]);
            }
            stDoc.append("subjects", subsDoc);

            MongoConnection mc = new MongoConnection();
            try {
                mc.connect();
                mc.saveStudentInfo(stDoc);

            } catch (Exception e) {

            }finally{
                mc.closeConnection();

            }
//            System.out.println(stDoc.toJson());
            dialogResult = JOptionPane.OK_OPTION;
            dialog.dispose();
        }else{
            Document stDoc = new Document();
            stDoc.append("first_name", txtFn.getText().toUpperCase().trim());
            stDoc.append("middle_name", txtMn.getText().toUpperCase().trim());
            stDoc.append("last_name", txtLn.getText().toUpperCase().trim());
            String[] temp = txtASubjects.getText().trim().split(",");
            Document subsDoc = new Document();
            for (int i = 0; i < temp.length; i++) {
                subsDoc.append(""+i, temp[i]);
            }
            stDoc.append("subjects", subsDoc);

            MongoConnection mc = new MongoConnection();
            try {
                mc.connect();
                boolean res = mc.updateStudentInfo(stDoc,new ObjectId( objectID.toString()));
                if (res) {
                        ExMessageHandler.showInfoDialog("Document has been updated!");
                    }
                else{
                        ExMessageHandler.showErrorDialog("No document found with given information!");

                    }
            } catch (Exception e) {

            }finally{
                mc.closeConnection();   
            }
            dialogResult = JOptionPane.OK_OPTION;
            dialog.dispose();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dialogResult = JOptionPane.CANCEL_OPTION;
        dialog.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed
    
    private void populateForm(){
        MongoConnection mc = new MongoConnection();
        try {
                sb.setLength(0);
                mc.connect();
                Document query = new Document("_id", new ObjectId(objectID.toString()));
                var collection =  mc.getCollection();
                 
                FindIterable<Document> result = collection.find(query);
                Document doc = result.first();
                txtFn.setText(doc.getString("first_name"));
                txtMn.setText(doc.getString("middle_name"));
                txtLn.setText(doc.getString("last_name"));
                
                var subs = doc.get("subjects");
                    if (subs instanceof Document) { // Check if subs is a Document
                        Document subjects = (Document) subs;
                        for (String key : subjects.keySet()) {
                            Object value = subjects.get(key);
                            sb.append(value+", ");
                        }
                    } else {
                        System.out.println("Subjects is not a Document.");
                    }
                txtASubjects.setText(sb.toString());
            }
        catch (Exception e) {
                 ExMessageHandler.showErrorDialog("At Saving : "+e.getMessage());
            }
        finally {
                mc.closeConnection();
            }
    }
    public static int showDialog(JFrame parent,int mode,String id) {
        // Create a new JDialog with a parent JFrame
        
       JDialog dialogFrame = new JDialog(parent, "Student Info", true); // true makes it modal
        
        // Create an instance of your form
        AddStudentForm form = new AddStudentForm(dialogFrame,mode,id);
        
         
        // Add the form to the dialog[957, 207]
        dialogFrame.getContentPane().add(form);
        dialogFrame.setSize(977,247);
        dialogFrame.setLocationRelativeTo(parent); // Center it
        dialogFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        // Show the dialog
        dialogFrame.setVisible(true);

        // Return a custom result if you want
        return form.dialogResult;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtASubjects;
    private javax.swing.JTextField txtFn;
    private javax.swing.JTextField txtLn;
    private javax.swing.JTextPane txtMn;
    // End of variables declaration//GEN-END:variables
}
