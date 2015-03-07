package com.example.simonhein.tsc300.programs.excercise;

import android.app.Activity;

import java.util.ArrayList;

/**
 * Created by simonhein on 07/03/15.
 */
public class Exercise {
    protected String name;
    protected String description;
    protected String videoLink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
}
