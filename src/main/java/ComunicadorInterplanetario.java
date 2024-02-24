import java.util.Scanner;

public class ComunicadorInterplanetario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Comunicador Interplanetario");
        System.out.print("Ingrese su mensaje: ");
        String mensaje = scanner.nextLine();

        System.out.println("Análisis de mensaje en curso...");
        int numeroDeVocales = contarVocales(mensaje);
        System.out.println("Número de vocales (señales importantes) en el mensaje: " + numeroDeVocales);

        String mensajeInvertido = invertirMensaje(mensaje);
        System.out.println("Mensaje invertido (para descifrar códigos): " + mensajeInvertido);

        boolean esPalindromo = verificarPalindromo(mensaje);
        System.out.println("¿El mensaje es un palíndromo (integridad del mensaje)?: " + esPalindromo);
    }

    class MensajeVacioException extends Exception {
        public MensajeVacioException(String mensaje) {
            super(mensaje);
        }
    }

    public static int contarVocales(String mensaje) {
        int contador = 0;
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static String invertirMensaje(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }

    public static boolean verificarPalindromo(String mensaje) {
        String textoLimpio = mensaje.replaceAll("\\s+", "").toLowerCase();
        String textoInvertido = new StringBuilder(textoLimpio).reverse().toString();
        return textoLimpio.equals(textoInvertido);
    }
}
