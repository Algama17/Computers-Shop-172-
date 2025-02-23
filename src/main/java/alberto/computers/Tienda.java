package alberto.computers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String nombre;
    private String propietario;
    private String identificadorTributario;
    private List<Ordenador> ordenadores;

    public Tienda(String nombre, String propietario, String identificadorTributario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        this.ordenadores = new ArrayList<>();
    }

    public void agregarOrdenador(Ordenador ordenador) {
        ordenadores.add(ordenador);
    }

    public boolean eliminarOrdenadorPorMarca(String marca) {
        return ordenadores.removeIf(ordenador -> ordenador.getMarca().equalsIgnoreCase(marca));
    }

    public Ordenador buscarOrdenadorPorMarca(String marca) {
        for (Ordenador ordenador : ordenadores) {
            if (ordenador.getMarca().equalsIgnoreCase(marca)) {
                return ordenador;
            }
        }
        return null;
    }
}
