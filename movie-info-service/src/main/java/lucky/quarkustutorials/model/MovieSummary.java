package lucky.quarkustutorials.model;

public class MovieSummary
{
    private String movieId;
    private String movieTitle;
    private String movieDesc;

    public MovieSummary() {
    }

    public MovieSummary(String movieId, String movieTitle, String movieDesc) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieDesc = movieDesc;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }
}
