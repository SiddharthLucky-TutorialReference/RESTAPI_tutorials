package lucky.quarkustutorials.model;

public class CatalogItem
{
    private String movieName;
    private String desc;
    private int rating;

    //Always include the NoArgs Constructor so that the
    public CatalogItem()
    {

    }

    public CatalogItem(String name, String desc, int rating)
    {
        this.movieName = name;
        this.desc = desc;
        this.rating = rating;
    }

    public String getName() {
        return movieName;
    }

    public void setName(String name) {
        this.movieName = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
