package com.app.recommend;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by steven on 2014/09/02.
 */
public class RatingTest {

    private Rating rating;
    private RatingsFactory factory;

    @Before
    public void setUp(){
        rating = new Rating();
        factory = new RatingsFactory();
    }

    @Test
    public void itShouldGetRatingsWhenGivenAParticularUser(){
        Map<String, Double> data = rating.forUser("Angelica", factory.createRatings());
        assertThat(data.get("Phoenix"), is(new Double(5.0)));
        assertThat(data, is(factory.createRatings().get("Angelica")));
    }

    @Test
    public void itShouldComputeManhattanDistanceBetweenTwoRatings(){
        double manhatanDistance = rating.computeManhatanDistance(factory.createHaileyRating(), factory.createJordynRating());
        assertThat(manhatanDistance, is(new Double(7.5)));
    }

    @Test
    public void itShouldComputeNearestNeighbor(){

        Map<Double, String> neighbors = new HashMap<Double, String>(){{
            put(new Double(2.0), "Veronica");
            put(new Double(4.0), "Chan");
            put(new Double(4.0), "Sam");
            put(new Double(4.5), "Dan");
            put(new Double(5.0), "Angelica");
            put(new Double(5.5), "Bill");
            put(new Double(7.5), "Jordyn");
        }};

        Map<Double, String> data = rating.computeNearestNeighbor("Hailey", factory.createRatings());
        assertThat(data, is(neighbors));
        assertThat(getFirstNeighbor(data), is("Veronica"));
    }

    private String getFirstNeighbor(Map<Double, String> data) {
        return data.get(data.keySet().toArray()[0]);
    }
}
