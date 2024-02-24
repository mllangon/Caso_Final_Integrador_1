import java.util.InputMismatchException;
import java.util.Scanner;

public class AlertaMonitoreo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el nivel de radiación: ");
            double radiacion = scanner.nextDouble();
            System.out.print("Ingrese el nivel de temperatura: ");
            double temperatura = scanner.nextDouble();
            System.out.print("Ingrese el nivel de presión: ");
            double presion = scanner.nextDouble();
            System.out.print("Ingrese la velocidad del viento: ");
            double viento = scanner.nextDouble();

            monitorearVariables(radiacion, temperatura, presion, viento);
        } catch (InputMismatchException e) {
            System.err.println("Error: Entrada inválida. Por favor, ingrese un número.");
        }

        try {
            System.out.print("Ingrese un número para descomponer en factores primos: ");
            int numero = scanner.nextInt();
            descomponerEnFactoresPrimos(numero);
        } catch (InputMismatchException e) {
            System.err.println("Error: Entrada inválida. Se esperaba un número entero.");
        }
    }

    public static void monitorearVariables(double radiacion, double temperatura, double presion, double viento) {
    }

    public static void descomponerEnFactoresPrimos(int numero) {
    }
}