package org.example.infrastructure.utils;

import org.example.domain.entities.PizzaTree;

public class AnimationGenerator {

    public static Boolean preparePizza(PizzaTree pizzaTree) {
        System.out.println("Preparando pizza "+pizzaTree.getName());

        for (int i = 1; i <= 10; i++) {
            System.out.print("[");
            for (int j = 1; j <= i; j++) {
                System.out.print("=");
            }
            for (int k = i; k < 10; k++) {
                System.out.print(" ");
            }
            System.out.print("] " + (i * 10) + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
        }
        System.out.println("\n¡La pizza está lista!");
        return true;
    }
}



