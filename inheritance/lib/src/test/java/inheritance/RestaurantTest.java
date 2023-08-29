package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {
    private Restaurant restaurant;

    @BeforeEach
    public void setUp() {
        restaurant = new Restaurant("Test Restaurant", 0, 2.0);
    }

    @Test
    public void testAddReview() {
        Review review1 = new Review("Bob", 3, "Average place!");
        Restaurant restaurant2 = new Restaurant("Another Restaurant", 3, 0);
        restaurant2.addReview(review1);
        System.out.println(restaurant2.toString());


        assertEquals(review1, restaurant2.getReview());
        assertEquals(3, restaurant2.getRating());
    }


   @Test
   void testAddMultipleReviews() {
       // Create reviews with different ratings
       Review review1 = new Review("Alice", 5, "Great place!");
       Review review2 = new Review("Bob", 4, "Good food!");
       Review review3 = new Review("Charlie", 2, "Not impressed");

       ArrayList reviews = new ArrayList();
       reviews.add(review1);
       reviews.add(review2);
       reviews.add(review3);


       Restaurant restaurant = new Restaurant("Sample Restaurant", 0, 0);

       // Add multiple reviews to the restaurant
       restaurant.addMultipleReviews(reviews);

       // Check if the reviews are added and the rating is calculated correctly
       assertEquals(reviews, restaurant.getReviews());
       assertEquals(3, restaurant.getReviews().size());
       assertEquals(3, restaurant.getRating());
   }

    @Test
    public void testToString() {

       String expectedString = "Restaurant{name='Test Restaurant', rating=0, priceCategory=2.0, review='null'}";

        assertEquals(expectedString, restaurant.toString());
    }
    @Test
    public void testToStringAfteraddingRev() {
        Review review1 = new Review("Bob", 3, "Average place!");
        Restaurant restaurant2 = new Restaurant("Another Restaurant", 3, 0);
        restaurant2.addReview(review1);

        String expectedString = "Restaurant{name='Another Restaurant', rating=3, priceCategory=0.0, review='Review{author='Bob', numberOfStars=3, body='Average place!'}'}";

        assertEquals(expectedString, restaurant2.toString());
    }
}
