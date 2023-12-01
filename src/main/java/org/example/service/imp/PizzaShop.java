package org.example.service.imp;

import lombok.Getter;
import org.example.service.ClientService;
import org.example.service.OrderService;
import org.example.service.PizzaService;
@Getter
public class PizzaShop {
    private final ClientService clientService;
    private final OrderService orderService;
    private final PizzaService pizzaService;

    public PizzaShop() {
        this.clientService = new ClientServiceImp();
        this.orderService = new OrderServiceImp();
        this.pizzaService = new PizzaServiceImp();
    }


}
