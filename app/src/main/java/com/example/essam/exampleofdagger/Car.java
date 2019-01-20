package com.example.essam.exampleofdagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;

    @Inject // constructor injector
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void remotlyCar(Remote remote) {
        remote.setRemotly(this);
    }

    public void drive() {
        Log.d(TAG, "drive: ");
    }
}
