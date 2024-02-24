import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlanificadorDeTareasTest {

    @Test
    void testCargaTrabajoOptima() {
        int[] habilidades = {1, 2, 3};
        int[] tareas = {3, 2, 1};
        int cargaTrabajoEsperada = 10; // 1*3 + 2*2 + 3*1
        assertEquals(cargaTrabajoEsperada, PlanificadorDeTareas.calcularCargaTrabajo(habilidades, tareas));
    }

    @Test
    void testAsignacionTareaAMiembroInvalido() {
        Exception excepcion = assertThrows(IllegalArgumentException.class, () ->
                PlanificadorDeTareas.asignarTareaAMiembro(5, 2));
        assertEquals("Miembro no disponible para la asignación de tareas.", excepcion.getMessage());
    }
}
