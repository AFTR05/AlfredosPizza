package org.example.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.nodes.PizzaNode;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PizzaTree {
    private Double price;
    private String name;
    private PizzaNode tree;
}
