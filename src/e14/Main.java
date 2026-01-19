package e14;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setTitulo("Mi viaje a Japón");

        post.darLike();
        post.darLike();
        post.darLike();
        post.darDislike(); // 3 likes - 1 dislike

        System.out.println("Post: " + post.getTitulo());
        System.out.println("Popularidad: " + post.obtenerPopularidad());
    }
}