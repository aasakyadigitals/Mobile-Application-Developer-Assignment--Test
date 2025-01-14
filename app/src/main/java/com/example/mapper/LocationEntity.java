package com.example.mapper;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "location_table")
public class LocationEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private double latitude;
    private double longitude;
    private String description;

    public LocationEntity(double latitude, double longitude, String description) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
