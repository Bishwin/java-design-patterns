package com.solirius.training.design_patterns.creational.factory;

public class Main {

    public static void main(String[] args){
        CoffeeDrink drink1 = CoffeeDrinkFactory.getCoffee("Latte",1, "chocolate on top");
        CoffeeDrink drink2 = CoffeeDrinkFactory.getCoffee("Americano",2);
        CoffeeDrink drink3 = CoffeeDrinkFactory.getCoffee("Espresso", 1);

        System.out.println(drink1);
        System.out.println(drink2);
        System.out.println(drink3);

    }


}
