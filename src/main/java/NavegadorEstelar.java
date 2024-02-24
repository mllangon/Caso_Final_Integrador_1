import java.util.Scanner;

public class NavegadorEstelar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los valores para la matriz de terreno A (2x2):");
        int[][] matrizA = new int[2][2];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los valores para la matriz de terreno B (2x2):");
        int[][] matrizB = new int[2][2];
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizResultado = multiplicarMatrices(matrizA, matrizB);
        System.out.println("Matriz de ruta optimizada:");
        imprimirMatriz(matrizResultado);
    }

    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[matrizA.length][matrizB[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
