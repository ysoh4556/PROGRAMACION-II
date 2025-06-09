package Practica9.ejercicio_teatro_gui;

public class Platea extends Boleto {

    public Platea(int numero, int diasAnticipacion) {
        super(numero);
        calcularPrecio(diasAnticipacion);
    }

    @Override
    public void calcularPrecio(int diasAnticipacion) {
        if (diasAnticipacion >= 10) {
            this.precio = 50.0;
        } else {
            this.precio = 60.0;
        }
    }
}
