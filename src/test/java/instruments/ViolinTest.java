package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void setUp() {
        violin = new Violin("Stentor", "Wood", "Brown", Type.STRING, 10);
    }

    @Test
    public void hasBrand() {
        assertEquals("Stentor", violin.getBrand());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", violin.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Brown", violin.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.STRING, violin.getType());
    }

    @Test
    public void hasSize() {
        assertEquals(10, violin.getSize());
    }

    @Test
    public void canPlay() {
        assertEquals("Cryin'", violin.play());
    }
}
