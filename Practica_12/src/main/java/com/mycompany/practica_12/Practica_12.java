/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_12;

/**
 *
 * @author HP
 */
public class Practica_12 {

    public static void main(String[] args) {
        Producto producto = new Producto();

        Cliente c1 = new Cliente("Juan");
        Cliente c2 = new Cliente("Ana");

        producto.agregarObservador(c1);
        producto.agregarObservador(c2);

        producto.setEnStock(true); // Notifica a todos los clientes
    }
}