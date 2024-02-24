import java.util.Scanner;

public class PlanificadorDeTareas {
    static int numMiembros;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de miembros de la tripulación: ");
        numMiembros = scanner.nextInt();

        System.out.print("Ingrese el número de tareas para hoy: ");
        int numTareas = scanner.nextInt();

        mostrarTablasDeTareas(numMiembros, numTareas);

        try {
            System.out.print("Ingrese el ID del miembro para asignarle tareas: ");
            int miembroId = scanner.nextInt();
            asignarTareaAMiembro(miembroId);
            System.out.println("Tareas asignadas correctamente.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error durante la asignación de tareas: " + e.getMessage());
        }
    }

    public static void mostrarTablasDeTareas(int numMiembros, int numTareas) {
        System.out.println("Tablas de tareas (multiplicar):");
        for (int i = 1; i <= numMiembros; i++) {
            System.out.println("Miembro " + i + ":");
            for (int j = 1; j <= numTareas; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static void asignarTareaAMiembro(int miembroId) {
        if (miembroId < 1 || miembroId > numMiembros) {
            throw new IllegalArgumentException("ID del miembro inválido: " + miembroId);
        }
    }
}
