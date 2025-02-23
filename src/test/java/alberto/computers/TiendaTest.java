package alberto.computers;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest {
    private Tienda tienda;
    private Ordenador ordenador;

    @BeforeEach
    void setUp() {
        tienda = new Tienda("Algama", "Alberto García", "17062000");
        ordenador = new Ordenador("Dell", 16, "Intel i7", "Windows 11", 1200.0);
    }


}
