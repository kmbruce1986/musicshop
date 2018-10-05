package instruments;

import behaviours.IPlay;

public class Violin extends Instrument implements IPlay {

    private int size;

    public Violin(String brand, String material, String colour, Type type, int size) {
        super(brand, material, colour, type);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String play(){
        return "Cryin'";
    }
}
