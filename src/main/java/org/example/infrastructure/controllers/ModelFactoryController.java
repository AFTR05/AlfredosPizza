package org.example.infrastructure.controllers;

import org.example.service.imp.PizzaShop;

public class ModelFactoryController {
    private PizzaShop pizzaShop;
    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public PizzaShop getPizzaShop() {
        return pizzaShop;
    }

    public void setPizzaShop(PizzaShop pizzaShop) {
        this.pizzaShop = pizzaShop;
    }

    public ModelFactoryController() {
        pizzaShop = new PizzaShop();
    }

}
