package org.example.service.imp;

import lombok.Getter;
import lombok.Setter;
import org.example.domain.entities.Client;
import org.example.domain.entities.Order;
import org.example.infrastructure.controllers.ModelFactoryController;
import org.example.infrastructure.utils.AnimationGenerator;
import org.example.infrastructure.utils.CreatorDefaultObject;
import org.example.service.ClientService;

import java.util.HashSet;
import java.util.Set;
@Getter
public class ClientServiceImp implements ClientService {
    private final PizzaShop pizzaShop;

    public ClientServiceImp(PizzaShop pizzaShop) {
        this.pizzaShop = pizzaShop;
    }

    private Set<Client> clients;
     public Set<Client> generateEnumsClients(){
         return CreatorDefaultObject.createClients();
     }

     public void generateClients(){
         clients=generateEnumsClients();
     }

     public void receiveAndPayOrder(Order order){
         AnimationGenerator.payAndReceive(order);
     }
}
