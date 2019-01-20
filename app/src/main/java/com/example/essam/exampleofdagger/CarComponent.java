package com.example.essam.exampleofdagger;


import dagger.Component;

@Component(modules = WheelsModule.class)
public interface CarComponent { //the Injector
    Car getCar();

    void inject(MainActivity mainActivity);
}
