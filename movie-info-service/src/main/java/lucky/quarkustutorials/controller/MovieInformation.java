package lucky.quarkustutorials.controller;

import lucky.quarkustutorials.model.Movie;
import lucky.quarkustutorials.model.MovieSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieInformation
{

    @RequestMapping("/{movieId}")
    public Movie getMovieInformation(@PathVariable("movieId") String movieId)
    {
        return new Movie(movieId, "TestMovieName", "TestMovieDesc");
    }
}
