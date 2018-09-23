package com.solirius.training.design_patterns.creational.factory;

public class Espresso extends CoffeeDrink {

    private String name = "Espresso";
    private String coffee = "30ml";
    private String water = MINIMUM_VOLUME;
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
