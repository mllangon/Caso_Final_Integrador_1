import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CronometroCosmico_Test {

    @Test
    void testConversionTierra() {
        double horas = 8760;
        double diasEsperados = 365;
        assertEquals(diasEsperados, CronometroCosmico.convertirHorasADiasTierra(horas), "La conversión de horas a días en la Tierra es incorrecta");
    }

    @Test
    void testLimitesDeDatos() {
        assertDoesNotThrow(() -> CronometroCosmico.mostrarLimitesDeDatos(), "El método mostrarLimitesDeDatos no debería lanzar excepciones");
    }

    @Test
    void testConversionNuevoPlaneta() {

        CronometroCosmico.configurarNuevoPlaneta(24.0, 500.0);
        double horas = 480;
        double diasEsperados = 20.0;
        assertEquals(diasEsperados, CronometroCosmico.convertirHorasADiasPlaneta(horas), 0.01, "La conversión de horas a días en el nuevo planeta es incorrecta");
    }
}
