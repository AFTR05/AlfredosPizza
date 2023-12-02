package org.example.infrastructure.utils;

import org.example.domain.nodes.PizzaNode;

public class BinaryTreeReadings {
    public static String printTree(PizzaNode pizza, String prefix, boolean isLeft) {
        StringBuilder treeStringBuilder = new StringBuilder();
        if (pizza != null) {
            treeStringBuilder.append(prefix).append(isLeft ? "├── " : "└── ").append(pizza.getData()).append("\n");
            treeStringBuilder.append(printTree(pizza.getSubleft(), prefix + (isLeft ? "│   " : "    "), true));
            treeStringBuilder.append(printTree(pizza.getSubright(), prefix + (isLeft ? "│   " : "    "), false));
        }
        return treeStringBuilder.toString();
    }
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
