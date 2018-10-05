package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic("Sheet Music", 1.99, 8.99, "Late to the party");
    }

    @Test
    public void canGetAccessoryType() {
        assertEquals("Sheet Music", sheetMusic.getAccessoryType());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(1.99, sheetMusic.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(8.99, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(7, sheetMusic.markup(), 0.01);
    }

    @Test
    public void canGetSong() {
        assertEquals("Late to the party", sheetMusic.getSong());
    }
}
