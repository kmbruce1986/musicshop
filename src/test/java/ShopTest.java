import accessories.DrumStick;
import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumStick drumStick;
    Drum drum;

    @Before
    public void setUp() {
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
}
