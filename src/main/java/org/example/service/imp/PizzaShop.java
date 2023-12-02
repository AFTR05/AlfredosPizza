package org.example.service.imp;

import lombok.Getter;
import org.example.service.ClientService;
import org.example.service.OrderService;
import org.example.service.PizzaService;
@Getter
public class PizzaShop {
    private final ClientServiceImp clientService;
    private final OrderServiceImp orderService;
    private final PizzaServiceImp pizzaService;

    public PizzaShop() {
        this.clientService = new ClientServiceImp(this);
        this.orderService = new OrderServiceImp(this);
        this.pizzaService = new PizzaServiceImp(this);
    }


}
