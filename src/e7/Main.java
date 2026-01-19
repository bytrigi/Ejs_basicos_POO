package e7;

public class Main {
    public static void main(String[] args) {
        Manga m = new Manga();
        m.setTitulo("One Piece");
        m.setAutor("Eiichiro Oda");
        m.setVolumen(100);
        m.setLeido(false);

        System.out.println("Manga: " + m.getTitulo() + " - Leído: " + m.isLeido());

        // Lo marcamos como leído
        m.setLeido(true);

        System.out.println("Manga: " + m.getTitulo() + " - Leído: " + m.isLeido());
    }
}