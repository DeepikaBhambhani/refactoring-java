import org.jetbrains.annotations.NotNull;

public class MovieRental {

    @NotNull
    private String movieId;
    private int days;

    public MovieRental(String movieId, int days) {
        this.movieId = movieId;
        this.days = days;
    }

    /**
     * @return movieid
     */
    public String getMovieId() {
        return movieId;
    }

    /**
     * @return number of days
     */
    public int getDays() {
        return days;
    }
}