package e15;

public class Main {
    public static void main(String[] args) {
        SesionJuego s = new SesionJuego();
        s.setJuego("Elden Ring");

        s.jugar(45);
        s.jugar(45); // Total 90 minutos

        System.out.println("Juego: " + s.getJuego());
        System.out.println("Horas totales: " + s.getHorasJugadas() + "h");
    }
}