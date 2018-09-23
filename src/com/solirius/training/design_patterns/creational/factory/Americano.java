package com.solirius.training.design_patterns.creational.factory;

public class Americano extends CoffeeDrink {

    private String name = "Americano";
    private String coffee = "60ml";
    private String water = "90ml";
    private String milk = MINIMUM_VOLUME;

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
