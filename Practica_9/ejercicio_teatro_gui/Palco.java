package Practica9.ejercicio_teatro_gui;

public class Palco extends Boleto {

    public Palco(int numero) {
        super(numero);
        this.precio = 100.0;
    }

    @Override
    public void calcularPrecio(int diasAnticipacion) {
        // Precio fijo
    }
}
