package e4;

public class Main {
    public static void main(String[] args) {
        JugadorFutbol jugador = new JugadorFutbol();

        jugador.setEquipo("Deportivo de la Coruña");
        jugador.setDorsal(10);
        jugador.setNombre("Yeremay Hernandez Cubas");
        jugador.setPosicion("Extremo Izquierdo");

        String team = jugador.getEquipo();
        String name = jugador.getNombre();
        String pos = jugador.getPosicion();
        int number = jugador.getDorsal();

        System.out.println();

        System.out.println(team);
        System.out.println(name);
        System.out.println(pos);
        System.out.println(number);

        System.out.println();

        jugador.setEquipo("FC Barcelona");
        team = jugador.getEquipo();
        jugador.setDorsal(7);
        number = jugador.getDorsal();

        System.out.println();

        System.out.println("--- Fichaje realizado ---");
        System.out.println(team);
        System.out.println(name);
        System.out.println(pos);
        System.out.println(number);

    }
}