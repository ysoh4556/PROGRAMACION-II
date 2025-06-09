package Practica9.ejercicio_teatro_gui;

public class Galeria extends Boleto {

    public Galeria(int numero, int diasAnticipacion) {
        super(numero);
        calcularPrecio(diasAnticipacion);
    }

    @Override
    public void calcularPrecio(int diasAnticipacion) {
        if (diasAnticipacion >= 10) {
            this.precio = 25.0;
        } else {
            this.precio = 30.0;
        }
    }
}
