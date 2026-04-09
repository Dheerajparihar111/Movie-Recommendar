import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MovieService service = new MovieService();

        int choice;

        do {

            System.out.println("\n===== MOVIE RECOMMENDATION SYSTEM =====");
            System.out.println("1 View All Movies");
            System.out.println("2 Search Movie");
            System.out.println("3 Filter by Genre");
            System.out.println("4 Recommend Movies");
            System.out.println("5 Top Rated Movies");
            System.out.println("6 Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    service.showAllMovies();
                    break;

                case 2:
                    System.out.print("Enter movie name: ");
                    service.searchMovie(input.nextLine());
                    break;

                case 3:
                    System.out.print("Enter genre: ");
                    service.filterByGenre(input.nextLine());
                    break;

                case 4:
                    System.out.print("Enter preferred genre: ");
                    service.recommendMovies(input.nextLine());
                    break;

                case 5:
                    service.topRatedMovies();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);
    }
}