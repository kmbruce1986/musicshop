package instruments;

import behaviours.IPlay;

public class Drum extends Instrument implements IPlay {

    private String drumType;

    public Drum(String brand, String material, String colour, Type type, String drumType) {
        super(brand, material, colour, type);
        this.drumType = drumType;
    }

    public String getDrumType() {
        return drumType;
    }

    public String play(){
        return "Bangin'";
    }
}
