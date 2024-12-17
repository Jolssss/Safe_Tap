package com.example.safetap;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "SafeTap.db";
    private static final int DATABASE_VERSION = 1;

    // Table name and column names
    private static final String TABLE_USERS = "users";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_PASSWORD = "password";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_USERS_TABLE = "CREATE TABLE " + TABLE_USERS + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_EMAIL + " TEXT,"
                + COLUMN_PASSWORD + " TEXT" + ")";
        db.execSQL(CREATE_USERS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed and create a new one
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        onCreate(db);
    }

    /**
     * Insert user into the database.
     * @param email User's email
     * @param password User's password
     * @return true if the user was inserted successfully, false if the user already exists
     */
    public boolean insertUser(String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query(
                TABLE_USERS,
                null,
                COLUMN_EMAIL + "=?",
                new String[]{email},
                null,
                null,
                null
        );

        if (cursor.moveToFirst()) {
            // User already exists
            cursor.close();
            return false;
        } else {
            cursor.close();
            ContentValues values = new ContentValues();
            values.put(COLUMN_EMAIL, email);
            values.put(COLUMN_PASSWORD, password);

            long result = db.insert(TABLE_USERS, null, values);
            db.close();
            return result != -1; // Return true if the insertion was successful, false otherwise
        }
    }
}