package com.example.simonhein.tsc300.programs.excercise;

/**
 * Created by simonhein on 07/03/15.
 */
public class BodyBuildingExercise extends Exercise {
    protected String[] reps;
    protected int maxWeight;



    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public BodyBuildingExercise(String name, String description, String[] reps, String videoLink) {
        this.name = name;
        this.description = description;
        this. reps = reps;
        this.videoLink = videoLink;
    }
}


