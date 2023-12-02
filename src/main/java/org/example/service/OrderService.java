package org.example.service;

import org.example.domain.entities.Client;
import org.example.domain.entities.OrderQueue;
import org.example.domain.entities.PizzaTree;

import java.util.Set;

public interface OrderService {
    OrderQueue generateRandomOrderQueue();
    void generateOrders();
}
