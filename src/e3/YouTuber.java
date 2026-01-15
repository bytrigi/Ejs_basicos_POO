package e3;

public class YouTuber {
    private String channelName;
    private String category;
    private int subs;

    public String getChannelName(){
        return channelName;
    }
    public void setChannelName(String channelNameInput) {
        channelName = channelNameInput;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String categoryInput) {
        category = categoryInput;
    }
    public int getSubs() {
        return subs;
    }
    public void setSubs(int subsInput) {
        subs = subsInput;
    }
}
