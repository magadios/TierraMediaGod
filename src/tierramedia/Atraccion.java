package tierramedia;

public class Atraccion {
    private final double costo;
    private final int duracion;
    private final int cuposPersonas;
    private final String tipoAtraccion;

    public Atraccion(double costo, int duracion, int cuposPersonas, String tipoAtraccion) {
        this.costo = costo;
        this.duracion = duracion;
        this.cuposPersonas = cuposPersonas;
        this.tipoAtraccion = tipoAtraccion;
    }

    public double getCosto() {
        return costo;
    }

    public String getTipoAtraccion() {
        return tipoAtraccion;
    }
}
