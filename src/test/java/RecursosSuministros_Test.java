import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursoTest {

    @Test
    void testCalcularMedia() {
        Recurso recurso = new Recurso("Agua", 2);
        double[] consumos = {10, 20, 15, 25, 30};
        assertEquals(20, recurso.calcularMedia(consumos));
    }

    @Test
    void testEncontrarMinimo() {
        Recurso recurso = new Recurso("Agua", 2);
        double[] consumos = {10, 20, 15, 25, 30};
        assertEquals(10, recurso.encontrarMinimo(consumos));
    }

    @Test
    void testEncontrarMaximo() {
        Recurso recurso = new Recurso("Agua", 2);
        double[] consumos = {10, 20, 15, 25, 30};
        assertEquals(30, recurso.encontrarMaximo(consumos));
    }

    @Test
    void testAlertaUmbral() {
        Recurso recurso = new Recurso("Agua", 2);
        assertTrue(recurso.alertaUmbral(50, 45)); // Consume 10 unidades en 5 días, umbral seguro es 45
        assertFalse(recurso.alertaUmbral(100, 45)); // No debería alertar con suficiente recurso
    }
}
