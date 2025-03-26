package alberto.computers;

public class Ordenador {
    private String marca;
    private int memoria;
    private String procesador;
    private String sistemaOperativo;
    private double precio;

    public Ordenador(String marca, int memoria, String procesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.memoria = memoria;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", memoria=" + memoria + "GB" +
                ", procesador='" + procesador + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", precio=" + precio + "$" +
                '}';
    }
}