import java.util.Scanner;

public class PlanificadorDeTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de miembros de la tripulación: ");
        int numMiembros = scanner.nextInt();

        System.out.print("Ingrese el número de tareas para hoy: ");
        int numTareas = scanner.nextInt();

        System.out.println("Tablas de tareas (multiplicar):");
        for (int i = 1; i <= numMiembros; i++) {
            System.out.println("Miembro " + i + ":");
            for (int j = 1; j <= numTareas; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }

        int[] habilidades = {1, 2, 3};
        int[] tareas = {3, 2, 1};

        System.out.println("Distribución de tareas basada en carga de trabajo óptima:");
        int cargaTrabajoTotal = 0;
        for (int i = 0; i < habilidades.length; i++) {
            cargaTrabajoTotal += habilidades[i] * tareas[i];
        }
        System.out.println("Carga de trabajo total (producto escalar): " + cargaTrabajoTotal);

    }
}
