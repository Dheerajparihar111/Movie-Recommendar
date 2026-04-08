class Movie {

    String name;
    String genre;
    double rating;
    int year;

    Movie(String name, String genre, double rating, int year) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    void display() {
        System.out.println(name + " | " + genre + " | ⭐ " + rating + " | " + year);
    }
}
