package com.solirius.training.design_patterns.creational.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public EagerSingleton getInstance() {
        return instance;
    }

}
