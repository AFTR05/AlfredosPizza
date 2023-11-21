package org.example.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
    String doughName;
    String sauceName;
    String cheeseName;
    HashSet<String> toppings;
}
