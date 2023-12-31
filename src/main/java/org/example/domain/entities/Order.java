package org.example.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Set<PizzaTree> pizzas;
    private Client client;


}
