package com.solirius.training.design_patterns.creational.abstractfactory;

import com.solirius.training.design_patterns.creational.factory.Americano;
import com.solirius.training.design_patterns.creational.factory.CoffeeDrink;
import com.solirius.training.design_patterns.creational.factory.Latte;

public class AmericanoFactory implements CoffeeDrinkAbstractFactory {

    private int size;
    private String options;

    public AmericanoFactory(int size, String options){
        this.size=size;
        this.options=options;
    }

    public AmericanoFactory(int size){
        this.size=size;
    }

    @Override
    public CoffeeDrink createCoffeeDrink() {
        return new Americano(size,options);
    }
}
