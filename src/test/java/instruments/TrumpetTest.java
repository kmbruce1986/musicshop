package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("Yamaha", "Brass", "Brass", Type.BRASS, 5);
    }

    @Test
    public void hasBrand() {
        assertEquals("Yamaha", trumpet.getBrand());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Brass", trumpet.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.BRASS, trumpet.getType());
    }

    @Test
    public void hasNumberOfValves() {
        assertEquals(5, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("Trumpetin'", trumpet.play());
    }
}
