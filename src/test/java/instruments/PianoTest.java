package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano(1000.00, 4000.00,"Steinway & Sons", "Wood", "Pink", Type.STRING, "Baby");
    }

    @Test
    public void hasCostPrice() {
        assertEquals(1000.00, piano.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(4000.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3000.00, piano.markup(), 0.01);
    }

    @Test
    public void hasBrand() {
        assertEquals("Steinway & Sons", piano.getBrand());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Pink", piano.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.STRING, piano.getType());
    }

    @Test
    public void hasSize() {
        assertEquals("Baby", piano.getSize());
    }

    @Test
    public void canPlay() {
        assertEquals("Tinklin'", piano.play());
    }

}
