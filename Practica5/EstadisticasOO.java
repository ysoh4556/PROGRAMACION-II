import java.util.Scanner;
import java.lang.Math;

public class EstadisticasOO {

    private double[] numeros;

    public EstadisticasOO(double[] numeros) {
        this.numeros = numeros;
    }

    public double promedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - prom, 2);
        }
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }

    public void mostrarResultados() {
        System.out.println("El promedio es " + promedio());
        System.out.println("La desviación estándar es " + desviacion());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        EstadisticasOO estadisticas = new EstadisticasOO(numeros);
        estadisticas.mostrarResultados();

        scanner.close();
    }
}
