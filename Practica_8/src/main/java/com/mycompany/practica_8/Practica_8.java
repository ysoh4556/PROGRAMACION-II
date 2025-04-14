/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_8;

/**
 *
 * @author HP
 */
public class Practica_8 {

    public static void main(String[] args) {
        D objetoD = new D(1, 2, 3);

        System.out.println("Valores iniciales:");
        objetoD.mostrarValores();

        objetoD.incrementaXYZ();
        System.out.println("\nDespués de incrementaXYZ():");
        objetoD.mostrarValores();
    }
}