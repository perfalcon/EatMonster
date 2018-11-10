package com.falcon.balav.eatmonster.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class EatStatusDbHelper extends SQLiteOpenHelper {
    private static final String TAG = EatStatusDbHelper.class.getSimpleName();
    private static final String DATABASE_NAME = "eatstatus.db";
    private static final int VERSION = 1;

    public EatStatusDbHelper(Context context) {
        super (context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String CREATE_TABLE = "CREATE TABLE " + EatStatusContract.EatStatusEntry.TABLE_NAME + " (" +
                EatStatusContract.EatStatusEntry._ID + " INTEGER PRIMARY KEY," +
                EatStatusContract.EatStatusEntry.COINS + " INTEGER," +
                EatStatusContract.EatStatusEntry.SCORE + " INTEGER," +
                EatStatusContract.EatStatusEntry.LEVELID + " INTEGER," +
                EatStatusContract.EatStatusEntry.IMAGE + " TEXT NOT NULL," +
                EatStatusContract.EatStatusEntry.SAVESETTINGS + " INTEGER," +
                EatStatusContract.EatStatusEntry.SKIN + " TEXT NOT NULL"  +");";
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + EatStatusContract.EatStatusEntry.TABLE_NAME);
        onCreate(db);
    }


}
