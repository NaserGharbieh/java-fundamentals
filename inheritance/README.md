# Inheritance Project

This project demonstrates the concept of inheritance in Java through the implementation of various classes. Inheritance allows one class to inherit the properties and behaviors of another class, promoting code reusability and organization.

## Restaurant Class

The `Restaurant` class represents a restaurant and contains information such as its name, rating, price category, and reviews.

### Constructors
- `Restaurant(String name, int rating, double priceCategory)`: Creates a new instance of the `Restaurant` class with the specified name, rating, and price category.

### Methods
- `getName()`: Returns the name of the restaurant.
- `setName(String name)`: Sets the name of the restaurant.
- `getRating()`: Returns the rating of the restaurant.
- `setRating(int rating)`: Sets the rating of the restaurant.
- `getPriceCategory()`: Returns the price category of the restaurant.
- `setPriceCategory(double priceCategory)`: Sets the price category of the restaurant.
- `getReview()`: Returns the current review of the restaurant.
- `setReview(Review review)`: Sets the review of the restaurant.
- `getReviews()`: Returns a list of all reviews for the restaurant.
- `addReview(Review review)`: Adds a single review to the restaurant and updates the rating if necessary.
- `addMultipleReviews(List<Review> reviews)`: Adds multiple reviews to the restaurant and calculates the new rating.
- `toStringReviewslist()`: Returns a string representation of the restaurant including name, rating, price category, current review, and reviews.

## RestaurantTest Class

The `RestaurantTest` class contains JUnit tests for the methods in the `Restaurant` class.

### Methods
- `testAddReview()`: Tests the `addReview` method by adding a review and verifying the updated review and rating.
- `testAddMultipleReviews()`: Tests the `addMultipleReviews` method by adding multiple reviews and checking the resulting reviews list and rating.
- `testToString()`: Tests the `toString` method to ensure correct string representation.

## ReviewTest Class

The `ReviewTest` class contains JUnit tests for the methods in the `Review` class.

### Methods
- `testGetAuthor()`: Tests the `getAuthor` method by verifying the returned author name.
- `testGetNumberOfStars()`: Tests the `getNumberOfStars` method by verifying the returned number of stars.
- `testGetBody()`: Tests the `getBody` method by verifying the returned review body.
- `testToString()`: Tests the `toString` method to ensure correct string representation.


### `Reviewable` Interface

The `Reviewable` interface defines the methods for adding and managing reviews:

- `void addReview(Review review)`: Adds a single review to the entity.
- `void addMultipleReviews(List<Review> reviews)`: Adds multiple reviews to the entity.

### `Shop` Class

The `Shop` class implements the `Reviewable` interface and represents a shop entity with the following attributes:

- `String name`: The name of the shop.
- `String priceCategory`: The price category of the shop.
- `int rating`: The overall rating of the shop.
- `String description`: A description of the shop.
- `List<Review> reviews`: A list of reviews associated with the shop.

The `Shop` class provides methods to get and set the attributes and to calculate the rating based on reviews:

- `calculateRating()`: Calculates the overall rating based on the reviews.

### Test Cases

- `testGetName()`: Tests the `getName` method.
- `testSetName()`: Tests the `setName` method.
- `testGetPriceCategory()`: Tests the `getPriceCategory` method.
- `testSetPriceCategory()`: Tests the `setPriceCategory` method.
- `testGetDescription()`: Tests the `getDescription` method.
- `testSetDescription()`: Tests the `setDescription` method.
- `testToString()`: Tests the `toString` method.
- `addReview()`: Tests the `addReview` method by adding a single review and checking the updated reviews and rating.
- `addMultipleReviews()`: Tests the `addMultipleReviews` method by adding multiple reviews and checking the updated reviews and rating.

### Running Tests
To run the tests:

1. Open your terminal/command prompt.
2. Navigate to the project directory.
3. Run the following command:

   ```bash
   ./gradlew test
   ```

This command will execute the JUnit Jupiter tests in the `ShopTest` class and provide you with the test results.

### Test Cases

- `testGetName()`: Tests the `getName` method.
- `testSetName()`: Tests the `setName` method.
- `testGetPriceCategory()`: Tests the `getPriceCategory` method.
- `testSetPriceCategory()`: Tests the `setPriceCategory` method.
- `testGetDescription()`: Tests the `getDescription` method.
- `testSetDescription()`: Tests the `setDescription` method.
- `testToString()`: Tests the `toString` method.
- `addReview()`: Tests the `addReview` method by adding a single review and checking the updated reviews and rating.
- `addMultipleReviews()`: Tests the `addMultipleReviews` method by adding multiple reviews and checking the updated reviews and rating.
# MovieReview Class

The `MovieReview` class extends the `Review` class and represents a movie-specific review. It includes the following attributes:

- `String movie`: The name of the movie being reviewed.

The `MovieReview` class provides getters and setters for the `movie` attribute and overrides the `toString` method to display the review details, including the author, star rating, body, and movie name.

# Theater Class

The `Theater` class represents a theater entity, which can be reviewed. It includes the following attributes:

- `String name`: The name of the theater.
- `List<String> movies`: A list of movies currently playing in the theater.
- `List<Review> reviews`: A list of reviews associated with the theater.
- `int rating`: The overall rating of the theater based on its reviews.

The `Theater` class provides methods to add and remove movies, get reviews, and calculate the rating based on the reviews.

# TheaterTest Class

The `TheaterTest` class is a JUnit Jupiter test class for testing the functionality of the `Theater` class. It includes test methods to validate various operations such as adding and removing movies, calculating ratings, and adding theater reviews.

## Test Methods

- `testAddMovie()`: Tests the addition of a movie to the theater's movie list.
- `testRemoveMovie()`: Tests the removal of a movie from the theater's movie list.
- `testToString()`: Tests the `toString` method of the `Theater` class.
- `addTheaterReviewWithMovie()`: Tests adding a movie-specific review to the theater's reviews.
- `addTheaterReviewWithoutMovie()`: Tests adding a review without specifying a movie to the theater's reviews.

These test methods ensure that the `Theater` class and its associated operations function correctly.



