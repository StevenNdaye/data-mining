package com.app.recommend;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by steven on 2014/09/02.
 */
public class RatingTest {

    private Rating rating;
    private Map<String, Object> ratings;

    @Before
    public void setUp(){
        rating = new Rating();
        ratings =  new HashMap<String, Object>(){
            {
                put("user", new HashMap<String, Double>(){{
                    put("Blue Traveller", new Double(4.5));
                    put("Phoenix", new Double(5));
                }});
            }
        };
    }

    @Test
    public void itShouldGetRatingsWhenGivenAParticularUser(){
        Map<String, Double> data = rating.forUser("user", ratings);
        assertThat(data.get("Phoenix"), is(new Double(5)));
        assertThat(data, is(ratings.get("user")));
    }

}
