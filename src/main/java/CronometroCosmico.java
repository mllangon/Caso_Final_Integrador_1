import java.util.Scanner;

public class CronometroCosmico {
    private static final double HORAS_POR_DIA_TIERRA = 24.0;
    private static final double DIAS_POR_ANO_TIERRA = 365.25;
    private static double horasPorDiaPlaneta;
    private static double diasPorAnoPlaneta;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la configuración del nuevo planeta
        System.out.println("Ingrese la duración de un día en el nuevo planeta (en horas): ");
        horasPorDiaPlaneta = scanner.nextDouble();
        System.out.println("Ingrese la duración de un año en el nuevo planeta (en días): ");
        diasPorAnoPlaneta = scanner.nextDouble();

        // Conversión de tiempo
        System.out.println("Ingrese las horas a convertir: ");
        double horas = scanner.nextDouble();
        mostrarConversion(horas);

        // Mostrar límites de los tipos de datos
        mostrarLimitesDeDatos();
    }

    private static void mostrarConversion(double horas) {
        // Conversión en la Tierra
        double diasTierra = horas / HORAS_POR_DIA_TIERRA;
        double anosTierra = diasTierra / DIAS_POR_ANO_TIERRA;
        System.out.printf("En la Tierra: %.2f días o %.2f años%n", diasTierra, anosTierra);

        // Conversión en el nuevo planeta
        double diasPlaneta = horas / horasPorDiaPlaneta;
        double anosPlaneta = diasPlaneta / diasPorAnoPlaneta;
        System.out.printf("En el nuevo planeta: %.2f días o %.2f años%n", diasPlaneta, anosPlaneta);
    }

    private static void mostrarLimitesDeDatos() {
        System.out.println("Máximo valor para un int: " + Integer.MAX_VALUE);
        System.out.println("Máximo valor para un long: " + Long.MAX_VALUE);
        System.out.println("Máximo valor para un float: " + Float.MAX_VALUE);
        System.out.println("Máximo valor para un double: " + Double.MAX_VALUE);
    }
}