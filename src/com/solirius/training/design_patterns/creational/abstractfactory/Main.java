package com.solirius.training.design_patterns.creational.abstractfactory;

import com.solirius.training.design_patterns.creational.factory.CoffeeDrink;

public class Main {

    public static void main (String args[]){
        testAbstractFactory();
    }

    private static void testAbstractFactory() {

        CoffeeDrink drink1 = CoffeeDrinkFactory.getCoffee(new LatteFactory(1,"whisper of nutmeg"));
        CoffeeDrink drink2 = CoffeeDrinkFactory.getCoffee(new LatteFactory(2,"skinny milk"));
        CoffeeDrink drink3 = CoffeeDrinkFactory.getCoffee(new LatteFactory(1,"soya"));
        CoffeeDrink drink4 = CoffeeDrinkFactory.getCoffee(new AmericanoFactory(2));
        CoffeeDrink drink5 = CoffeeDrinkFactory.getCoffee(new AmericanoFactory(1, "space for milk"));

        System.out.println(drink1);
        System.out.println(drink2);
        System.out.println(drink3);
        System.out.println(drink4);
        System.out.println(drink5);

    }


}
