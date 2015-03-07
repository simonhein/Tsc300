package com.example.simonhein.tsc300;

import com.example.simonhein.tsc300.programs.Program;
import com.example.simonhein.tsc300.programs.excercise.BodyBuildingExercise;
import com.example.simonhein.tsc300.programs.excercise.Interval;

/**
 * Created by simonhein on 07/03/15.
 */
public class Main {
    public Main() {
        Program day1 = new Program();

        Interval theFunOne = new Interval(60, "theFunOne", 300);
        day1.add(theFunOne);
    }
}
