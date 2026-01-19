package e9;

public class CancionStats {
    private String titulo;
    private int reproducciones;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getReproducciones() { return reproducciones; }
    // No ponemos setReproducciones para obligar a usar el metodo reproducir()

    public void reproducir() {
        this.reproducciones++; // Suma 1
    }
}