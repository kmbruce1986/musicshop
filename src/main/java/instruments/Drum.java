package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Drum extends Instrument implements IPlay, ISell {

    private String drumType;

    public Drum(Double costPrice, Double sellingPrice, String brand, String material, String colour, Type type, String drumType) {
        super(costPrice, sellingPrice, brand, material, colour, type);
        this.drumType = drumType;
    }

    public String getDrumType() {
        return drumType;
    }

    public String play(){
        return "Bangin'";
    }

    public Double markup(){
        return getSellingPrice() - getCostPrice();
    }
}
