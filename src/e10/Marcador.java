package e10;

public class Marcador {
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    // Setters para nombres
    public void setEquipoLocal(String equipoLocal) { this.equipoLocal = equipoLocal; }
    public void setEquipoVisitante(String equipoVisitante) { this.equipoVisitante = equipoVisitante; }

    // Métodos de lógica
    public void golLocal() {
        this.golesLocal++;
    }

    public void golVisitante() {
        this.golesVisitante++;
    }

    public String resultado() {
        // Devuelve formato "Local X - Y Visitante"
        return equipoLocal + " " + golesLocal + " - " + golesVisitante + " " + equipoVisitante;
    }
}
