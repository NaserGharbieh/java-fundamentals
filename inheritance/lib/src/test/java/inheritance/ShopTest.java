package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    @Test
    public void addReview() {
        Review review = new Review("Test User", 4,"A review");
        shop.addReview(review);
        List<Review> expectedReviews = new ArrayList<>();
        expectedReviews.add(review);
       int expectedRating= review.getNumberOfStars();
        assertEquals(expectedReviews, shop.getReviews());
        assertEquals(expectedRating, shop.getRating());


    }

    @Test
    public void addMultipleReviews() {
        Review review1 = new Review("Test User 1",  4,"A review");
        Review review2 = new Review("Test User 2",  5,"Another review");
        List<Review> reviews = new ArrayList<>();
        reviews.add(review1);
        reviews.add(review2);
        shop.addMultipleReviews(reviews);
        List<Review> expectedReviews = new ArrayList<>();
        expectedReviews.add(review1);
        expectedReviews.add(review2);
        int expectedRating= shop.getRating();
        assertEquals(expectedReviews, shop.getReviews());
        assertEquals(expectedRating, shop.getRating());


    }
}
