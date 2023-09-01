package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Reviewable {
    private String name;
    private String priceCategory;
    private int rating = 0;
    private String description;
    private List<Review> reviews;


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", priceCategory='" + priceCategory + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Shop(String name, String priceCategory, String description) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public List<Review> getReviews() {return this.reviews;}
   //todo tEST THIS methods
    @Override
    public void addReview(Review review){

        if (this.reviews==null)
            reviews = new ArrayList<>();

        this.reviews.add(review);
        calculateRating();


    }


    @Override
    public void addMultipleReviews(List<Review> reviews) {
        if (this.reviews==null)
            this.reviews = new ArrayList<>(reviews);
        else this.reviews.addAll(reviews);
        calculateRating();

    }

    public void calculateRating() {
        int sum = 0;
        int rate = 0;
        for (Review rev : this.reviews) {
            sum += rev.getNumberOfStars();
        }
        rate = sum / this.reviews.size();
        this.rating = rate;
    }


}
