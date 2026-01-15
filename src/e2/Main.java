package e2;

import e1.Cancion;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();

        pelicula.setTitle("Fast & Furious: Tokyo Drift");
        pelicula.setDirector("Tim Lee");
        pelicula.setPremieringYear(2003);
        pelicula.setDuration(156);

        imprimirInfoPelicula(pelicula);
        System.out.println();

        System.out.print("Modificando valor del propiedad Director...\n");
        String directorNew = pelicula.getDirector();
        pelicula.setDirector(directorNew.toUpperCase());

        System.out.println();
        System.out.print("Datos finales:\n");
        imprimirInfoPelicula(pelicula);
    }

    public static void imprimirInfoPelicula(Pelicula pelicula){
        String title = pelicula.getTitle();
        String director = pelicula.getDirector();
        int premieringYear = pelicula.getPremieringYear();
        int duration = pelicula.getDuration();

        System.out.printf("Titulo: %s\n", title);
        System.out.printf("Director: %s\n", director);
        System.out.printf("Anio de estreno: %d\n", premieringYear);
        System.out.printf("Duracion: %d\n", duration);

    }

}