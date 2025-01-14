package com.example.mapper;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {LocationEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    // Abstract method to get DAO
    public abstract LocationDao locationDao();

    private static AppDatabase INSTANCE;

    // Singleton pattern for Room database instance
    public static AppDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    AppDatabase.class, "mapper_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
