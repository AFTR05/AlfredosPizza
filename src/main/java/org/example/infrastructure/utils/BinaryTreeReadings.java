package org.example.infrastructure.utils;

import org.example.domain.nodes.PizzaNode;

public class BinaryTreeReadings {
    public static String printPreOrder(PizzaNode rootPizzaNode) {
        String message="";
        if (rootPizzaNode != null) {
            message+=rootPizzaNode.getData();
            printPreOrder(rootPizzaNode.getSubleft());
            printPreOrder(rootPizzaNode.getSubright());
        }
        return message;
    }

    public static String printInOrder(PizzaNode rootPizzaNode) {
        String message="";
        if (rootPizzaNode != null) {
            printInOrder(rootPizzaNode.getSubleft());
            message+=rootPizzaNode.getData();
            message+=rootPizzaNode.getSubright();
        }
        return message;
    }

    public static String printPostOrder(PizzaNode rootPizzaNode) {
        String message="";
        if (rootPizzaNode != null) {
            printPostOrder(rootPizzaNode.getSubleft());
            printPostOrder(rootPizzaNode.getSubright());
            message+=(rootPizzaNode.getData());
        }
        return message;
    }
}
