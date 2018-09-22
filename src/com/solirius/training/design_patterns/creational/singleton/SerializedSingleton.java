package com.solirius.training.design_patterns.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long servialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

}
