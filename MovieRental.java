import org.jetbrains.annotations.NotNull;

public class MovieRental {

    @NotNull
    private MovieId movieId;
    private int days;

    public MovieRental(MovieId movieId, int days) {
        this.movieId = movieId;
        this.days = days;
    }

    /**
     * @return movieid
     */
    public MovieId getMovieId() {
        return movieId;
    }

    /**
     * @return number of days
     */
    public int getDays() {
        return days;
    }
}