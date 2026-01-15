package e3;

public class Main {
    public static void main(String[] args) {

        YouTuber youtuber1 = new YouTuber();
        YouTuber youtuber2 = new YouTuber();
        YouTuber youtuber3 = new YouTuber();

        youtuber1.setChannelName("ElRubiusOMG");
        youtuber1.setCategory("Videojuegos");
        youtuber1.setSubs(40800000);

        youtuber2.setChannelName("Willyrex");
        youtuber2.setCategory("Videojuegos");
        youtuber2.setSubs(17200000);

        youtuber3.setChannelName("Billycherokee");
        youtuber3.setCategory("Automocion");
        youtuber3.setSubs(288000);

        imprimirInfoYouTuber(youtuber1);
        imprimirInfoYouTuber(youtuber2);
        imprimirInfoYouTuber(youtuber3);
    }


    public static void imprimirInfoYouTuber(YouTuber youtuber){
        String channelName = youtuber.getChannelName();
        String category = youtuber.getCategory();
        int subs = youtuber.getSubs();

        System.out.printf("Nombre del canal: %s\n", channelName);
        System.out.printf("Categoria: %s\n", category);
        System.out.printf("Suscriptores: %d\n", subs);
        System.out.println();
    }
}