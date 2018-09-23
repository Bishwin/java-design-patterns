package com.solirius.training.design_patterns.creational.factory;

public class Latte extends CoffeeDrink {

    private String name = "Latte";
    private int coffee = 60;
    private int water = 0;
    private int milk = 300;
    private int size = 1;
    private String options;

    public Latte(int size, String options ){
        this.size=size;
        this.options = options;
    }

    public Latte(int size){
        this.size=size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCoffee() {
        return this.coffee*size;
    }

    @Override
    public int getWater() {
        return this.water*size;
    }

    @Override
    public int getMilk() {
        return this.milk*size;
    }

    @Override
    public String getOptions() {
        return options;
    }
}
