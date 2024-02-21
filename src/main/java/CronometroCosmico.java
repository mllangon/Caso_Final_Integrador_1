import java.util.Scanner;

public class CronometroCosmico {
    private static final double HORAS_POR_DIA_TIERRA = 24.0;
    private static final double DIAS_POR_ANO_TIERRA = 365.25;
    private static double horasPorDiaPlaneta;
    private static double diasPorAnoPlaneta;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Configuración del nuevo planeta:");
        System.out.print("Ingrese las horas por día en el nuevo planeta: ");
        horasPorDiaPlaneta = scanner.nextDouble();
        System.out.print("Ingrese los días por año en el nuevo planeta: ");
        diasPorAnoPlaneta = scanner.nextDouble();
        System.out.print("Ingrese las horas a convertir: ");
        double horas = scanner.nextDouble();
        System.out.print("¿Convertir para el nuevo planeta? (true/false): ");
        boolean esParaPlaneta = scanner.nextBoolean();

        convertirYVisualizarTiempo(horas, esParaPlaneta);
        mostrarLimitesDeDatos();
    }

    private static void convertirYVisualizarTiempo(double horas, boolean esParaPlaneta) {
        double horasPorDia = esParaPlaneta ? horasPorDiaPlaneta : HORAS_POR_DIA_TIERRA;
        double diasPorAno = esParaPlaneta ? diasPorAnoPlaneta : DIAS_POR_ANO_TIERRA;

        double dias = horas / horasPorDia;
        double anos = dias / diasPorAno;

        System.out.printf("%s - Años: %.2f, Días: %.2f, Horas: %.0f%n",
                esParaPlaneta ? "Nuevo Planeta" : "Tierra", anos, dias, horas);
    }

    private static void mostrarLimitesDeDatos() {
        System.out.println("Máximo valor para int: " + Integer.MAX_VALUE);
        System.out.println("Máximo valor para long: " + Long.MAX_VALUE);
        System.out.println("Máximo valor para float: " + Float.MAX_VALUE);
        System.out.println("Máximo valor para double: " + Double.MAX_VALUE);
    }
}