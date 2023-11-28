package org.example.domain.nodes;

import lombok.Getter;
import lombok.Setter;
import org.example.domain.entities.Order;
@Getter
@Setter
public class OrderNode {
    Order order;
    OrderNode next;
    public OrderNode(Order order) {
        this.order = order;
        this.next = null;
    }
    public OrderNode(){}
}
