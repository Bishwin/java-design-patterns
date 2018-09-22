package com.solirius.training.design_patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(singleton.hashCode());

    }
}
