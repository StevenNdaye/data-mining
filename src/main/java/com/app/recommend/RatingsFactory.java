package com.app.recommend;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by steven on 2014/09/03.
 */
public class RatingsFactory {

    public Map<String, Double> createAngelicaRating(){
        return new HashMap<String, Double>(){{
            put("Blues Traveler", new Double(3.5));
            put("Broken Bells", new Double(2.0));
            put("Norah Jones", new Double(4.5));
            put("Phoenix", new Double(5.0));
            put("Slightly Stoopid", new Double(1.5));
            put("The Strokes", new Double(2.5));
            put("Vampire Weekend", new Double(2.0));
        }};
    }

    public Map<String, Double> createBillRating(){
        return new HashMap<String, Double>(){{
            put("Blues Traveler", new Double(2.0));
            put("Broken Bells", new Double(3.5));
            put("Deadmau5", new Double(4.0));
            put("Phoenix", new Double(2.0));
            put("Slightly Stoopid", new Double(3.5));
            put("Vampire Weekend", new Double(3.0));
        }};
    }

    public Map<String, Double> createChanRating(){
        return new HashMap<String, Double>(){{
            put("Blues Traveler", new Double(5.0));
            put("Broken Bells", new Double(1.0));
            put("Deadmau5", new Double(1.0));
            put("Norah Jones", new Double(3.0));
            put("Phoenix", new Double(5));
            put("Slightly Stoopid", new Double(1.0));
        }};
    }

    public Map<String, Double> createDanRating(){
        return new HashMap<String, Double>(){{
            put("Blues Traveler", new Double(3.0));
            put("Broken Bells", new Double(4.0));
            put("Deadmau5", new Double(4.5));
            put("Phoenix", new Double(3.0));
            put("Slightly Stoopid", new Double(4.5));
            put("The Strokes", new Double(4.0));
            put("Vampire Weekend", new Double(2.0));
        }};
    }

    public Map<String, Double> createHaileyRating(){
        return new HashMap<String, Double>(){{
            put("Broken Bells", new Double(4.0));
            put("Deadmau5", new Double(1.0));
            put("Norah Jones", new Double(4.0));
            put("The Strokes", new Double(4.0));
            put("Vampire Weekend", new Double(1.0));
        }};
    }

    public Map<String, Double> createJordynRating(){
        return new HashMap<String, Double>(){{
            put("Broken Bells", new Double(4.5));
            put("Deadmau5", new Double(4.0));
            put("Norah Jones", new Double(5.0));
            put("Phoenix", new Double(5.0));
            put("Slightly Stoopid", new Double(4.5));
            put("The Strokes", new Double(4.0));
            put("Vampire Weekend", new Double(4.0));
        }};
    }

    public Map<String, Double> createSamRating(){
        return new HashMap<String, Double>(){{
            put("Blues Traveler", new Double(5.0));
            put("Broken Bells", new Double(2.0));
            put("Norah Jones", new Double(3.0));
            put("Phoenix", new Double(5.0));
            put("Slightly Stoopid", new Double(4.0));
            put("The Strokes", new Double(5.0));
        }};
    }

    public Map<String, Double> createVeronicaRating(){
        return new HashMap<String, Double>(){{
            put("Blues Traveler", new Double(3.0));
            put("Norah Jones", new Double(5.0));
            put("Phoenix", new Double(4.0));
            put("Slightly Stoopid", new Double(2.5));
            put("The Strokes", new Double(3.0));
        }};
    }

    public Map<String, Object> createRatings(){
        return new HashMap<String, Object>(){{
            put("Angelica", createAngelicaRating());
            put("Bill", createBillRating());
            put("Chan", createChanRating());
            put("Dan", createDanRating());
            put("Hailey", createHaileyRating());
            put("Jordyn", createJordynRating());
            put("Sam", createSamRating());
            put("Veronica", createVeronicaRating());
        }};
    }

}
