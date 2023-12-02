package org.example.service;

import org.example.domain.entities.Client;
import org.example.domain.entities.Order;
import org.example.service.imp.PizzaShop;

import java.util.Set;

public interface ClientService {
    Set<Client> generateEnumsClients();
    void generateClients();
    void receiveAndPayOrder(Order order);
}
