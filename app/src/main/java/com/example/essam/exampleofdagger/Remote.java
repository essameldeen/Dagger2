package com.example.essam.exampleofdagger;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote(){

    }

    void setRemotly (Car car){
        Log.d(TAG, "remotly: first");
    }
}
