class Movie {

    private String name;
    private String genre;
    private double rating;
    private int year;

    public Movie(String name, String genre, double rating, int year) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    public String getName() { return name; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }
    public int getYear() { return year; }

    public void display() {
        System.out.println(name + " | " + genre + " | ⭐ " + rating + " | " + year);
    }
}