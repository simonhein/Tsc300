package com.example.simonhein.tsc300.programs;

import com.example.simonhein.tsc300.programs.excercise.Exercise;
import com.example.simonhein.tsc300.programs.excercise.Interval;

import java.util.ArrayList;

/**
 * Created by simonhein on 07/03/15.
 */
public class Program {
    private int day;
    private ArrayList<DailyActivity> bonusProgram;
    private ArrayList<DailyMeal> nutrition;
    private ArrayList<Exercise> dailyProgram;

    // add
    public void add(Exercise exercise) {
        this.dailyProgram.add(exercise);
    }

    public Exercise get(int index) {
        return this.dailyProgram.get(index);
    }
}


