package inheritance;

public class Review {
    private String author;
    private double numberOfStars;
    private String body;

    public Review(String author, double numberOfStars, String body) {
        this.author = author;
        this.numberOfStars = numberOfStars;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", body='" + body + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(double numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
