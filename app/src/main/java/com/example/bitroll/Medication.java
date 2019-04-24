package com.example.bitroll;

import android.graphics.drawable.Drawable;

/**
 * @author Oszkar Pap
 * @version 1.0
 * This class set the Medication item
 */


public class Medication {
    private Long id;
    private String key;
    private String name;
    private String agent;
    private int image;

    public Medication(String name, String agent, int image) {
        this.name = name;
        this.agent = agent;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}