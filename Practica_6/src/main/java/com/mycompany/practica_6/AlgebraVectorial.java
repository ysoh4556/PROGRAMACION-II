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

public class AlgebraVectorial {
    private double[] vectorA;
    private double[] vectorB;

    public AlgebraVectorial(double[] vectorA, double[] vectorB) {
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    public AlgebraVectorial(double[] vectorA) {
        this.vectorA = vectorA;
        this.vectorB = null;
    }

    public boolean esPerpendicularA() {
        if (vectorB == null) return false;
        // NOTA: Esta no es una definición estándar de perpendicularidad.
        double[] suma = sumarVectores(vectorA, vectorB);
        double[] resta = restarVectores(vectorA, vectorB);
        return vectoresIguales(suma, resta);
    }

    public boolean esPerpendicularB() {
        if (vectorB == null) return false;
        double[] restaAB = restarVectores(vectorA, vectorB);
        double[] restaBA = restarVectores(vectorB, vectorA);
        return vectoresIguales(restaAB, restaBA);
    }

    public boolean esPerpendicularC() {
        if (vectorB == null) return false;
        return Math.abs(productoPunto(vectorA, vectorB)) < 1e-9;
    }

    public boolean esPerpendicularD() {
        if (vectorB == null) return false;
        double[] suma = sumarVectores(vectorA, vectorB);
        double moduloSumaCuadrado = moduloCuadrado(suma);
        double moduloACuadrado = moduloCuadrado(vectorA);
        double moduloBCuadrado = moduloCuadrado(vectorB);
        return Math.abs(moduloSumaCuadrado - (moduloACuadrado + moduloBCuadrado)) < 1e-9;
    }

    public boolean esParalelaE() {
        if (vectorB == null || vectorA.length != vectorB.length) return false;
        if (vectoresIguales(vectorA, vectorB)) return true;

        if (vectorB[0] == 0) return false;
        double r = vectorA[0] / vectorB[0];
        for (int i = 1; i < vectorA.length; i++) {
            if (Math.abs(vectorA[i] - r * vectorB[i]) > 1e-9) return false;
        }
        return true;
    }

    public boolean esParalelaF() {
        if (vectorB == null || vectorA.length != 3 || vectorB.length != 3) return false;
        double[] productoCruz = productoCruz(vectorA, vectorB);
        return vectoresIguales(productoCruz, new double[]{0, 0, 0});
    }

    public double[] proyeccionDeASobreB() {
        if (vectorB == null) return null;
        double productoPunto = productoPunto(vectorA, vectorB);
        double moduloBCuadrado = moduloCuadrado(vectorB);
        double[] proyeccion = new double[vectorB.length];
        for (int i = 0; i < vectorB.length; i++) {
            proyeccion[i] = (productoPunto / moduloBCuadrado) * vectorB[i];
        }
        return proyeccion;
    }

    public double componenteDeAEnB() {
        if (vectorB == null) return Double.NaN;
        double productoPunto = productoPunto(vectorA, vectorB);
        double moduloB = modulo(vectorB);
        return productoPunto / moduloB;
    }

    private double[] sumarVectores(double[] v1, double[] v2) {
        validarDimensiones(v1, v2);
        double[] resultado = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i] + v2[i];
        }
        return resultado;
    }

    private double[] restarVectores(double[] v1, double[] v2) {
        validarDimensiones(v1, v2);
        double[] resultado = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i] - v2[i];
        }
        return resultado;
    }

    private double productoPunto(double[] v1, double[] v2) {
        validarDimensiones(v1, v2);
        double resultado = 0;
        for (int i = 0; i < v1.length; i++) {
            resultado += v1[i] * v2[i];
        }
        return resultado;
    }

    private double moduloCuadrado(double[] v) {
        double resultado = 0;
        for (double d : v) {
            resultado += d * d;
        }
        return resultado;
    }

    private double modulo(double[] v) {
        return Math.sqrt(moduloCuadrado(v));
    }

    private double[] productoCruz(double[] v1, double[] v2) {
        return new double[]{
            v1[1] * v2[2] - v1[2] * v2[1],
            v1[2] * v2[0] - v1[0] * v2[2],
            v1[0] * v2[1] - v1[1] * v2[0]
        };
    }

    private boolean vectoresIguales(double[] v1, double[] v2) {
        if (v1.length != v2.length) return false;
        for (int i = 0; i < v1.length; i++) {
            if (Math.abs(v1[i] - v2[i]) > 1e-9) return false;
        }
        return true;
    }

    private void validarDimensiones(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma dimensión.");
        }
    }
}