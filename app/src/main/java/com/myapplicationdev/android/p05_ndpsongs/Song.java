package com.myapplicationdev.android.p05_ndpsongs;

import java.io.Serializable;

public class Song implements Serializable {

	private int id;
	private String title;
	private String singers;
	private int yearReleased;
	private int stars;

    public Song(String title, String singers, int yearReleased, int stars) {
        this.title = title;
        this.singers = singers;
        this.yearReleased = yearReleased;
        this.stars = stars;
    }

    public Song(int id, String title, String singers, int yearReleased, int stars) {
        this.id = id;
        this.title = title;
        this.singers = singers;
        this.yearReleased = yearReleased;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSingers() {
        return singers;
    }


    public void setSingers(String singers) {
        this.singers = singers;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        String starsString = "";
        /*
        if (stars == 5){
            starsString = "*****";
        } else if (stars == 4){
            starsString = "****";
        }
        */

        //or
        for(int i = 0; i < stars; i++){
            starsString += " *";
        }
        return starsString;

    }
}
