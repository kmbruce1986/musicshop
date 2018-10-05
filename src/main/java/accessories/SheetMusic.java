package accessories;

public class SheetMusic extends Accessory {

    private String song;

    public SheetMusic(String accessoryType, Double costPrice, Double sellingPrice, String song) {
        super(accessoryType, costPrice, sellingPrice);
        this.song = song;
    }

    public String getSong() {
        return song;
    }
}
