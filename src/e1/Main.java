package e1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion();

        cancion1.setTitle("Goteo");
        cancion1.setArtist("Duki");
        cancion1.setDuration(164);

        cancion2.setTitle("Tumbando el club");
        cancion2.setArtist("Neo Pistea");
        cancion2.setDuration(456);

        imprimirInfoCancion(cancion1, 1);
        imprimirInfoCancion(cancion2, 2);

        System.out.println("Seleccione la cancion a modificar (1 o 2): ");
        int valSong = sc.nextInt();
        if (valSong == 1) {
            modificarPropiedad(cancion1, valSong);
        } else if (valSong == 2) {
            modificarPropiedad(cancion2, valSong);
        } else {
            System.out.println("Opción no válida.");
        }

        System.out.println("\n--- Resultado tras la modificación ---");
        if (valSong == 1) imprimirInfoCancion(cancion1, 1);
        if (valSong == 2) imprimirInfoCancion(cancion2, 2);

        devolverCancionMasLarga(cancion1,cancion2);
    }

    public static void imprimirInfoCancion(Cancion cancion, int numero) {
        System.out.printf("Informacion de la cancion %d: \n", numero);
        System.out.printf("Titulo: %s\n", cancion.getTitle());
        System.out.printf("Artista: %s\n", cancion.getArtist());
        System.out.printf("Duracion (segundos): %d\n", cancion.getDuration());
        System.out.println();
    }

    public static void modificarPropiedad(Cancion cancion, int valSong) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione la propiedad a modificar:");
        System.out.println("1. Titulo");
        System.out.println("2. Artista");
        System.out.println("3. Duracion (segundos)");

        int valProp = sc.nextInt();

        // --- CORRECCIÓN IMPORTANTE ---
        // Consumimos el salto de línea que deja nextInt() antes de pedir un String
        sc.nextLine();
        // -----------------------------

        switch (valProp) {
            case 1:
                System.out.printf("Introduce el nuevo valor para el titulo de la cancion %d: ", valSong);
                String titleNew = sc.nextLine();
                cancion.setTitle(titleNew);
                break;
            case 2:
                System.out.printf("Introduce el nuevo valor para el artista de la cancion %d: ", valSong);
                String artistNew = sc.nextLine();
                cancion.setArtist(artistNew);
                break;
            case 3:
                System.out.printf("Introduce el nuevo valor para la duracion de la cancion %d: ", valSong);
                int durationNew = sc.nextInt();
                cancion.setDuration(durationNew);
                break;
            default:
                System.out.println("Valor introducido no valido.");
        }
    }

    public static void devolverCancionMasLarga(Cancion cancion1, Cancion cancion2){
        if (cancion1.getDuration() > cancion2.getDuration()){
            System.out.printf("La cancion mas larga es " + cancion1.getTitle());
        } else if (cancion2.getDuration() > cancion1.getDuration()) {
            System.out.printf("La cancion mas larga es " + cancion2.getTitle());
        } else {
            System.out.print("Las dos canciones son igual de largas");
        }
    }
}