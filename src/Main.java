import java.util.*;

public class Main {

    static final String RESET = "\u001B[0m";
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String CYAN = "\u001B[36m";
    static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MovieService service = new MovieService();

        int choice;

        do {

            System.out.println(CYAN + "\n=== MOVIE RECOMMENDATION SYSTEM ===" + RESET);
            System.out.println(YELLOW + "| 1 View All Movies               |");
            System.out.println("| 2 Search Movie                  |");
            System.out.println("| 3 Filter by Genre               | ");
            System.out.println("| 4 Recommend Movies              |");
            System.out.println("| 5 Top Rated Movies              |");
            System.out.println("| 6 Exit                          |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+RESET);
            System.out.print(BLUE + "Enter choice: " + RESET);
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.println(GREEN + "\nAll Movies:" + RESET);
                    service.showAllMovies();
                    break;

                case 2:
                    System.out.print(BLUE + "Enter movie name: " + RESET);
                    service.searchMovie(input.nextLine());
                    break;

                case 3:
                    System.out.print(BLUE + "Enter genre: " + RESET);
                    service.filterByGenre(input.nextLine());
                    break;

                case 4:
                    System.out.print(BLUE + "Enter preferred genre: " + RESET);
                    service.recommendMovies(input.nextLine());
                    break;

                case 5:
                    System.out.println(GREEN + "\nTop Rated Movies:" + RESET);
                    service.topRatedMovies();
                    break;

                case 6:
                    System.out.println(RED + "Exiting..." + RESET);
                    break;

                default:
                    System.out.println(RED + "Invalid choice" + RESET);
            }

        } while (choice != 6);
    }
}