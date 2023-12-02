package org.example.infrastructure.utils;

import org.example.domain.entities.Order;
import org.example.domain.entities.PizzaTree;

public class AnimationGenerator {

    public static void preparePizza(PizzaTree pizzaTree) {
        System.out.println("Preparando pizza de "+pizzaTree.getName());

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
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
        }
        System.out.println("\n¡La pizza está lista!\n\n");
    }

    public static void payAndReceive(Order order){
        System.out.println("Entregando y recibiendo pado de pedido de: "+order.getClient().getName());
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
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
        }
        System.out.println("\nEl cliente "+ order.getClient().getName() +" ha pagado y recibido el pedido "+"fue un total de: "+
                PizzaUtils.getTotalValue(order.getPizzas())+"\n--------------------------------------------------------------------------------------------------");
    }
}



