package org.example.infrastructure.utils;

import org.example.domain.entities.Pizza;
import org.example.domain.nodes.PizzaNode;

import java.util.HashSet;
import java.util.Optional;

public class PizzaToBinaryTree {
    public static PizzaNode buildTree(Pizza pizza) {
        PizzaNode rootNode = new PizzaNode(pizza.getDoughName());
        PizzaNode sauceNode = new PizzaNode(pizza.getSauceName());
        PizzaNode cheeseNode = new PizzaNode(pizza.getCheeseName());
        rootNode.setSubleft(sauceNode);
        rootNode.setSubright(cheeseNode);
        Optional.ofNullable(pizza.getToppings())
                .ifPresent(toppings -> {
                    for (String topping : toppings) {
                        if (sauceNode.getSubright() != null) {
                            cheeseNode.addChild(new PizzaNode(topping));
                        }else {
                            sauceNode.addChild(new PizzaNode(topping));
                        }
                    }
                });
        return rootNode;
    }
}
