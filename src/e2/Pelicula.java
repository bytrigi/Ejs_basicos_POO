package e2;

public class Pelicula {
    private String title;
    private String director;
    private int premieringYear;
    private int duration;

    public String getTitle(){
        return title;
    }
    public void setTitle(String titleInput){
        title = titleInput;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String directorInput){
        director = directorInput;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int durationInput){
        duration = durationInput;
    }
    public int getPremieringYear(){
        return premieringYear;
    }
    public void setPremieringYear(int premieringYearInput){
        premieringYear = premieringYearInput;
    }

}
