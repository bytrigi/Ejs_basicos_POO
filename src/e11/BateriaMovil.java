package e11;

public class BateriaMovil {
    private int porcentaje;

    public void setPorcentaje(int porcentaje) { this.porcentaje = porcentaje; }
    public int getPorcentaje() { return porcentaje; }

    public void usar(int cantidad) {
        this.porcentaje -= cantidad;
        if (this.porcentaje < 0) this.porcentaje = 0; // Evitar negativos
    }

    public void cargar(int cantidad) {
        this.porcentaje += cantidad;
        if (this.porcentaje > 100) {
            this.porcentaje = 100; // Tope máximo
        }
    }
}
