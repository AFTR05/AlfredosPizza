package org.example.domain.nodes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaNode {
    private String data;
    private PizzaNode subleft, subright;
    public PizzaNode(String data) {
        this.data = data;
        this.subleft = null;
        this.subright = null;
    }

    public void addChild(PizzaNode child) {
        // Agregar hijo a este nodo
        if (subleft == null) {
            subleft = child;
        } else {
            subright = child;
        }
    }

    public PizzaNode() {
    }
}
