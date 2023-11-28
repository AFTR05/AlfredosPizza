package org.example.infrastructure.utils;

import org.example.domain.entities.Order;
import org.example.domain.entities.OrderQueue;

import java.util.ArrayList;

public class OrderToQueue {
    public static OrderQueue createOrderQueue(ArrayList<Order> orders){
        OrderQueue queue = new OrderQueue();
        queue.beginQueue();
        for (Order order : orders){
            queue.insertNodeQueue(order);
        }
        return queue;
    }
}
