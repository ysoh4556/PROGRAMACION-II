/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_12;

import com.mycompany.practica_12.Observador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Producto {
    private List<Observador> observadores = new ArrayList<>();
    private boolean enStock = false;

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void setEnStock(boolean estado) {
        enStock = estado;
        if (enStock) {
            notificar();
        }
    }

    private void notificar() {
        for (Observador o : observadores) {
            o.actualizar();
        }
    }
}   