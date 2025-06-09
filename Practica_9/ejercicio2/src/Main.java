import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2) + 1;
            String color = (rand.nextBoolean()) ? "Rojo" : "Azul";

            if (tipo == 1) {
                double lado = 1 + rand.nextDouble() * 10;
                figuras[i] = new Cuadrado(color, lado);
            } else {
                double radio = 1 + rand.nextDouble() * 10;
                figuras[i] = new Circulo(color, radio);
            }
        }

        for (Figura f : figuras) {
            System.out.println(f.toString());
            System.out.printf("Area: %.2f, Perimetro: %.2f%n", f.area(), f.perimetro());

            if (f instanceof Coloreado) {
                Coloreado c = (Coloreado) f;
                System.out.println("Coloracion: " + c.comoColorear());
            }

            System.out.println("------------------------");
        }
    }
}