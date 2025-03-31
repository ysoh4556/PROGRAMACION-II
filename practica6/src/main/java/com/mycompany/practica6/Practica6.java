/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica6;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Practica6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z;

        System.out.println("Ingrese las coordenadas del vector a:");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        Vector3D a = new Vector3D(x, y, z);

        System.out.println("Ingrese las coordenadas del vector b:");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        Vector3D b = new Vector3D(x, y, z);

        AlgebraVectorial algebra = new AlgebraVectorial(a, b);
        algebra.mostrarResultados();
    }
}

