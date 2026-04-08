import java.util.*;

public class Main {

    static ArrayList<Movie> movies = new ArrayList<>();

    public static void main(String[] args) {

        addMovies();
        System.out.println("Movie system initialized");

    }

    static void addMovies() {

        movies.add(new Movie("Inception", "SciFi", 8.8, 2010));
        movies.add(new Movie("Interstellar", "SciFi", 8.6, 2014));
        movies.add(new Movie("3 Idiots", "Comedy", 8.4, 2009));
    }

    static Scanner input = new Scanner(System.in);

    int choice;

do {
        System.out.println("\n===== MOVIE SYSTEM =====");
        System.out.println("1 View Movies");
        System.out.println("2 Exit");

        choice = input.nextInt();

        switch (choice) {
            case 1:
                showAllMovies();
                break;
        }

    } while (choice != 2);
}
