package instruments;

public abstract class Instrument {

    private String brand;
    private String material;
    private String colour;
    private Type type;

    public Instrument(String brand, String material, String colour, Type type) {
        this.brand = brand;
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Type getType() {
        return type;
    }
}
