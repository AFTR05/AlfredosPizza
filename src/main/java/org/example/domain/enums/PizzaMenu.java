package org.example.domain.enums;

import lombok.Getter;
import org.example.domain.entities.Pizza;

import java.util.HashSet;
@Getter
public enum PizzaMenu {
    MARGHERITA("Marguerita",20.0,"Regular", "Tomato", "Mozzarella", new HashSet<>() {{
        add("Basil");
    }}),
    PEPPERONI("Pepperoni",25.0,"Thin", "Marinara", "Cheddar", new HashSet<>() {{
        add("Pepperoni");
    }}),
    VEGGIE("Veggie",30.0,"Whole Wheat", "Pesto", "Feta", new HashSet<>() {{
        add("Mushrooms");
        add("Bell Peppers");
        add("Onions");
        add("Olives");
    }}),
    BBQ_CHICKEN("BBQ Chicken",26.0,"Hand Tossed", "BBQ Sauce", "Monterey Jack", new HashSet<>() {{
        add("Grilled Chicken");
        add("Red Onions");
        add("Cilantro");
    }}),
    HAWAIIAN("Hawaiian",20.0,"Thin", "Tomato", "Swiss", new HashSet<>() {{
        add("Ham");
        add("Pineapple");
    }}),
    MEAT_LOVERS("Meat Lovers",20.0,"Regular", "Marinara", "Mozzarella", new HashSet<>() {{
        add("Pepperoni");
        add("Sausage");
        add("Bacon");
        add("Ground Beef");
    }});

    // Atributos asociados con cada tipo de pizza
    private final String name;
    private final Double price;
    private final String doughName;
    private final String sauceName;
    private final String cheeseName;
    private final HashSet<String> toppings;

    // Constructor del enum


    PizzaMenu(String name, Double price, String doughName, String sauceName, String cheeseName, HashSet<String> toppings) {
        this.name = name;
        this.price = price;
        this.doughName = doughName;
        this.sauceName = sauceName;
        this.cheeseName = cheeseName;
        this.toppings = toppings;
    }

    // Método para crear un objeto Pizza asociado con el tipo de pizza
    public Pizza createPizza() {
        return new Pizza(name,price,doughName, sauceName, cheeseName, toppings);
    }

}
