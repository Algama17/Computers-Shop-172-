package alberto.computers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrdenadorTest {
    private final Ordenador ordenador = new Ordenador("Dell", 16, "Intel i7", "Windows 11", 1200.0);

    @Test
    void testGetMarca() {
        assertEquals("Dell", ordenador.getMarca(), "La marca del ordenador no coincide.");
    }

    @Test
    void testToString() {
        String expected = "Ordenador{marca='Dell', memoria=16GB, procesador='Intel i7', sistemaOperativo='Windows 10', precio=1200.0$}";
        assertEquals(expected, ordenador.toString(), "La representación del ordenador no es correcta.");
    }
}
