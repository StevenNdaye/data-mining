package com.app.recommend;

import java.util.Map;

/**
 * Created by steven on 2014/09/02.
 */
public class Rating {

    public Map<String, Double> forUser(String user, Map<String, Object> ratings) {
        return (Map<String, Double>) ratings.get(user);
    }

    public double computeManhatanDistance(Map<String, Double> firstRatings, Map<String, Double> secondratings) {
        double distance = 0;
        for (String keyValue : firstRatings.keySet()) {
            if (secondratings.containsKey(keyValue)){
                distance += Math.abs(firstRatings.get(keyValue) - secondratings.get(keyValue));
            }
        }
        return distance;
    }
}
