/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class JavaApplication8 {

    private static Component parentComponent;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(parentComponent, "Isi ID Pasien Terleih Dahulu!",
                    "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        
    }
    
}
