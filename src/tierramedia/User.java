package tierramedia;

public class User {

    private final double presupuesto;
    private final int tiempoDisponible;
    private final Atraccion tipoAtraccion;

    public User(double presupuesto, int tiempoDisponible, Atraccion tipoAtraccion) {
        this.presupuesto = presupuesto;
        this.tiempoDisponible = tiempoDisponible;
        this.tipoAtraccion = tipoAtraccion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public int getTiempoDisponible() {
        return tiempoDisponible;
    }

    public Atraccion getTipoAtraccion() {
        return tipoAtraccion;
    }
}

