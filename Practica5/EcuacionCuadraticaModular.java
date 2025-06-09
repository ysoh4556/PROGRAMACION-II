import java.util.Scanner;
import java.lang.Math;

public class EcuacionCuadraticaModular {

    public static double getDiscriminante(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double getRaiz1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public static double getRaiz2(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminante = getDiscriminante(a, b, c);

        if (discriminante > 0) {
            double raiz1 = getRaiz1(a, b, discriminante);
            double raiz2 = getRaiz2(a, b, discriminante);
            System.out.println("La ecuación tiene dos raíces " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = getRaiz1(a, b, discriminante); 
            System.out.println("La ecuación tiene una raíz " + raiz);
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }

        scanner.close();
    }
}