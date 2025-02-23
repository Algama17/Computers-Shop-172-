package alberto.computers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void testAgregarOrdenador() {
        tienda.agregarOrdenador(ordenador);
        assertNotNull(tienda.buscarOrdenadorPorMarca("Dell"), "El ordenador no fue agregado correctamente.");
    }

    @Test
    void testEliminarOrdenadorPorMarca() {
        tienda.agregarOrdenador(ordenador);

        boolean eliminado = tienda.eliminarOrdenadorPorMarca("Dell");
        assertTrue(eliminado, "No se pudo eliminar el ordenador con marca 'Dell'.");
        assertNull(tienda.buscarOrdenadorPorMarca("Dell"), "El ordenador no fue eliminado correctamente.");

        boolean noEliminado = tienda.eliminarOrdenadorPorMarca("MacBook");
        assertFalse(noEliminado, "Se eliminó un ordenador inexistente.");
    }
    
}
