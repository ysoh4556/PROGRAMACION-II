/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6;

/**
 *
 * @author HP
 */
public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D sumar(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector3D multiplicarEscalar(double escalar) {
        return new Vector3D(escalar * x, escalar * y, escalar * z);
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D normalizar() {
        double mag = magnitud();
        if (mag == 0) return new Vector3D(0, 0, 0);
        return new Vector3D(x / mag, y / mag, z / mag);
    }

    public double productoEscalar(Vector3D other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector3D productoVectorial(Vector3D other) {
        return new Vector3D(
            y * other.z - z * other.y,
            z * other.x - x * other.z,
            x * other.y - y * other.x
        );
    }

    public String toString3Dec() {
        return String.format("(%.3f, %.3f, %.3f)", x, y, z);
    }
}
