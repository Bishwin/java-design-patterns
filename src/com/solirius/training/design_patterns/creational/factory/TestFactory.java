package com.solirius.training.design_patterns.creational.factory;

public class TestFactory {

    public static void main(String[] args){
        CoffeeDrink drink1 = CoffeeDrinkFactory.getCoffee("Latte");
        CoffeeDrink drink2 = CoffeeDrinkFactory.getCoffee("Americano");
        CoffeeDrink drink3 = CoffeeDrinkFactory.getCoffee("Espresso");

        System.out.println(drink1);
        System.out.println(drink2);
        System.out.println(drink3);

    }


}
