import java.util.Scanner;
import java.lang.Math;

public class EcuacionCuadraticaOO {

    private double a;
    private double b;
    private double c;

    public EcuacionCuadraticaOO(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRaiz1() {
        return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
    }

    public double getRaiz2() {
        return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
    }

    public void resolver() {
        double discriminante = getDiscriminante();

        if (discriminante > 0) {
            System.out.println("La ecuación tiene dos raíces " + getRaiz1() + " y " + getRaiz2());
        } else if (discriminante == 0) {
            System.out.println("La ecuación tiene una raíz " + getRaiz1()); // o getRaiz2, es lo mismo
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        EcuacionCuadraticaOO ecuacion = new EcuacionCuadraticaOO(a, b, c);
        ecuacion.resolver();

        scanner.close();
    }
    
}
