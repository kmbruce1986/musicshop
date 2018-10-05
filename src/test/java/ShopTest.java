import accessories.DrumStick;
import instruments.Drum;
import instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumStick drumStick;
    Drum drum;

    @Before
    public void setUp() {
        drum = new Drum(40.00, 100.00,"Pearl", "Wood", "Black", Type.PERCUSSION, "Snare");
        drumStick = new DrumStick("Drum Stick", 4.00, 20.00, "Pearl");
        shop = new Shop();
    }

    @Test
    public void canCountStock() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(drum);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(drum);
        shop.removeItemFromStock(drum);
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canCalculateTotalProfit() {
        shop.addItemToStock(drum);
        shop.addItemToStock(drumStick);
        assertEquals(76.00, shop.calculateTotalPossibleProfit(), 0.01);
    }
}
