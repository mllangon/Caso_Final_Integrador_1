import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComunicadorInterplanetario_Test {

    @Test
    void testContarVocales() {
        assertEquals(4, ComunicadorInterplanetario.contarVocales("Hola Mundo"));
    }

    @Test
    void testInvertirMensaje() {
        assertEquals("odnuM aloH", ComunicadorInterplanetario.invertirMensaje("Hola Mundo"));
    }

    @Test
    void testVerificarPalindromo() {
        assertTrue(ComunicadorInterplanetario.verificarPalindromo("ana"));
        assertFalse(ComunicadorInterplanetario.verificarPalindromo("hola"));
    }
}
