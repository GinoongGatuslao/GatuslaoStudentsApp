/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gatuslaostudentsapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Maraudger
 */
public class ExMessageHandler{
       // Method to show error dialog
    public static void showErrorDialog(String message) {
        // Show a message dialog
        JOptionPane.showMessageDialog(
            null,                 // Parent component (null for default)
            message,             // Message to display
            "Error",             // Title of the dialog
            JOptionPane.ERROR_MESSAGE // Message type
        );
    }
    public static void showInfoDialog(String message) {
        // Show a message dialog
        JOptionPane.showMessageDialog(
            null,                 // Parent component (null for default)
            message,             // Message to display
            "Information",             // Title of the dialog
            JOptionPane.INFORMATION_MESSAGE // Message type
        );
    }
        
    
}
