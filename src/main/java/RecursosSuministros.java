import java.util.Scanner;

public class RecursosSuministros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del recurso: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el consumo diario del recurso (en unidades): ");
        double consumoDiario = scanner.nextDouble();

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
    }
