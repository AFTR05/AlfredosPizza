package org.example.service;

import org.example.domain.entities.PizzaTree;

import java.util.Set;

public interface PizzaService {
    void preparePizza(PizzaTree pizza);
    void prepareCompletePizzaOrder(Set<PizzaTree> pizzas);
    Set<PizzaTree> generatePizzaTrees();
    void generatePizzas();
}
