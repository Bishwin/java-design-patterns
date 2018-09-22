package com.solirius.training.design_patterns.creational.singleton;

public class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception when creating singleton");
        }
    }

    public StaticBlockSingleton getInstance() {
        return instance;
    }

}
