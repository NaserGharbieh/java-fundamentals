package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater implements Reviewable {
    private String name;
    private List<String> movies;
    private List<Review> reviews;
    private int rating;


    public Theater(String name, List<String> movies) {
        this.name = name;
        this.movies = movies;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public void addMovie (String movie){
        this.movies.add(movie);

    }
    public void removeMovie  (String movie){
        this.movies.remove(movie);
    }
    public List<Review> getReviews() {
        return reviews;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }

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
