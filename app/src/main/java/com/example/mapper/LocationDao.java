package com.example.mapper;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface LocationDao {

    // Insert a new location
    @Insert
    void insert(LocationEntity location);

    // Get all locations
    @Query("SELECT * FROM location_table")
    List<LocationEntity> getAllLocations();

    // Delete all locations
    @Query("DELETE FROM location_table")
    void deleteAllLocations();
}
