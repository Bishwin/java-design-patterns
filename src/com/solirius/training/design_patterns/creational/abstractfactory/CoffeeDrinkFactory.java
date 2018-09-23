package com.solirius.training.design_patterns.creational.abstractfactory;

import com.solirius.training.design_patterns.creational.factory.CoffeeDrink;

public class CoffeeDrinkFactory {

    public static CoffeeDrink getCoffee(CoffeeDrinkAbstractFactory factory){
        return factory.createCoffeeDrink();
    }

}
