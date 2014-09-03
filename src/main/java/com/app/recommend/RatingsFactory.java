package com.app.recommend;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by steven on 2014/09/03.
 */
public class RatingsFactory {

    private Map<String, Double> angelicaRating = new HashMap<String, Double>(){{
        put("Blues Traveler", new Double(3.5));
        put("Broken Bells", new Double(2.0));
        put("Norah Jones", new Double(4.5));
        put("Phoenix", new Double(5.0));
        put("Slightly Stoopid", new Double(1.5));
        put("The Strokes", new Double(2.5));
        put("Vampire Weekend", new Double(2.0));
    }};

    private Map<String, Double> billRating = new HashMap<String, Double>(){{
        put("Blues Traveler", new Double(2.0));
        put("Broken Bells", new Double(3.5));
        put("Deadmau5", new Double(4.0));
        put("Phoenix", new Double(2.0));
        put("Slightly Stoopid", new Double(3.5));
        put("Vampire Weekend", new Double(3.0));
    }};
    private Map<String, Double> chanRating = new HashMap<String, Double>(){{
        put("Blues Traveler", new Double(5.0));
        put("Broken Bells", new Double(1.0));
        put("Deadmau5", new Double(1.0));
        put("Norah Jones", new Double(3.0));
        put("Phoenix", new Double(5));
        put("Slightly Stoopid", new Double(1.0));
    }};
    private Map<String, Double> danRating = new HashMap<String, Double>(){{
        put("Blues Traveler", new Double(3.0));
        put("Broken Bells", new Double(4.0));
        put("Deadmau5", new Double(4.5));
        put("Phoenix", new Double(3.0));
        put("Slightly Stoopid", new Double(4.5));
        put("The Strokes", new Double(4.0));
        put("Vampire Weekend", new Double(1.0));
    }};
    private Map<String, Double> haileyRating = new HashMap<String, Double>(){{
        put("Blues Traveler", new Double(4.0));
        put("Deadmau5", new Double(1.0));
        put("Norah Jones", new Double(4.0));
        put("The Strokes", new Double(4.0));
        put("Vampire Weekend", new Double(1.0));
    }};
    private Map<String, Double> jordynRating = new HashMap<String, Double>(){{
        put("Blues Traveler", new Double(5.0));
        put("Broken Bells", new Double(2.0));
        put("Norah Jones", new Double(5.0));
        put("Phoenix", new Double(5.0));
        put("Slightly Stoopid", new Double(4.5));
        put("The Strokes", new Double(4.0));
        put("Vampire Weekend", new Double(4.0));
    }};
    private Map<String, Double> samRating = new HashMap<String, Double>(){{
        put("Blues Traveler", new Double(5.0));
        put("Broken Bells", new Double(2.0));
        put("Norah Jones", new Double(3.0));
        put("Phoenix", new Double(5.0));
        put("Slightly Stoopid", new Double(4.0));
        put("The Strokes", new Double(5.0));
    }};
    private Map<String, Double> veronicaRating = new HashMap<String, Double>(){{
        put("Blues Traveler", new Double(3.0));
        put("Norah Jones", new Double(5.0));
        put("Phoenix", new Double(4.0));
        put("Slightly Stoopid", new Double(2.5));
        put("The Strokes", new Double(3.0));
    }};

    public Map<String, Object> createRatings(){
        return new HashMap<String, Object>(){{
            put("Angelica", angelicaRating);
            put("Bill", billRating);
            put("Chan", chanRating);
            put("Dan", danRating);
            put("Hailey", haileyRating);
            put("Jordyn", jordynRating);
            put("Sam", samRating);
            put("Veronica", veronicaRating);
        }};
    }

}
