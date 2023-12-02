package org.example.infrastructure.utils;

import org.example.domain.entities.Client;
import org.example.domain.entities.Order;
import org.example.domain.entities.Pizza;
import org.example.domain.entities.PizzaTree;
import org.example.domain.enums.DefaultClient;
import org.example.domain.enums.PizzaMenu;

import java.util.*;

public class CreatorDefaultObject {
    public static Set<Client> createClients(){
        Set<Client> clients = new HashSet<>();
        clients.add(DefaultClient.CLIENT_1.createClient());
        clients.add(DefaultClient.CLIENT_2.createClient());
        clients.add(DefaultClient.CLIENT_3.createClient());
        clients.add(DefaultClient.CLIENT_4.createClient());
        clients.add(DefaultClient.CLIENT_5.createClient());
        clients.add(DefaultClient.CLIENT_6.createClient());
        clients.add(DefaultClient.CLIENT_7.createClient());
        clients.add(DefaultClient.CLIENT_8.createClient());
        clients.add(DefaultClient.CLIENT_9.createClient());
        clients.add(DefaultClient.CLIENT_10.createClient());
        return clients;
    }

    public static Set<Pizza> createPizzas(){
        Set<Pizza> pizzas = new HashSet<>();
        pizzas.add(PizzaMenu.MARGHERITA.createPizza()); 
        pizzas.add(PizzaMenu.VEGGIE.createPizza());
        pizzas.add(PizzaMenu.HAWAIIAN.createPizza());
        pizzas.add(PizzaMenu.MEAT_LOVERS.createPizza());
        pizzas.add(PizzaMenu.PEPPERONI.createPizza());
        pizzas.add(PizzaMenu.BBQ_CHICKEN.createPizza());
        return pizzas;
    }

    public static List<Order> createOrders(Set<Client> clients, Set<PizzaTree> pizzas){
        ArrayList<Order> orders = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Order order = new Order();
            HashSet<PizzaTree> pizzasClient = new HashSet<>();
            Client[] clientesArray = clients.toArray(new Client[0]);
            order.setClient(clientesArray[new Random().nextInt(clientesArray.length)]);
            int cantidadPizzas = Math.max(1, new Random().nextInt(pizzas.size()));

            PizzaTree[] pizzasArray = pizzas.toArray(new PizzaTree[0]);
            for (int j = 0; j < cantidadPizzas; j++) {
                PizzaTree pizza = pizzasArray[new Random().nextInt(pizzasArray.length)];
                pizzasClient.add(pizza);
            }
            order.setPizzas(pizzasClient);
            orders.add(order);
        }
        return orders;
    }

}
