package instruments;

public abstract class Instrument {

    private Double costPrice;
    private Double sellingPrice;
    private String brand;
    private String material;
    private String colour;
    private Type type;

    public Instrument(Double costPrice, Double sellingPrice, String brand, String material, String colour, Type type) {
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.brand = brand;
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
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
