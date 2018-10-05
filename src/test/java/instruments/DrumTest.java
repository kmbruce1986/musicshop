package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void setUp() {
        drum = new Drum("Pearl", "Wood", "Black", Type.PERCUSSION, "Snare");
    }

    @Test
    public void hasBrand() {
        assertEquals("Pearl", drum.getBrand());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", drum.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", drum.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.PERCUSSION, drum.getType());
    }

    @Test
    public void hasDrumType() {
        assertEquals("Snare", drum.getDrumType());
    }

    @Test
    public void canPlay() {
        assertEquals("Bangin'", drum.play());
    }
}
