package e6;

public class Main {
    public static void main(String[] args) {
        Pokemon p = new Pokemon();
        p.setNombre("Pikachu");
        p.setTipo("Eléctrico");
        p.setNivel(5);
        p.setVida(100);

        System.out.println(p.getNombre() + " Nivel: " + p.getNivel() + " Vida: " + p.getVida());
        System.out.println();

        // Subida de nivel y cura
        p.setNivel(6);
        p.setVida(110);
        System.out.println("Subiendo de nivel...");
        System.out.println();

        System.out.println("--- Level Up! ---");
        System.out.println(p.getNombre() + " Nivel: " + p.getNivel() + " Vida: " + p.getVida());
    }
}