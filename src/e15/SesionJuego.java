package e15;

public class SesionJuego {
    private String juego;
    private int minutosJugados;

    public void setJuego(String juego) { this.juego = juego; }
    public String getJuego() { return juego; }

    public void jugar(int minutos) {
        this.minutosJugados += minutos;
    }

    public double getHorasJugadas() {
        // Dividimos por 60.0 para obtener decimales
        return minutosJugados / 60.0;
    }
}
