/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_6;

/**
 *
 * @author HP
 */
import java.lang.Math;

public class Vector3D {
    private double a1, a2, a3;

    public Vector3D(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public Vector3D sumar(Vector3D otro) {
        return new Vector3D(this.a1 + otro.a1, this.a2 + otro.a2, this.a3 + otro.a3);
    }

    public Vector3D multiplicarEscalar(double r) {
        return new Vector3D(r * this.a1, r * this.a2, r * this.a3);
    }

    public double longitud() {
        return Math.sqrt(a1 * a1 + a2 * a2 + a3 * a3);
    }

    public Vector3D normal() {
        double longitud = this.longitud();
        if (longitud == 0) throw new ArithmeticException("No se puede normalizar un vector nulo.");
        return new Vector3D(a1 / longitud, a2 / longitud, a3 / longitud);
    }

    public double productoEscalar(Vector3D otro) {
        return this.a1 * otro.a1 + this.a2 * otro.a2 + this.a3 * otro.a3;
    }

    public Vector3D productoVectorial(Vector3D otro) {
        return new Vector3D(
            this.a2 * otro.a3 - this.a3 * otro.a2,
            this.a3 * otro.a1 - this.a1 * otro.a3,
            this.a1 * otro.a2 - this.a2 * otro.a1
        );
    }

    public void imprimir() {
        System.out.println("(" + a1 + ", " + a2 + ", " + a3 + ")");
    }

    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(2, 5, 0);
        Vector3D v2 = new Vector3D(4, 10, 0);

        System.out.print("v1: ");
        v1.imprimir();
        System.out.print("v2: ");
        v2.imprimir();

        System.out.print("v1 + v2: ");
        v1.sumar(v2).imprimir();

        System.out.print("2 * v1: ");
        v1.multiplicarEscalar(2).imprimir();

        System.out.println("Longitud de v1: " + v1.longitud());

        System.out.print("Normal de v1: ");
        v1.normal().imprimir();

        System.out.println("Producto escalar: " + v1.productoEscalar(v2));

        System.out.print("Producto vectorial: ");
        v1.productoVectorial(v2).imprimir();
    }
}
