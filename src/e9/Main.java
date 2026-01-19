package e9;

public class Main {
    public static void main(String[] args) {
        CancionStats c = new CancionStats();
        c.setTitulo("Thriller");

        // Simulamos 5 reproducciones
        for (int i = 0; i < 5; i++) {
            c.reproducir();
        }

        System.out.println("Canción: " + c.getTitulo());
        System.out.println("Total reproducciones: " + c.getReproducciones());
    }
}