package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void setUp() {
        guitarString = new GuitarString("Guitar String", 3.99, 9.99, GuitarStringType.G);
    }

    @Test
    public void canGetAccessoryType() {
        assertEquals("Guitar String", guitarString.getAccessoryType());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(3.99, guitarString.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(9.99, guitarString.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(6, guitarString.markup(), 0.01);
    }

    @Test
    public void canGetType() {
        assertEquals(GuitarStringType.G, guitarString.getNote());
    }
}
