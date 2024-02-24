import java.util.Scanner;
public class AlertaMonitoreo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nivel de radiación: ");
        double radiacion = scanner.nextDouble();
        System.out.print("Ingrese el nivel de temperatura: ");
        double temperatura = scanner.nextDouble();
        System.out.print("Ingrese el nivel de presión: ");
        double presion = scanner.nextDouble();
        System.out.print("Ingrese la velocidad del viento: ");
        double viento = scanner.nextDouble();

        monitorearVariables(radiacion, temperatura, presion, viento);

        System.out.print("Ingrese un número para descomponer en factores primos: ");
        int numero = scanner.nextInt();
        descomponerEnFactoresPrimos(numero);
    }

    public static void monitorearVariables(double radiacion, double temperatura, double presion, double viento) {
        if (radiacion > 10) {
            System.out.println("Alerta: Niveles de radiación críticos. Se sugiere ajustar los escudos.");
        } else {
            System.out.println("Niveles de radiación dentro de parámetros seguros.");
        }

        if (temperatura < 0 || temperatura > 50) {
            System.out.println("Alerta: Temperatura fuera de rango seguro. Ajustar el sistema de soporte vital.");
        } else {
            System.out.println("Niveles de temperatura dentro de parámetros seguros.");
        }

        if (presion < 10 || presion > 200) {
            System.out.println("Alerta: Presión fuera de rango seguro. Verificar el casco de la nave.");
        } else {
            System.out.println("Niveles de presión dentro de parámetros seguros.");
        }

        if (viento > 100) {
            System.out.println("Alerta: Velocidad del viento crítica. Verificar estabilidad de la nave.");
        } else {
            System.out.println("Velocidad del viento dentro de parámetros seguros.");
        }
    }

    public static void descomponerEnFactoresPrimos(int numero) {
        System.out.print("Descomposición en factores primos de " + numero + ": ");
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.print(i + " ");
                numero /= i;
            }
        }
        System.out.println();
    }
}