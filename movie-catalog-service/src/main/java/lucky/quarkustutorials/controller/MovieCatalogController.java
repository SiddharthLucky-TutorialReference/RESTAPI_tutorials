package lucky.quarkustutorials.controller;

import lucky.quarkustutorials.model.CatalogItem;
import lucky.quarkustutorials.model.Movie;
import lucky.quarkustutorials.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/movie/catalog")
public class MovieCatalogController
{
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    //Always make it a point to return Objects for parsing
    public List<CatalogItem> getUsersCatalog(@PathVariable("userId") String userId)
    {
       /* List<CatalogItem> userCatalog = new ArrayList<>();
        userCatalog.add(new CatalogItem("MovieName", "TestMovieName", 4));
        return userCatalog;*/

       UserRating userRating = restTemplate.getForObject("http://localhost:8083/ratings/users/"+userId, UserRating.class);

       userRating.getUserRatings().stream().map(
               rating -> {
                   Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
                   return new CatalogItem(movie.getMovieName(), movie.getMovieDescription(), rating.getRating());
               }).collect(Collectors.toList());
       return null;
    }
}
