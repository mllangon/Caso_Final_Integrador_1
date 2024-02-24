import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursosSuministros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese el nombre del recurso: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el consumo diario del recurso (en unidades): ");
            double consumoDiario = scanner.nextDouble();
            scanner.nextLine(); // Consume la línea nueva restante

            Recurso recurso = new Recurso(nombre, consumoDiario);

            double[] consumos = {10, 20, 15, 25, 30};

            System.out.println("Media de consumo: " + recurso.calcularMedia(consumos));
            System.out.println("Mínimo consumo: " + recurso.encontrarMinimo(consumos));
            System.out.println("Máximo consumo: " + recurso.encontrarMaximo(consumos));

            System.out.println("Ingrese la cantidad actual del recurso: ");
            double cantidadActual = scanner.nextDouble();
            System.out.println("Ingrese el umbral seguro del recurso: ");
            double umbralSeguro = scanner.nextDouble();

            if (recurso.alertaUmbral(cantidadActual, umbralSeguro)) {
                System.out.println("Alerta: Riesgo de bajo nivel de " + nombre);
            }
        } catch (InputMismatchException e) {
            System.err.println("Error: Entrada inválida. Por favor, ingrese un número válido.");
        }
    }

    static class Recurso {
        String nombre;
        double consumoDiario;

        Recurso(String nombre, double consumoDiario) {
            this.nombre = nombre;
            this.consumoDiario = consumoDiario;
        }

        double calcularMedia(double[] consumos) {
            double suma = 0;
            for (double consumo : consumos) {
                suma += consumo;
            }
            return suma / consumos.length;
        }

        double encontrarMinimo(double[] consumos) {
            double minimo = Double.MAX_VALUE;
            for (double consumo : consumos) {
                if (consumo < minimo) {
                    minimo = consumo;
                }
            }
            return minimo;
        }

        double encontrarMaximo(double[] consumos) {
            double maximo = Double.MIN_VALUE;
            for (double consumo : consumos) {
                if (consumo > maximo) {
                    maximo = consumo;
                }
            }
            return maximo;
        }

        boolean alertaUmbral(double cantidadActual, double umbralSeguro) {
            return (consumoDiario * 5) > (cantidadActual - umbralSeguro); // Ejemplo para 5 días
        }
    }
}
