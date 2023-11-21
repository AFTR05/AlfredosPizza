package org.example.infrastructure.utils;

import org.example.domain.entities.Pizza;
import org.example.domain.nodes.PizzaNode;

import java.util.HashSet;
import java.util.Optional;

public class PizzaToBinaryTree {
    public PizzaNode buildTree(Pizza pizza) {
        PizzaNode rootNode = new PizzaNode(pizza.getDoughName());
        PizzaNode sauceNode = new PizzaNode(pizza.getSauceName());
        PizzaNode cheeseNode = new PizzaNode(pizza.getCheeseName());
        rootNode.setSubright(sauceNode);
        rootNode.setSubright(cheeseNode);

        Optional<HashSet<String>> toppingsOptional = Optional.ofNullable(pizza.getToppings());

        toppingsOptional.ifPresent(toppings -> {
            for (String topping : toppings) {
                if (sauceNode.getSubright() != null) {
                    cheeseNode.addChild(new PizzaNode(topping));
                }
                sauceNode.addChild(new PizzaNode(topping));
            }
        });
        return rootNode;
    }
}
