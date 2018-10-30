/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Signo {
    public void mostrarSigno(){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1:"));
        if (num1 > 0){
            JOptionPane.showMessageDialog(null, "+");
        } else if (num1 < 0) {
            JOptionPane.showMessageDialog(null, "-");
        } else {
            JOptionPane.showMessageDialog(null, "0");
        }
    }
}
