/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_6;

/**
 *
 * @author HP
 */
public class Practica_6 {

     public static void main(String[] args) {
        double[] vector1 = {1, 2, 3};
        double[] vector2 = {-2, 1, 0};

        AlgebraVectorial algebra = new AlgebraVectorial(vector1, vector2);

        System.out.println("Son perpendiculares (a + b = a - b) " + algebra.esPerpendicularA());
        System.out.println("Son perpendiculares (a - b = b - a) " + algebra.esPerpendicularB());
        System.out.println("Son perpendiculares (a * b = 0) " + algebra.esPerpendicularC());
        System.out.println("Son perpendiculares (|a + b| = |a| + |b|) " + algebra.esPerpendicularD());
        System.out.println("Son paralelos (a = r * b) " + algebra.esParalelaE());
        System.out.println("Son paralelos (a x b = 0) " + algebra.esParalelaF());

        double[] proyeccion = algebra.proyeccionDeASobreB();
        System.out.print("Proyeccion de a sobre b: ");
        for (double d : proyeccion) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Componente de a en la direccion de b: " + algebra.componenteDeAEnB());
    }
}


