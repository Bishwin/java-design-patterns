package com.solirius.training.design_patterns.creational.factory;

public class CoffeeDrinkFactory {

    public static CoffeeDrink getCoffee(String type, int size, String options){
        switch (type){
            case "Latte":
                return new Latte(size, options);
            case "Americano":
                return new Americano(size, options);
            case "Espresso":
                return new Espresso(size, options);
        }
        return null;
    }

    public static CoffeeDrink getCoffee(String type, int size){
        switch (type){
            case "Latte":
                return new Latte(size);
            case "Americano":
                return new Americano(size);
            case "Espresso":
                return new Espresso(size);
        }
        return null;
    }

}
