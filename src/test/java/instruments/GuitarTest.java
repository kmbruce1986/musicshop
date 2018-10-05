package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar(400.00, 1200.00,"Gibson", "Wood", "Black", Type.STRING, 8);
    }

    @Test
    public void hasCostPrice() {
        assertEquals(400.00, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(1200.00, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(800.00, guitar.markup(), 0.01);
    }

    @Test
    public void hasBrand() {
        assertEquals("Gibson", guitar.getBrand());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.STRING, guitar.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(8, guitar.getNumberofStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Strummin'", guitar.play());
    }
}
