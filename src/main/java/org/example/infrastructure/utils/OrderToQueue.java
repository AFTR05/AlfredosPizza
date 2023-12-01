package org.example.infrastructure.utils;

import org.example.domain.entities.Order;
import org.example.domain.entities.OrderQueue;

import java.util.ArrayList;
import java.util.List;

public class OrderToQueue {
    public static OrderQueue createOrderQueue(List<Order> orders){
        OrderQueue queue = new OrderQueue();
        queue.beginQueue();
        for (Order order : orders){
            queue.insertNodeQueue(order);
        }
        return queue;
    }
}
