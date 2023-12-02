package org.example.service.imp;

import lombok.Getter;
import org.example.domain.entities.Pizza;
import org.example.domain.entities.PizzaTree;
import org.example.domain.nodes.PizzaNode;
import org.example.infrastructure.controllers.ModelFactoryController;
import org.example.infrastructure.utils.AnimationGenerator;
import org.example.infrastructure.utils.CreatorDefaultObject;
import org.example.infrastructure.utils.PizzaToBinaryTree;
import org.example.service.PizzaService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
@Getter
public class PizzaServiceImp implements PizzaService {
    private final PizzaShop pizzaShop;

    public PizzaServiceImp(PizzaShop pizzaShop) {
        this.pizzaShop = pizzaShop;
    }

    private Set<PizzaTree> pizzaTrees;

    public void preparePizza(PizzaTree pizza) {
        AnimationGenerator.preparePizza(pizza);
    }

    public void prepareCompletePizzaOrder(Set<PizzaTree> pizzas){
        pizzas.forEach(this::preparePizza);
    }

    public Set<PizzaTree> generatePizzaTrees() {
        Set<Pizza> enumsPizza= CreatorDefaultObject.createPizzas();
        return enumsPizza.stream()
                .map(pi -> new PizzaTree(pi.getPrice(), pi.getName(), PizzaToBinaryTree.buildTree(pi)))
                .collect(Collectors.toSet());
    }

    public void generatePizzas(){
        pizzaTrees=generatePizzaTrees();
    }
}
