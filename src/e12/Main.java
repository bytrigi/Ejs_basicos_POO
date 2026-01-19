package e12;

public class Main {
    public static void main(String[] args) {
        Personaje p = new Personaje();
        p.setNombre("Guerrero");
        p.setVida(100);

        // Recibe un golpe fuerte
        System.out.println("¡Ataque recibido!");
        p.recibirDano(120); // Esto bajaría a -20, pero el setter lo deja en 0

        if (p.estaVivo()) {
            System.out.println(p.getNombre() + " sigue en pie con " + p.getVida() + " hp.");
        } else {
            System.out.println(p.getNombre() + " ha caído en combate.");
        }

        // Revive (lógica de juego)
        p.curar(50);
        System.out.println("Tras curarse: " + p.getVida() + " hp.");
    }
}