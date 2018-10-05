package instruments;

import behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int numberOfValves;

    public Trumpet(String brand, String material, String colour, Type type, int numberOfValves) {
        super(brand, material, colour, type);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "Trumpetin'";
    }
}
