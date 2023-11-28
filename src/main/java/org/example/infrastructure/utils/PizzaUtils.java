package org.example.infrastructure.utils;

import org.example.domain.entities.PizzaTree;

import java.util.Set;

public class PizzaUtils {
    public Double getTotalValue(Set<PizzaTree> pizzas){
        return pizzas.stream().mapToDouble(PizzaTree::getPrice).sum();
    }
}
