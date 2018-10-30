/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peso persona1 = new Peso(67.6f, "Maria");
        Peso persona2 = new Peso(75.4f, "Javier");
        persona2.CompararPeso(persona1, persona2);
    }

}
