/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_8;

/**
 *
 * @author HP
 */
public class D {
    private A a;
    private B b;

    public D(int x, int y, int z) {
        // z se pasa dos veces para sincronizar valores
        a = new A(x, z);
        b = new B(y, z);
    }

    public void incrementaXYZ() {
        a.x++;
        b.y++;
        a.z++;
        b.z = a.z; // mantener sincronización si es necesario
    }

    // Métodos para mostrar valores (opcional)
    public void mostrarValores() {
        System.out.println("x: " + a.x + ", y: " + b.y + ", z (A): " + a.z + ", z (B): " + b.z);
    }
}

