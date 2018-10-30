/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

/**
 *
 * @author ecollazodominguez
 */
public class Numero {

    private int num1;
    private int num2;
    private int num3;

    public Numero(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void numMaior() {
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Número 1 (" + num1 + ") é o maior.");
            } else {
                System.out.println("Número 3 (" + num3 + ") é o maior.");
            }
        } else if (num2 > num3) {
            System.out.println("Número 2 (" + num2 + ") é o maior.");
        } else {
            System.out.println("Número 3 (" + num3 + ") é o maior.");
        }

    }
}
