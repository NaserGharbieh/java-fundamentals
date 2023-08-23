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

## Conclusion

The inheritance project demonstrates the concepts of classes, inheritance, and testing in Java. The `Restaurant` class encapsulates restaurant information, and the `RestaurantTest` and `ReviewTest` classes validate the behavior of methods using JUnit tests. Understanding these concepts contributes to creating well-structured and maintainable code.
