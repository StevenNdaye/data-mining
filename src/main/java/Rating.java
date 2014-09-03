import java.util.Map;

/**
 * Created by steven on 2014/09/02.
 */
public class Rating {

    private Map<String, Object> usersRatings = new RatingsFactory().createRatings();

    public Map<String, Double> forUser(String user, Map<String, Object> ratings) {
        return (Map<String, Double>) ratings.get(user);
    }
}
