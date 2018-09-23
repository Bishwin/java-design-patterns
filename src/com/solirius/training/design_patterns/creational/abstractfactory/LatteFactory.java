package com.solirius.training.design_patterns.creational.abstractfactory;

import com.solirius.training.design_patterns.creational.factory.CoffeeDrink;
import com.solirius.training.design_patterns.creational.factory.Latte;

public class LatteFactory implements CoffeeDrinkAbstractFactory {

    private int size;
    private String options;

    public LatteFactory(int size, String options){
        this.size=size;
        this.options=options;
    }

    @Override
    public CoffeeDrink createCoffeeDrink() {
        return new Latte(size, options);
    }
}
