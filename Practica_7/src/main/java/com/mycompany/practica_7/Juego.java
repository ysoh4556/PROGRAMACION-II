/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_7;

/**
 *
 * @author HP
 */
public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        System.out.println("¡Nueva partida iniciada!");
        numeroDeVidas = 3;
    }

    public void actualizaRecord() {
        record++;
        System.out.println("¡Nuevo récord: " + record + "!");
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te queda(n) " + numeroDeVidas + " vida(s).");
        return numeroDeVidas > 0;
    }
}

