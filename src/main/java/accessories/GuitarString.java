package accessories;

public class GuitarString extends Accessory{

    private GuitarStringType note;

    public GuitarString(String accessoryType, Double costPrice, Double sellingPrice, GuitarStringType note) {
        super(accessoryType, costPrice, sellingPrice);
        this.note = note;
    }

    public GuitarStringType getNote() {
        return note;
    }
}
