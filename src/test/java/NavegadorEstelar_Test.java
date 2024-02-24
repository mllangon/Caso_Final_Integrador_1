import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NavegadorEstelar_Test {

    @Test
    void testMultiplicarMatrices() {
        int[][] matrizA = {{1, 2}, {3, 4}};
        int[][] matrizB = {{2, 0}, {1, 2}};
        int[][] esperado = {{4, 4}, {10, 8}};
        assertArrayEquals(esperado, NavegadorEstelar.multiplicarMatrices(matrizA, matrizB));
    }

    @Test
    void testMultiplicacionMatricesIncompatibles() {
        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrizB = {{1, 2}, {3, 4}, {5, 6}};

        Exception excepcion = assertThrows(IllegalArgumentException.class, () ->
                NavegadorEstelar.multiplicarMatrices(matrizA, matrizB));

        String mensajeEsperado = "Las matrices no se pueden multiplicar: incompatibilidad de dimensiones.";
        String mensajeReal = excepcion.getMessage();
        assertTrue(mensajeReal.contains(mensajeEsperado));
    }
}
