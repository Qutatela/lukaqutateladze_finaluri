package com.example.lukaqutateladze_finaluri;

import android.provider.BaseColumns;

public class db {
    public final class FeedReaderContract {
        // To prevent someone from accidentally instantiating the contract class,
        // make the constructor private.
        private FeedReaderContract() {}

        /* Inner class that defines the table contents */
        public class FeedEntry implements BaseColumns {
            public static final String TABLE_NAME = "personal_management";
            public static final String COLUMN_NAME_TIME = "time";
            public static final String COLUMN_NAME_ABOUT = "about";
            public static final String COLUMN_NAME_DURATION = "duration";


        }
        private static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
                        FeedEntry._ID + " INTEGER PRIMARY KEY," +
                        FeedEntry.COLUMN_NAME_TIME + " TEXT," +
                        FeedEntry.COLUMN_NAME_ABOUT + " TEXT"+
                        FeedEntry.COLUMN_NAME_DURATION + " TEXT)";
    }
}
