import java.util.*;

class MovieService {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieService() {
        addMovies();
    }

    private void addMovies() {

        movies.add(new Movie("Inception", "SciFi", 8.8, 2010));
        movies.add(new Movie("Interstellar", "SciFi", 8.6, 2014));
        movies.add(new Movie("3 Idiots", "Comedy", 8.4, 2009));
        movies.add(new Movie("KGF", "Action", 8.2, 2018));
        movies.add(new Movie("Dangal", "Drama", 8.3, 2016));
        movies.add(new Movie("Avengers", "Action", 8.0, 2012));
        movies.add(new Movie("Lord of the Rings", "SciFi", 8.1, 2015));
        movies.add(new Movie("Notebook", "Romance", 8.8,2019 ));
    }

    public void showAllMovies() {
        for (Movie m : movies) {
            m.display();
        }
    }

    public void searchMovie(String name) {

        boolean found = false;

        for (Movie m : movies) {
            if (m.getName().toLowerCase().contains(name.toLowerCase())) {
                m.display();
                found = true;
            }
        }

        if (!found) System.out.println("Movie not found");
    }

    public void filterByGenre(String genre) {

        boolean found = false;

        for (Movie m : movies) {
            if (m.getGenre().equalsIgnoreCase(genre)) {
                m.display();
                found = true;
            }
        }

        if (!found) System.out.println("No movies found");
    }

    public void recommendMovies(String genre) {

        boolean found = false;

        for (Movie m : movies) {
            if (m.getGenre().equalsIgnoreCase(genre) && m.getRating() >= 8) {
                m.display();
                found = true;
            }
        }

        if (!found) System.out.println("No recommendations available");
    }

    public void topRatedMovies() {

        movies.sort((a, b) -> Double.compare(b.getRating(), a.getRating()));

        for (int i = 0; i < Math.min(5, movies.size()); i++) {
            movies.get(i).display();
        }
    }
}