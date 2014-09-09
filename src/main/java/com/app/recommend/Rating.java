package com.app.recommend;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

    public Map<Double, String> computeNearestNeighbor(String user, Map<String, Object> userRatings) {

        Map<Double, String> neighbors = new HashMap<Double, String>();

        for (String username : userRatings.keySet()) {
            if(username != user){
                Map<String, Double> firstRatings = (Map<String, Double>) userRatings.get(username);
                Map<String, Double> secondRatings = (Map<String, Double>) userRatings.get(user);

                double distance = computeManhatanDistance(firstRatings, secondRatings);
                neighbors.put(distance, username);
            }
        }
        return sortNeighbors(neighbors);
    }

    private Map<Double, String> sortNeighbors(Map<Double, String> neighbors) {
        return new TreeMap<Double, String>(neighbors);
    }
}
