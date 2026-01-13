package e1;

public class Main {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion();

        cancion1.setTitle("Goteo");
        cancion1.setArtist("Duki");
        cancion1.setDuration(164);

        cancion2.setTitle("Tumbando el club");
        cancion2.setArtist("Neo Pistea");
        cancion2.setDuration(456);

        String title1 = cancion1.getTitle();
        System.out.printf(title1);


    }
}