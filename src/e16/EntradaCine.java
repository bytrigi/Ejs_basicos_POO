package e16;

public class EntradaCine {
    private String pelicula;
    private double precioBase;
    private boolean esEstudiante;

    public void setPelicula(String pelicula) { this.pelicula = pelicula; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    public void setEsEstudiante(boolean esEstudiante) { this.esEstudiante = esEstudiante; }

    public double getPrecioFinal() {
        if (esEstudiante) {
            // Aplicamos un 20% de descuento
            return precioBase * 0.8;
        } else {
            return precioBase;
        }
    }
}
