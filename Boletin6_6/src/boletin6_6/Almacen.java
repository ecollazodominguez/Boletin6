/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Almacen {

    private String nome;
    private int vendasA;

    public Almacen(String nome, int vendasA) {
        this.nome = nome;
        this.vendasA = vendasA;
    }

    public void calcularConsumo() {
        if (vendasA <= 100) {
            JOptionPane.showMessageDialog(null, nome + " ten un consumo baixo.");
        } else if (vendasA <= 500) {
            JOptionPane.showMessageDialog(null, nome + " ten un consumo medio.");
        } else if (vendasA <= 1000) {
            JOptionPane.showMessageDialog(null, nome + " ten un consumo alto.");
        } else {
            JOptionPane.showMessageDialog(null, nome + " ten unha primeira necesidade.");
        }
    }
}
