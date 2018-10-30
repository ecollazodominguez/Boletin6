package boletin6_1;

import javax.swing.JOptionPane;

public class Numero {
    

    public void comprobarPositivo(){
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
    
    if (num1 <= 0){
        JOptionPane.showMessageDialog(null, "Error.");
    } else {
        JOptionPane.showMessageDialog(null, "O número é positivo.");
    }
    JOptionPane.showMessageDialog(null, "Continúa.");
}
}
