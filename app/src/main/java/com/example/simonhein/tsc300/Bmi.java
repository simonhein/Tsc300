package com.example.simonhein.tsc300;

/**
 * Created by simonhein on 07/03/15.
 */
public class Bmi {

    public static double CalcBmi(double weight, double height) {
        double bmi = weight*Math.pow(height,2);
        return bmi;
    }
}