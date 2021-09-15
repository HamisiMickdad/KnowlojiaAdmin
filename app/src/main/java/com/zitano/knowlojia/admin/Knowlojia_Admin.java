package com.zitano.knowlojia.admin;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

public class Knowlojia_Admin extends MultiDexApplication {
    public static final String TAG = Knowlojia_Admin.class
            .getSimpleName();

    //private RequestQueue mRequestQueue;

    private static Knowlojia_Admin mInstance;
    private static Context context;

    @Override
    public void onCreate() {

        FirebaseApp.initializeApp(this);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        mInstance = this;
        Knowlojia_Admin.context = getApplicationContext();
        FirebaseDatabase.getInstance();

        super.onCreate();
    }
    public  static Context getAppContext() {
        return Knowlojia_Admin.context;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }


}

