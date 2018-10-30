/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Almacen producto1 = new Almacen("Sillas", 825);
        Almacen producto2 = new Almacen("Mesas", 450);
        Almacen producto3 = new Almacen("Armarios", 99);

        producto1.calcularConsumo(producto1);
        producto2.calcularConsumo(producto2);
        producto3.calcularConsumo(producto3);

    }

}
