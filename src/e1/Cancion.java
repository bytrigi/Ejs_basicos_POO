package e1;

public class Cancion {
    private String title;
    private String artist;
    private int duration;

    public String getTitle(){
        return title;
    }
    public void setTitle(String titleInput){
        title = titleInput;
    }
    public String getArtist(){
        return artist;
    }
    public void setArtist(String artistInput){
        artist = artistInput;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int durationInput){
        duration = durationInput;
    }
}
