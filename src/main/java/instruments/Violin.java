package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Violin extends Instrument implements IPlay, ISell {

    private int size;

    public Violin(Double costPrice, Double sellingPrice, String brand, String material, String colour, Type type, int size) {
        super(costPrice, sellingPrice, brand, material, colour, type);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String play(){
        return "Cryin'";
    }

    public Double markup(){
        return getSellingPrice() - getCostPrice();
    }
}
