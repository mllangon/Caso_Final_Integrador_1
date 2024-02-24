import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlanificadorDeTareasTest {

    @Test
    void testAsignacionTareaAMiembroInvalido() {
        PlanificadorDeTareas.numMiembros = 4;

        Exception excepcion = assertThrows(IllegalArgumentException.class, () ->
                PlanificadorDeTareas.asignarTareaAMiembro(5));

        String mensajeEsperado = "ID del miembro inválido: 5";
        assertEquals(mensajeEsperado, excepcion.getMessage());
    }
}
