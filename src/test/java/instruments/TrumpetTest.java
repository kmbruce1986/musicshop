package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet(100.00, 500.00,"Yamaha", "Brass", "Brass", Type.BRASS, 5);
    }

    @Test
    public void hasCostPrice() {
        assertEquals(100.00, trumpet.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(500.00, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(400.00, trumpet.markup(), 0.01);
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
