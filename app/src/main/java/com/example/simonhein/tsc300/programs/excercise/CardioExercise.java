package com.example.simonhein.tsc300.programs.excercise;

/**
 * Created by simonhein on 07/03/15.
 */
public class CardioExercise extends Exercise {
    protected int intensity;
    protected int time;
    protected String label;
    protected int totalDistance;


    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }
}


