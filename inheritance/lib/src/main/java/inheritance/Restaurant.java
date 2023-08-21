package inheritance;


public class Restaurant {
    private String name;
    private double numberOfStars=-1;
    private double priceCategory;
    private String review;



    public Restaurant(String name, double numberOfStars, double priceCategory) {
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.priceCategory = priceCategory;
    }


    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", priceCategory=" + priceCategory +
                ", review='" + review + '\'' +
                '}';
    }

    public void addReview(Review review){
        setReview(review.toString());
        if (this.numberOfStars ==-1)
            this.numberOfStars=review.getNumberOfStars();

    }



}
