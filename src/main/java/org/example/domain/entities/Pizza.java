package org.example.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
    private String name;
    private Double price;
    private String doughName;
    private String sauceName;
    private String cheeseName;
    private Set<String> toppings;
}
