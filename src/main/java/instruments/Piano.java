package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private String size;

    public Piano(Double costPrice, Double sellingPrice, String brand, String material, String colour, Type type, String size) {
        super(costPrice, sellingPrice, brand, material, colour, type);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String play(){
        return "Tinklin'";
    }

    public Double markup(){
        return getSellingPrice() - getCostPrice();
    }
}
