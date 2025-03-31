/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6;

/**
 *
 * @author HP
 */
public class AlgebraVectorial {
    private Vector3D a;
    private Vector3D b;

    public AlgebraVectorial(Vector3D a, Vector3D b) {
        this.a = a;
        this.b = b;
    }

    public boolean sonPerpendiculares() {
        return Math.abs(a.productoEscalar(b)) < 1e-6;
    }

    public boolean sonParalelos() {
        Vector3D cruz = a.productoVectorial(b);
        return Math.abs(cruz.magnitud()) < 1e-6;
    }

    public Vector3D proyeccion() {
        double dot = a.productoEscalar(b);
        double normaB2 = b.magnitud() * b.magnitud();
        double escalar = dot / normaB2;
        return b.multiplicarEscalar(escalar);
    }

    public double componente() {
        return a.productoEscalar(b) / b.magnitud();
    }

    public void mostrarResultados() {
        System.out.println("a) Perpendicular: " + sonPerpendiculares());
        System.out.println("b) Paralelo: " + sonParalelos());
        System.out.println("c) Proyeccion de a sobre b: " + proyeccion().toString3Dec());
        System.out.println("d) Componente de a en b: " + String.format("%.3f", componente()));
    }
}
