package com.example.ci_culture;

import com.google.firebase.firestore.GeoPoint;

public class Bussines {
    String title;
    String description;
    String openingHours;
    GeoPoint location;

    public Bussines() {
    }

    public Bussines(String title, String description, String openingHours, GeoPoint location) {
        this.title = title;
        this.description = description;
        this.openingHours = openingHours;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public GeoPoint getLocation() {
        return location;
    }

    public void setLocation(GeoPoint location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Bussines{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", openingHours='" + openingHours + '\'' +
                ", location=" + location +
                '}';
    }
}
