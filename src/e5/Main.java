package e5;

public class Main {
    public static void main(String[] args) {
        Skin s1 = new Skin();
        s1.setNombre("Oni Phantom");
        s1.setVideojuego("Valorant");
        s1.setRareza("Premium");
        s1.setPrecio(17.75);

        System.out.println("Skin 1: " + s1.getNombre());
        System.out.println("Videojuego: " + s1.getVideojuego());
        System.out.println("Rareza: " + s1.getRareza());
        System.out.println("Precio: " + s1.getPrecio());
        System.out.println();

        Skin s2 = new Skin();
        s2.setNombre("Caballero Negro");
        s2.setVideojuego("Fortnite");
        s2.setRareza("Legendaria");
        s2.setPrecio(20.0);

        System.out.println("Skin 2: " + s2.getNombre());
        System.out.println("Videojuego: " + s2.getVideojuego());
        System.out.println("Rareza: " + s2.getRareza());
        System.out.println("Precio: " + s2.getPrecio());
        System.out.println();

        // Modificamos s1
        s1.setRareza("Ultra Edition");
        s1.setPrecio(25.50);

        System.out.println("Actulizando...");
        System.out.println();

        System.out.println("Skin actualizada: " + s1.getNombre());
        System.out.println("Nueva rareza: " + s1.getRareza());
        System.out.println("Nuevo precio: " + s1.getPrecio());
    }
}