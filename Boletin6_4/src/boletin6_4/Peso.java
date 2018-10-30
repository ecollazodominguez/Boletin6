/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Peso {

    private float peso;
    private String nome;

    public Peso(float peso, String nome) {
        this.peso = peso;
        this.nome = nome;
    }

    public void CompararPeso(Peso a, Peso b) {
        float difPeso = 0;
        if (a.peso > b.peso) {
            difPeso = a.peso - b.peso;
            JOptionPane.showMessageDialog(null, a.nome + " de peso " + a.peso + " kg, pesa máis ca " + b.nome + " cunha diferencia de " + difPeso + " kg.");
        } else {
            difPeso = b.peso - a.peso;
            JOptionPane.showMessageDialog(null, b.nome + " de peso " + b.peso + " kg, pesa máis ca " + a.nome + " cunha diferencia de " + difPeso + " kg.");
        }
    }
}
