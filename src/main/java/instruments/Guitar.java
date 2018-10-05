package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberofStrings;

    public Guitar(Double costPrice, Double sellingPrice, String brand, String material, String colour, Type type, int numberofStrings) {
        super(costPrice, sellingPrice, brand, material, colour, type);
        this.numberofStrings = numberofStrings;
    }

    public int getNumberofStrings() {
        return numberofStrings;
    }

    public String play(){
        return "Strummin'";
    }

    public Double markup(){
        return getSellingPrice() - getCostPrice();
    }
}
