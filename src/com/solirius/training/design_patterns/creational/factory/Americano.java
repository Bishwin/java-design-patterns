package com.solirius.training.design_patterns.creational.factory;

public class Americano extends CoffeeDrink {

    private String name = "Americano";
    private int coffee = 60;
    private int water = 90;
    private int milk = 0;
    private int size;
    private String options;

    public Americano(int size, String options ){
        this.size=size;
        this.options = options;
    }

    public Americano(int size){
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
