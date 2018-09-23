package com.solirius.training.design_patterns.creational.factory;

public class Espresso extends CoffeeDrink {

    private String name = "Espresso";
    private int coffee = 30;
    private int water = 0;
    private int milk = 0;
    private int size;
    private String options;

    public Espresso(int size, String options ){
        this.size=size;
        this.options = options;
    }

    public Espresso(int size){
        this.size=size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCoffee() {
        return size*this.coffee;
    }

    @Override
    public int getWater() {
        return size*this.water;
    }

    @Override
    public int getMilk() {
        return size*this.milk;
    }

    @Override
    public String getOptions() {
        return options;
    }
}
