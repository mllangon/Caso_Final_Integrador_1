import java.util.Scanner;

public class CronometroCosmico {
    // Constantes para la Tierra
    private static final double HORAS_POR_DIA_TIERRA = 24.0;
    private static final double DIAS_POR_ANO_TIERRA = 365.25;

    private static double horasPorDiaPlaneta;
    private static double diasPorAnoPlaneta;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Configuración del nuevo planeta:");
        System.out.print("Ingrese las horas por día: ");
        horasPorDiaPlaneta = scanner.nextDouble();
        System.out.print("Ingrese los días por año: ");
        diasPorAnoPlaneta = scanner.nextDouble();
    }

    private static void convertirYVisualizarTiempo(double horas, boolean esParaPlaneta) {
        double horasPorDia = esParaPlaneta ? horasPorDiaPlaneta : HORAS_POR_DIA_TIERRA;
        double diasPorAno = esParaPlaneta ? diasPorAnoPlaneta : DIAS_POR_ANO_TIERRA;

        double dias = horas / horasPorDia;
        double anos = dias / diasPorAno;

        System.out.printf("Años: %.2f, Días: %.2f, Horas: %.0f%n", anos, dias, horas);
    }
}