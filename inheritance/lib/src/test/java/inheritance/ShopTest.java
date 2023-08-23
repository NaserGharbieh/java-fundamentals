package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop("Test Shop", "High", "Sample description");
    }

    @Test
    public void testGetName() {
        assertEquals("Test Shop", shop.getName());
    }

    @Test
    public void testSetName() {
        shop.setName("New Shop");
        assertEquals("New Shop", shop.getName());
    }

    @Test
    public void testGetPriceCategory() {
        assertEquals("High", shop.getPriceCategory());
    }

    @Test
    public void testSetPriceCategory() {
        shop.setPriceCategory("Medium");
        assertEquals("Medium", shop.getPriceCategory());
    }

    @Test
    public void testGetDescription() {
        assertEquals("Sample description", shop.getDescription());
    }

    @Test
    public void testSetDescription() {
        shop.setDescription("Updated description");
        assertEquals("Updated description", shop.getDescription());
    }

    @Test
    public void testToString() {
        String expectedString = "Shop{name='Test Shop', priceCategory='High', description='Sample description'}";
        assertEquals(expectedString, shop.toString());
    }
}
