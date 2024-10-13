/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gatuslaostudentsapp;

/**
 *
 * @author Maraudger
 */
import javax.swing.table.DefaultTableModel;
public class NonEditableTableModel extends DefaultTableModel {
     // Constructor
    public NonEditableTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false; // Prevent editing of any cell
    }
}
