package com.solirius.training.design_patterns.creational.factory;

public class Latte extends CoffeeDrink {

    private String name = "Latte";
    private String coffee = "60ml";
    private String water = MINIMUM_VOLUME;
    private String milk = "300ml";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getCoffee() {
        return this.coffee;
    }

    @Override
    public String getWater() {
        return this.water;
    }

    @Override
    public String getMilk() {
        return this.milk;
    }

}
