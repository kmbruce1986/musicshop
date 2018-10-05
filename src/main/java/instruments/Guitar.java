package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberofStrings;

    public Guitar(String brand, String material, String colour, Type type, int numberofStrings) {
        super(brand, material, colour, type);
        this.numberofStrings = numberofStrings;
    }

    public int getNumberofStrings() {
        return numberofStrings;
    }

    public String play(){
        return "Strummin'";
    }
}
