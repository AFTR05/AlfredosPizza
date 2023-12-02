package org.example.infrastructure.controllers;

import lombok.Getter;
import org.example.domain.entities.PizzaTree;
import org.example.domain.nodes.PizzaNode;
import org.example.infrastructure.utils.BinaryTreeReadings;
import org.example.service.PizzaService;
import org.example.service.imp.PizzaShop;

public class ModelFactoryController {
    private PizzaShop pizzaShop;
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }
    public ModelFactoryController() {
        pizzaShop = new PizzaShop();
    }

    public void generateClients(){
        pizzaShop.getClientService().generateClients();
    }

    public void generateOrders(){
        pizzaShop.getOrderService().generateOrders();
    }

    public void attendOrders(){
        pizzaShop.getOrderService().attendOrders();
    }

    public void generatePizzas(){
        pizzaShop.getPizzaService().generatePizzas();
    }

    public void printPizzas(){
        pizzaShop.getPizzaService().printPizzas();
    }

    public void printOrders(){
        pizzaShop.getOrderService().printOrders();
    }

}
