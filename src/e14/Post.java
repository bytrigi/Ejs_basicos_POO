package e14;

public class Post {
    private String titulo;
    private int likes;
    private int dislikes;

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }

    public void darLike() { this.likes++; }
    public void darDislike() { this.dislikes++; }

    public int obtenerPopularidad() {
        return likes - dislikes;
    }
}
