package com.solirius.training.design_patterns.creational.factory;

public class CoffeeDrinkFactory {

    public static CoffeeDrink getCoffee(String type){
        switch (type){
            case "Latte":
                return new Latte();
            case "Americano":
                return new Americano();
            case "Espresso":
                return new Espresso();
        }
        return null;
    }

}
