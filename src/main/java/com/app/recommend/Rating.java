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

    //Using the Manhattan Distance Metric
    public double computeManhattanDistance(Map<String, Double> firstRatings, Map<String, Double> secondRatings) {
        double distance = 0;
        for (String keyValue : firstRatings.keySet()) {
            if (secondRatings.containsKey(keyValue)){
                distance += Math.abs(firstRatings.get(keyValue) - secondRatings.get(keyValue));
            }
        }
        return distance;
    }

    //Based on the Manhattan Distance formula, the nearest neighbor(the one whose distance with the user is closer to zero) is computed.
    public Map<Double, String> computeNearestNeighbor(String user, Map<String, Object> userRatings) {

        Map<Double, String> neighbors = new HashMap<Double, String>();

        for (String username : userRatings.keySet()) {
            if(username != user){
                double distance = computeManhattanDistance((Map<String, Double>) userRatings.get(username),
                        (Map<String, Double>) userRatings.get(user));
                neighbors.put(distance, username);
            }
        }
        return sortNeighbors(neighbors);
    }

    private Map<Double, String> sortNeighbors(Map<Double, String> neighbors) {
        return new TreeMap<Double, String>(neighbors);
    }

    public Map<String, Double> recommend(String user, Map<String, Object> userRatings) {
        return null;
    }
}
