package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {
    private Review review;

    @BeforeEach
    public void setUp() {
        review = new Review("John Doe", 4, "Sample Review");
    }

    @Test
    public void testGetAuthor() {
        assertEquals("John Doe", review.getAuthor());
    }

    @Test
    public void testGetNumberOfStars() {
        assertEquals(4, review.getNumberOfStars(), 0.01);
    }

    @Test
    public void testGetBody() {
        assertEquals("Sample Review", review.getBody());
    }

    @Test
    public void testToString() {
        String expectedString = "Review{author='John Doe', numberOfStars=4, body='Sample Review'}";
        assertEquals(expectedString, review.toString());
    }
}
