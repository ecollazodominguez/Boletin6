
package boletin6_2;

import javax.swing.JOptionPane;


public class Numero {
    public void sumaResta(){
    short num1 = Short.parseShort(JOptionPane.showInputDialog("Número 1:"));
    short num2 = Short.parseShort(JOptionPane.showInputDialog("Número 1:"));
    
    if (num1 >= num2){
        JOptionPane.showMessageDialog(null, num1 - num2);
    } else {
        JOptionPane.showMessageDialog(null, num1 + num2);
    }
}
}
