import java.util.Scanner;
import java.lang.Math;

public class EstadisticasModular {

    public static double promedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public static double desviacion(double[] numeros, double promedio) {
        double sumaCuadrados = 0;
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        double prom = promedio(numeros);
        double desv = desviacion(numeros, prom);

        System.out.println("El promedio es " + prom);
        System.out.println("La desviación estándar es " + desv);

        scanner.close();
    }
   
}

