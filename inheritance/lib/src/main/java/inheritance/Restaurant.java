package inheritance;


import java.util.List;

public class Restaurant {
    private String name;
    private int rating =-1;
    private double priceCategory;
    private Review review;
    private  List<Review> reviews;



    public Restaurant(String name, int rating, double priceCategory) {
        this.name = name;
        this.rating = rating;
        this.priceCategory = priceCategory;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(double priceCategory) {
        this.priceCategory = priceCategory;
    }
    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }



    public String toStringReviewslist() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", priceCategory=" + priceCategory +
                ", review=" + review +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", priceCategory=" + priceCategory +
                ", review='" + review + '\'' +
                '}';
    }
    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review){
        this.review=review;
        if (this.rating ==-1)
            this.rating =review.getNumberOfStars();

    }
    public void addMultipleReviews( List<Review> reviews){
        this.reviews=reviews;
        int sum=0;
        int rate=0;
        for (Review rev:reviews) {
            sum+=rev.getNumberOfStars();
        }
        rate= sum/reviews.size();
        this.rating=rate;

    }




}
