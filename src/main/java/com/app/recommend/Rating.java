package com.app.recommend;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by steven on 2014/09/02.
 */
public class Rating {

    public Map<String, Double> forUser(String user, Map<String, Object> ratings) {
        return getUserRatings(ratings, user);
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

    //Using the Minkowski Formula where r=2 as it implements Euclidean
    public double computeMinkowskiDistance(Map<String, Double> firstRatings, Map<String, Double> secondRatings, int r){
        double distance = 0;
        boolean commonRatings = false;

        for (String keyValue : firstRatings.keySet()) {
            if (secondRatings.containsKey(keyValue)){
                distance += Math.pow(Math.abs(firstRatings.get(keyValue) - secondRatings.get(keyValue)), r);
                commonRatings = true;
            }
        }

        if (commonRatings) {
            return Math.pow(distance, r);
        }

        return 0;
    }

    //Based on the Manhattan Distance formula, the nearest neighbor(the one whose distance with the user is closer to zero) is computed.
    public Map<Double, String> computeNearestNeighbor(String user, Map<String, Object> userRatings) {

        Map<Double, String> neighbors = new HashMap<Double, String>();

        for (String username : userRatings.keySet()) {
            if(username != user){
                double distance = computeManhattanDistance(getUserRatings(userRatings, username),
                        getUserRatings(userRatings, user));
                neighbors.put(distance, username);
            }
        }
        return sortNeighbors(neighbors);
    }

    private Map<Double, String> sortNeighbors(Map<Double, String> neighbors) {
        return new TreeMap<Double, String>(neighbors);
    }

    public Map<String, Double> recommend(String user, Map<String, Object> userRatings) {

        Map<String, Double> recommendations = new HashMap<String, Double>();

        String nearestNeighbor = getNearestNeighbor(computeNearestNeighbor(user, userRatings));

        Map<String, Double> nearestNeighborRatings = getUserRatings(userRatings, nearestNeighbor);
        Map<String, Double> currentUserRatings = getUserRatings(userRatings, user);

        for (String rating : nearestNeighborRatings.keySet()) {
            if(notRated(currentUserRatings, rating)){
                recommendations.put(rating, nearestNeighborRatings.get(rating));
            }
        }
        return sortedRecommendations(recommendations);
    }

    private boolean notRated(Map<String, Double> currentUserRatings, String rating) {
        return !(currentUserRatings.containsKey(rating));
    }

    private TreeMap<String, Double> sortedRecommendations(Map<String, Double> recommendations) {
        return new TreeMap<String, Double>(recommendations);
    }

    private Map<String, Double> getUserRatings(Map<String, Object> userRatings, String nearestNeighbor) {
        return (Map<String, Double>) userRatings.get(nearestNeighbor);
    }

    private String getNearestNeighbor(Map<Double, String> nearestNeighbor) {
        return nearestNeighbor.get(nearestNeighbor.keySet().toArray()[0]);
    }
}
