package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheaterTest {
    private Theater theater;

    @BeforeEach
    public void setUp() {
        List<String> initialMovies = new ArrayList<>(Arrays.asList("Movie 1", "Movie 2"));
        theater = new Theater("Test Theater", initialMovies);
    }

    @Test
    public void testAddMovie() {
        theater.addMovie("New Movie");

        List<String> expectedMovies = new ArrayList<>(Arrays.asList("Movie 1", "Movie 2", "New Movie"));
        assertEquals(expectedMovies, theater.getMovies());
    }

    @Test
    public void testRemoveMovie() {
        theater.removeMovie("Movie 1");

        List<String> expectedMovies = new ArrayList<>(Arrays.asList("Movie 2"));
        assertEquals(expectedMovies, theater.getMovies());
    }

    @Test
    public void testToString() {
        String expectedString = "Theater{name='Test Theater', movies=[Movie 1, Movie 2]}";
        assertEquals(expectedString, theater.toString());
    }
}
