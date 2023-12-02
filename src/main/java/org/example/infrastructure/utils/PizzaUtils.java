package org.example.infrastructure.utils;

import org.example.domain.entities.PizzaTree;

import java.util.Set;

public class PizzaUtils {
    public static Double getTotalValue(Set<PizzaTree> pizzas){
        return pizzas.stream().mapToDouble(PizzaTree::getPrice).sum();
    }

    public static String printPizza(PizzaTree pizzaTree){
        String message="Pizza: "+pizzaTree.getName()+"\n";
        message+=BinaryTreeReadings.printTree(pizzaTree.getTree(),"", true);
        return message;
    }
}
