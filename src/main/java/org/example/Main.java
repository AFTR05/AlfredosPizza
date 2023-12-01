package org.example;

import org.example.domain.entities.PizzaTree;
import org.example.infrastructure.utils.AnimationGenerator;
import org.example.infrastructure.utils.CreatorDefaultObject;
import org.example.service.imp.ClientServiceImp;
import org.example.service.imp.OrderServiceImp;
import org.example.service.imp.PizzaServiceImp;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ClientServiceImp imp = new ClientServiceImp();
        PizzaServiceImp pi = new PizzaServiceImp();
        OrderServiceImp order = new OrderServiceImp();
        PizzaTree example=pi.generatePizzaTrees().stream().toList().get(0);
        AnimationGenerator.preparePizza(example);
    }
}