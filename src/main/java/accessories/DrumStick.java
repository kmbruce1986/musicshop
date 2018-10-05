package accessories;

public class DrumStick extends Accessory {

    private String brand;

    public DrumStick(String accessoryType, Double costPrice, Double sellingPrice, String brand) {
        super(accessoryType, costPrice, sellingPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
