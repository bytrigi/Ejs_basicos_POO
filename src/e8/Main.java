package e8;

public class Main {
    public static void main(String[] args) {
        EquipoEsports e = new EquipoEsports();
        e.setNombre("T1");
        e.setJuego("League of Legends");
        e.setPais("Corea del Sur");
        e.setRankingMundial(2);

        System.out.println("Equipo: " + e.getNombre() + " - Rank: " + e.getRankingMundial());

        // Han ganado el mundial, suben al top 1
        e.setRankingMundial(1);

        System.out.println("Equipo: " + e.getNombre() + " - Rank Actualizado: " + e.getRankingMundial());
    }
}