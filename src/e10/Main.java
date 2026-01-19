package e10;

public class Main {
    public static void main(String[] args) {
        Marcador m = new Marcador();
        m.setEquipoLocal("Barça");
        m.setEquipoVisitante("Madrid");

        // Partido
        m.golLocal();    // 1-0
        m.golVisitante(); // 1-1
        m.golLocal();    // 2-1

        System.out.println("Resultado final: " + m.resultado());
    }
}