package com.course.finalproject;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

public class DiaryDBManager extends SQLiteOpenHelper {
    static final String TRAVEL_DB = "TRAVEL.db";
    static final String TRAVEL_TABLE = "TRAVEL";
    Context context = null;
    private static DiaryDBManager dbManager = null;
    static final String CREATE_DB = " CREATE TABLE " + TRAVEL_TABLE + " ( _id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + " name TEXT NOT NULL, diary TEXT, latitude TEXT, logitude TEXT, image TEXT);";
    public static DiaryDBManager getInstance(Context context) {
        if(dbManager == null) {
            dbManager = new DiaryDBManager(context, TRAVEL_DB, null, 1);
        }
        return dbManager;
    }
    public DiaryDBManager(Context context, String dbName, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, dbName, factory, version);
        this.context = context;
    }
    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DB);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int
            newV) {
    }
    public long insert(ContentValues addValue) {
        return getWritableDatabase().insert(TRAVEL_TABLE, null, addValue);
    }
    public Cursor query(String [] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy){
        return getReadableDatabase().query(TRAVEL_TABLE, columns, selection, selectionArgs, groupBy, having, orderBy);
    }
    public int delete(String whereClause, String[] whereArgs)
    {
        return getWritableDatabase().delete(TRAVEL_TABLE, whereClause, whereArgs);
    }
}


