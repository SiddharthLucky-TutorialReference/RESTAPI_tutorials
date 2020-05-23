package lucky.quarkustutorials.controller;

import lucky.quarkustutorials.model.Rating;
import lucky.quarkustutorials.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class GetRatings
{
    @RequestMapping("/movie/{movieId}")
    public Rating getRatings(@PathVariable("movieId") String movieId)
    {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId)
    {
        UserRating userRating = new UserRating();
        userRating.initTestData(userId);
        return userRating;
    }
}
