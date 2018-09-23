package com.solirius.training.design_patterns.creational.factory;

public abstract class CoffeeDrink {

    public static final String MINIMUM_VOLUME = "0ML";

    public abstract String getName();
    public abstract String getCoffee();
    public abstract String getWater();
    public abstract String getMilk();

    @Override
    public String toString(){
        return String.format("%s is %s coffee, with %s water and %s of milk",
                this.getName(),
                this.getCoffee(),
                this.getWater(),
                this.getMilk());
    }



}
