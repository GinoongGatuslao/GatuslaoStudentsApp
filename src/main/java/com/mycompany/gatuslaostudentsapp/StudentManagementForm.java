/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gatuslaostudentsapp;

import com.mongodb.client.FindIterable;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import org.bson.conversions.Bson;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

/**
 *
 * @author Maraudger
 */
public class StudentManagementForm extends javax.swing.JFrame {

    /**
     * Creates new form StudentManagementForm
     */
    private static ZooKeeper zooKeeper;
    private static final String ZOOKEEPER_SERVERS = "localhost:2181";
     private static final String ZNODE_PATH = "/mongo_servers";
    private MongoConnection mc = new MongoConnection();
    private StringBuilder sb = new StringBuilder();
    public StudentManagementForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        tblStudents.isCellEditable(0, 0);
        populateTable(tblStudents,false);
        
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
        tblStudents = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAddStudent = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnZodeManager = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblStudents.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblStudents.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblStudents.setName("tblStudents"); // NOI18N
        tblStudents.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblStudents.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblStudents.setShowGrid(true);
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudents);
        tblStudents.getAccessibleContext().setAccessibleName("tblStudents");
        tblStudents.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Student Management Module");

        btnAddStudent.setText("Add New Student");
        btnAddStudent.setBorderPainted(false);
        btnAddStudent.setName(""); // NOI18N
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        txtSearch.setToolTipText("Search for student first name or last name");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        btnSearch.setText("Search Student");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        btnZodeManager.setText("ZNode Management");
        btnZodeManager.setEnabled(false);
        btnZodeManager.setFocusable(false);
        btnZodeManager.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnZodeManager.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnZodeManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnZodeManagerMouseClicked(evt);
            }
        });
        jToolBar1.add(btnZodeManager);

        jButton1.setText("Start Connection");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnAddStudent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        int result = AddStudentForm.showDialog(this,0,null);
            if (result == JOptionPane.OK_OPTION) {
                populateTable(tblStudents,false);
            }else{
                populateTable(tblStudents,false);
            }
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked

        
        
        if(evt.getClickCount() == 2){
            int result = EditOrDelete.showDialog(this);
            
            if (result == JOptionPane.NO_OPTION) {
                openEditForm();
            }
            if (result == JOptionPane.CANCEL_OPTION) {
                    int result2 = ConfirmDelete.showDialog(this);
                    if (result2 == JOptionPane.NO_OPTION) {
                        //delete code
                        if (tblStudents.getSelectedRow()>=0) {
                              try {
                                    mc.connect();
                                    mc.deleteById(tblStudents.getValueAt(tblStudents.getSelectedRow(), 0).toString());
                                    ExMessageHandler.showInfoDialog("Record Deleted");
                                } catch (Exception e) {
                                    ExMessageHandler.showErrorDialog("At Populating The table : "+e.getMessage());
                                } finally {
                                     mc.closeConnection();
                                     populateTable(tblStudents,false);
                                }
                        }
                    }else{
                        populateTable(tblStudents,false);
                    }
            }
            
        }
    }//GEN-LAST:event_tblStudentsMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       populateTable(tblStudents,true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // TODO add your handling code here:
        populateTable(tblStudents,true);
    }//GEN-LAST:event_txtSearchKeyTyped

    private void btnZodeManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZodeManagerMouseClicked
        // TODO add your handling code here:
        int result = ZookeeperManagerPanel.showDialog(this,0,null);
            if (result == JOptionPane.OK_OPTION) {
                populateTable(tblStudents,false);
            }else{
                populateTable(tblStudents,false);
            }
    }//GEN-LAST:event_btnZodeManagerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ZookeeperConnection zkInstance = new ZookeeperConnection();
            zooKeeper = zkInstance.getZookeeper();
            zooKeeper.getData(ZNODE_PATH,event->{
                if(event.getType()==Watcher.Event.EventType.NodeDataChanged){
                    populateTable(tblStudents,false);
                }
            },null);
        } catch (Exception e) {
        } finally {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void openEditForm(){
        
        int result = AddStudentForm.showDialog(this,1,tblStudents.getValueAt(tblStudents.getSelectedRow(), 0).toString());
            if (result == JOptionPane.OK_OPTION) {
                populateTable(tblStudents,false);
            }else{
                populateTable(tblStudents,false);
            }
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
            java.util.logging.Logger.getLogger(StudentManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManagementForm().setVisible(true);
            }
        });
    }
    private void populateTable(JTable table,boolean isSearch){
        
        if (isSearch) {
                try {
                    mc.connect();
                    var collection =  mc.getCollection();
                    // Create a regex pattern for case-insensitive search
                    String regexPattern = ".*" + txtSearch.getText() + ".*"; // Similar to SQL's '%searchTerm%'

                    // Create a query using regex for both first_name and last_name fields
                    Bson query = new Document("$or", java.util.Arrays.asList(
                        new Document("first_name", new Document("$regex", regexPattern).append("$options", "i")),
                        new Document("last_name", new Document("$regex", regexPattern).append("$options", "i")),
                        new Document("middle_name", new Document("$regex", regexPattern).append("$options", "i"))
                    ));
                    Object[] columnNames = {"ID","First Name","Middle Name","Last Name","Subject"};
                    Object[][] data= null;   
                      for(Document doc : collection.find(query)){
                          sb.setLength(0);
                          String idString = doc.get("_id").toString();
                          String fn = doc.getString("first_name");
                          String mn = doc.getString("middle_name");
                          String ln = doc.getString("last_name");

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
                           data = addRow(data,new Object[]{idString,fn, mn, ln, sb.toString()});
                      }
                      NonEditableTableModel tableModel = new NonEditableTableModel(data, columnNames);
                      tblStudents.setModel(tableModel);

                       jScrollPane1.revalidate();
                       jScrollPane1.repaint();
                       tblStudents.revalidate();
                       tblStudents.repaint();
                       hideColumn(tblStudents, 0);
                   
                    
                } catch (Exception e) {
                } finally {
                }
        }else{
             try {
                mc.connect();
                var documents =  mc.getCollection();


              Object[] columnNames = {"ID","First Name","Middle Name","Last Name","Subject"};
              Object[][] data= null;   
                for(Document doc : documents.find()){
                    sb.setLength(0);
                    String idString = doc.get("_id").toString();
                    String fn = doc.getString("first_name");
                    String mn = doc.getString("middle_name");
                    String ln = doc.getString("last_name");

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
                     data = addRow(data,new Object[]{idString,fn, mn, ln, sb.toString()});
                }
                NonEditableTableModel tableModel = new NonEditableTableModel(data, columnNames);
                tblStudents.setModel(tableModel);

                 jScrollPane1.revalidate();
                 jScrollPane1.repaint();
                 tblStudents.revalidate();
                 tblStudents.repaint();
                 hideColumn(tblStudents, 0);

            } catch (Exception e) {
               ExMessageHandler.showErrorDialog("At Populating The table : "+e.getMessage());
            } finally {
                mc.closeConnection();
            }
        }
       
    }
    private static Object[][] addRow(Object[][] originalData, Object[] newRow) {
        // Create a new array with one additional row
        
        if (originalData == null) {
        // If originalData is null, create a new array with one row
        return new Object[][] { newRow }; // Return a new array containing the new row
        }
        Object[][] newData = new Object[originalData.length + 1][originalData[0].length];

        // Copy existing data to the new array
        for (int i = 0; i < originalData.length; i++) {
            newData[i] = originalData[i];
        }

        // Add the new row
        newData[newData.length - 1] = newRow;

        return newData; // Return the new array
    }
    private static void hideColumn(JTable table, int columnIndex) {
        table.getColumnModel().getColumn(columnIndex).setMinWidth(0);
        table.getColumnModel().getColumn(columnIndex).setMaxWidth(0);
        table.getColumnModel().getColumn(columnIndex).setWidth(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnZodeManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
