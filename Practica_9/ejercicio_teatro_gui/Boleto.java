package Practica9.ejercicio_teatro_gui;

public abstract class Boleto {
    protected int numero;
    protected double precio;

    public Boleto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void calcularPrecio(int diasAnticipacion);

    @Override
    public String toString() {
        return "Número: " + numero + ", Precio: " + precio;
    }
}
