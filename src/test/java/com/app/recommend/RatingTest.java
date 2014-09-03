package com.app.recommend;

import org.junit.Before;
import org.junit.Test;

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

}
