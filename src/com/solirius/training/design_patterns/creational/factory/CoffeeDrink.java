package com.solirius.training.design_patterns.creational.factory;

public abstract class CoffeeDrink {

    public static final String MINIMUM_VOLUME = "0ML";

    public abstract String getName();
    public abstract int getCoffee();
    public abstract int getWater();
    public abstract int getMilk();
    public abstract String getOptions();

    @Override
    public String toString(){
        return String.format("%s is %s ml coffee, with %s ml water and %s ml of milk. extras: %s",
                this.getName(),
                this.getCoffee(),
                this.getWater(),
                this.getMilk(),
                this.getOptions());
    }



}
