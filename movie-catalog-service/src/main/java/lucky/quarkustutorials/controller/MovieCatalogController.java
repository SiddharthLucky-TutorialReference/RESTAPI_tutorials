package lucky.quarkustutorials.controller;

import lucky.quarkustutorials.model.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie/catalog")
public class MovieCatalogController
{
    @RequestMapping("/{userId}")
    //Always make it a point to return Objects for parsing
    public List<CatalogItem> getUsersCatalog(@PathVariable("userId") String userId)
    {
        List<CatalogItem> userCatalog = new ArrayList<>();
        userCatalog.add(new CatalogItem("MovieName", "TestMovieName", 4));
        return userCatalog;
    }
}
