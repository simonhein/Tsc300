package com.example.simonhein.tsc300;

/**
 * Created by simonhein on 06/03/15.
 */
public class CalcPoints {
    /**
     * Calculates points of exercise
     *
     * @param value total amount of completed repetitions
     * @param pointWeight how many points per repetitions
     * @return
     */
    public static int updatePoints(int value, int pointWeight) {
        int maxPoints = 100;
        int points = value*pointWeight;

        if(points > maxPoints) {
            return maxPoints;
        }
        return points;
    }
}
