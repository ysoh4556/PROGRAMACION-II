/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_7;

/**
 *
 * @author HP
 */
public class Practica_7 {

    public static void main(String[] args) {
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);

        System.out.println("=== Juego Normal ===");
        juegoNormal.juega();

        System.out.println("\n=== Juego de Numeros Pares ===");
        juegoPar.juega();

        System.out.println("\n=== Juego de Numeros Impares ===");
        juegoImpar.juega();
    }
}