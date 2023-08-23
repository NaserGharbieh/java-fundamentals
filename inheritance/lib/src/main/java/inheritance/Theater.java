package inheritance;

import java.util.List;

public class Theater {
    private String name;
    private List<String> movies;
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

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }
}
