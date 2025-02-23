package alberto.computers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

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

    void testBuscarOrdenadorPorMarca() {
        tienda.agregarOrdenador(ordenador);

        Ordenador encontrado = tienda.buscarOrdenadorPorMarca("Dell");
        assertNotNull(encontrado, "No se encontró el ordenador con marca 'Dell'.");
        assertEquals("Dell", encontrado.getMarca(), "La marca del ordenador encontrado no coincide.");

        Ordenador noEncontrado = tienda.buscarOrdenadorPorMarca("MacBook");
        assertNull(noEncontrado, "Se encontró un ordenador inexistente.");
    }

     @Test
    void testListarOrdenadores() {
        tienda.agregarOrdenador(ordenador);

        List<Ordenador> ordenadores = tienda.listarOrdenadores();
        assertNotNull(ordenadores, "La lista de ordenadores está vacía.");
        assertEquals(2, ordenadores.size(), "La cantidad de ordenadores listados no coincide.");
    }
}
