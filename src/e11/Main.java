package e11;

public class Main {
    public static void main(String[] args) {
        BateriaMovil b = new BateriaMovil();
        b.setPorcentaje(50);

        System.out.println("Batería inicial: " + b.getPorcentaje() + "%");

        b.usar(20); // Baja a 30
        System.out.println("Tras usar: " + b.getPorcentaje() + "%");

        b.cargar(200); // Intenta subir mucho, pero el tope es 100
        System.out.println("Tras cargar: " + b.getPorcentaje() + "%");
    }
}