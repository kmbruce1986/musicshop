package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Steinway & Sons", "Wood", "Pink", Type.STRING, "Baby");
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
    public void hasNumberOfStrings() {
        assertEquals("Baby", piano.getSize());
    }

    @Test
    public void canPlay() {
        assertEquals("Tinklin'", piano.play());
    }

}
