import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para A: ");
        double a = sc.nextDouble();

        System.out.print("Digite um número para B: ");
        double b = sc.nextDouble();

        System.out.print("Digite um número para C: ");
        double c = sc.nextDouble();

        double triangle = (a * c) / 2;
        double circle = 3.14159 * Math.pow(c, 2.0);
        double trapeze = (a + b) * c / 2;
        double square = Math.pow(b, 2.0);
        double rectangle = a * b;

        System.out.printf("\nTRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZIO: %.3f%n", trapeze);
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);
        sc.close();
    }
}
