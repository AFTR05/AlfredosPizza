package org.example.service.imp;

import lombok.Getter;
import org.example.domain.entities.Client;
import org.example.domain.entities.Order;
import org.example.domain.entities.OrderQueue;
import org.example.domain.entities.PizzaTree;
import org.example.domain.nodes.OrderNode;
import org.example.infrastructure.controllers.ModelFactoryController;
import org.example.infrastructure.utils.CreatorDefaultObject;
import org.example.infrastructure.utils.OrderToQueue;
import org.example.service.OrderService;

import java.util.Set;
@Getter
public class OrderServiceImp implements OrderService {
    private final PizzaShop pizzaShop;

    public OrderServiceImp(PizzaShop pizzaShop) {
        this.pizzaShop = pizzaShop;
    }

    private OrderQueue orderQueue;

    public OrderQueue generateRandomOrderQueue(){
        return OrderToQueue.createOrderQueue(CreatorDefaultObject.createOrders(pizzaShop.getClientService().getClients()
                ,pizzaShop.getPizzaService().getPizzaTrees()));
    }

    public void generateOrders(){
        orderQueue=generateRandomOrderQueue();
    }

    public void attendOrders() {
        System.out.println("En el dia de hoy hay: "+ orderQueue.amountQueue() + " Pedidos de pizza");
        OrderNode order = orderQueue.getCab();
        while (order != null) {
            System.out.println("------------------------------------- Pedido de: "+order.getOrder().getClient().getName()+"-------------------------------------");
            pizzaShop.getPizzaService().prepareCompletePizzaOrder(order.getOrder().getPizzas());
            pizzaShop.getClientService().receiveAndPayOrder(order.getOrder());
            order=order.getNext();
        }
    }

    public void printOrders(){
        orderQueue.printQueue();
    }


}
