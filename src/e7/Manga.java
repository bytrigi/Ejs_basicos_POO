package e7;

public class Manga {
    private String titulo;
    private String autor;
    private int volumen;
    private boolean leido; // true o false

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getVolumen() { return volumen; }
    public void setVolumen(int volumen) { this.volumen = volumen; }

    // En los booleanos, el getter suele llamarse "is..." en lugar de "get..."
    public boolean isLeido() { return leido; }
    public void setLeido(boolean leido) { this.leido = leido; }
}
