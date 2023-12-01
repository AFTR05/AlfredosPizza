package org.example.service.imp;

import lombok.Getter;
import org.example.domain.entities.Client;
import org.example.domain.entities.Order;
import org.example.domain.entities.OrderQueue;
import org.example.domain.entities.PizzaTree;
import org.example.infrastructure.controllers.ModelFactoryController;
import org.example.infrastructure.utils.CreatorDefaultObject;
import org.example.infrastructure.utils.OrderToQueue;
import org.example.service.OrderService;

import java.util.Set;
@Getter
public class OrderServiceImp implements OrderService {
    private final PizzaShop pizzaShop;

    public OrderServiceImp() {
        this.pizzaShop = ModelFactoryController.getInstance().getPizzaShop();
    }

    private OrderQueue orderQueue;

    public OrderQueue generateRandomOrderQueue(Set<Client> clients, Set<PizzaTree> pizzas){
        return OrderToQueue.createOrderQueue(CreatorDefaultObject.createOrders(clients,pizzas));
    }

    public void generateOrders(Set<Client> clients, Set<PizzaTree> pizzas){
        orderQueue=generateRandomOrderQueue(clients, pizzas);
    }

}
