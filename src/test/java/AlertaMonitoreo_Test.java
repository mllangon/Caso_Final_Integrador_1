import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class AlertaMonitoreoTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testDescomponerEnFactoresPrimos() {
        AlertaMonitoreo.descomponerEnFactoresPrimos(60);
        System.out.println("Descomposición en factores primos de 60: 2 2 3 5" + outContent.toString());

        String expectedOutput = "Descomposición en factores primos de 60: 2 2 3 5 \n".trim();
        String actualOutput = outContent.toString().trim();
        assertEquals(expectedOutput, actualOutput);
    }

}
