public class Movie {
    private String movieName;
    private int rating;
    private int yearReleased;

    public Movie(String movieName, int rating, int yearReleased){
        this.movieName = movieName;
        this.rating = rating;
        this.yearReleased = yearReleased;

    }
    public void changeName(String name){this.movieName = name; }

    public void changeRating(int rate){this.rating = rate;}

    public void changeYear(int year){this.yearReleased = year;}

    @Override
    public String toString(){
        String toPrint = this.movieName + "," + this.rating + "," + this.yearReleased;
        return toPrint;
    }

}
