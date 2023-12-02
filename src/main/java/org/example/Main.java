package org.example;

import org.example.domain.entities.PizzaTree;
import org.example.infrastructure.controllers.ModelFactoryController;
import org.example.infrastructure.utils.AnimationGenerator;
import org.example.infrastructure.utils.CreatorDefaultObject;
import org.example.service.imp.ClientServiceImp;
import org.example.service.imp.OrderServiceImp;
import org.example.service.imp.PizzaServiceImp;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ModelFactoryController mfc=ModelFactoryController.getInstance();
        mfc.generateClients();
        mfc.generatePizzas();
        mfc.generateOrders();
        mfc.attendOrders();
    }
}