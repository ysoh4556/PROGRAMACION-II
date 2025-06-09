/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4java;

/**
 *
 * @author Usuario
 */
public class Practica4Java {

    // 1. Area del circulo (radio)
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    // 2. Area del rectangulo (base, altura)
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    // 3. Area del triángulo rectángulo (base, altura)
    public static double calcularArea(double base, double altura, String figura) {
        if (figura.equals("triangulo")) {
            return (base * altura) / 2;
        }
        return 0; 
    }

    // 4. Area del trapecio (base mayor, base menor, altura)
    public static double calcularArea(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    // 5. Area del pentágono regular (lado, apotema)
    public static double calcularArea(double lado, double apotema, int lados) {
        if (lados == 5) {
            return (5 * lado * apotema) / 2;
        }
        return 0; 
    }
    public static void main(String[] args) {
        System.out.println("Area del circulo (radio=5): " + calcularArea(5));
        System.out.println("Area del rectangulo (base=4, altura=6): " + calcularArea(4, 6));
        System.out.println("Area del triangulo (base=3, altura=4): " + calcularArea(3, 4, "triangulo"));
        System.out.println("Area del trapecio (baseMayor=6, baseMenor=4, altura=5): " + calcularArea(6, 4, 5));
        System.out.println("Area del pentagono (lado=5, apotema=3): " + calcularArea(5, 3, 5));
    }
}