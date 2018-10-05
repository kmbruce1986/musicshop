package instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private String size;

    public Piano(String brand, String material, String colour, Type type, String size) {
        super(brand, material, colour, type);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String play(){
        return "Tinklin'";
    }
}
