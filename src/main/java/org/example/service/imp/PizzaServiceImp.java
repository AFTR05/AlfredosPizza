package org.example.service.imp;

import org.example.domain.entities.Pizza;
import org.example.domain.entities.PizzaTree;
import org.example.domain.nodes.PizzaNode;
import org.example.infrastructure.utils.CreatorDefaultObject;
import org.example.infrastructure.utils.PizzaToBinaryTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PizzaServiceImp {
    private Set<PizzaTree> pizzaTrees;

    public Set<PizzaTree> generatePizzaTrees() {
        Set<Pizza> enumsPizza= CreatorDefaultObject.createPizzas();
        return enumsPizza.stream()
                .map(pi -> new PizzaTree(pi.getPrice(), pi.getName(), PizzaToBinaryTree.buildTree(pi)))
                .collect(Collectors.toSet());
    }
}
