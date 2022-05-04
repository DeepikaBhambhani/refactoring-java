import org.jetbrains.annotations.NotNull;

public class Movie {
    @NotNull
    private String title;
    private MovieCode code;

    public Movie(String title, MovieCode code) {
        this.title = title;
        this.code = code;
    }

    /**
     * @return title of movie
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return movie code
     */
    public String getCode() {
        return code.toString();
    }
}