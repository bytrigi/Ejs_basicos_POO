package e16;

public class Main {
    public static void main(String[] args) {
        EntradaCine e1 = new EntradaCine();
        e1.setPrecioBase(10.0);
        e1.setEsEstudiante(false);

        EntradaCine e2 = new EntradaCine();
        e2.setPrecioBase(10.0);
        e2.setEsEstudiante(true);

        System.out.println("Precio Normal: " + e1.getPrecioFinal() + "€");
        System.out.println("Precio Estudiante: " + e2.getPrecioFinal() + "€");
    }
}