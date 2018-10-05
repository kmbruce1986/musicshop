package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp() {
        drumStick = new DrumStick("Drum Stick", 4.00, 20.00, "Pearl");
    }

    @Test
    public void canGetAccessoryType() {
        assertEquals("Drum Stick", drumStick.getAccessoryType());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(4, drumStick.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(20, drumStick.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(16, drumStick.markup(), 0.01);
    }
}
