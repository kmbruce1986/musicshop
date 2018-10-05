package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    private int numberOfValves;

    public Trumpet(Double costPrice, Double sellingPrice, String brand, String material, String colour, Type type, int numberOfValves) {
        super(costPrice, sellingPrice, brand, material, colour, type);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "Trumpetin'";
    }

    public Double markup(){
        return getSellingPrice() - getCostPrice();
    }
}
