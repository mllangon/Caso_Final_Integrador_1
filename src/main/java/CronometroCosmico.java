import java.util.Scanner;

public class CronometroCosmico {
    private static final double HORAS_POR_DIA_TIERRA = 24.0;
    private static final double DIAS_POR_ANO_TIERRA = 365.25;
    private static double horasPorDiaPlaneta;
    private static double diasPorAnoPlaneta;

    private static void mostrarConversion(double horas) {
        // Tierra
        double diasTierra = horas / HORAS_POR_DIA_TIERRA;
        double anosTierra = diasTierra / DIAS_POR_ANO_TIERRA;
        System.out.printf("En la Tierra: %.2f días, %.2f años%n", diasTierra, anosTierra);
        mostrarHorasMinutosSegundos(horas, HORAS_POR_DIA_TIERRA, "Tierra");

        // Nuevo Planeta
        double diasPlaneta = horas / horasPorDiaPlaneta;
        double anosPlaneta = diasPlaneta / diasPorAnoPlaneta;
        System.out.printf("En el nuevo planeta: %.2f días, %.2f años%n", diasPlaneta, anosPlaneta);
        mostrarHorasMinutosSegundos(horas, horasPorDiaPlaneta, "Nuevo Planeta");
    }

    private static void mostrarHorasMinutosSegundos(double horas, double horasPorDia, String planeta) {
        int totalHoras = (int) (horas % horasPorDia);
        int minutos = (int) ((horas * 60) % 60);
        int segundos = (int) ((horas * 3600) % 3600) % 60; // Corrección aquí para calcular correctamente

        System.out.printf("Equivalentes en %s: %d horas, %d minutos, %d segundos%n", planeta, totalHoras, minutos, segundos);
    }

    private static void mostrarLimitesDeDatos() {
        System.out.println("Máximo valor para un int: " + Integer.MAX_VALUE);
        System.out.println("Máximo valor para un long: " + Long.MAX_VALUE);
        System.out.println("Máximo valor para un float: " + Float.MAX_VALUE);
        System.out.println("Máximo valor para un double: " + Double.MAX_VALUE);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la duración de un día en el nuevo planeta (en horas): ");
        horasPorDiaPlaneta = scanner.nextDouble();
        System.out.println("Ingrese la duración de un año en el nuevo planeta (en días): ");
        diasPorAnoPlaneta = scanner.nextDouble();

        System.out.println("Ingrese las horas a convertir: ");
        double horas = scanner.nextDouble();
        mostrarConversion(horas);

        mostrarLimitesDeDatos();
    }
}
