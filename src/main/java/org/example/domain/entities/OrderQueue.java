package org.example.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.nodes.OrderNode;

import javax.swing.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderQueue {
    private OrderNode cab;
    private OrderNode mobile;
    private OrderNode end;

    public void beginQueue() {
        cab = null;
    }

    public void insertNodeQueue(Order order) {
        OrderNode newNode = new OrderNode(order);
        if (cab == null) {
            newNode.setNext(cab);
            cab = newNode;
            end = cab;
        } else {
            end.setNext(newNode);
            newNode.setNext(null);
            end = newNode;
        }
    }

    public void deleteNodeQueue(){
        OrderNode delete;
        if (cab == null) {
            JOptionPane.showMessageDialog(null, "Se ha terminado de atender los pedidos");
            return;
        }
        delete = cab;
        cab = delete.getNext();
        delete = null;
    }

    public String printQueue() {
        StringBuilder message= new StringBuilder("Ordenes\n\n");
        mobile = cab;
        while (mobile != null){
            message.append("Cliente: ").append(mobile.getOrder().getClient().getName()).append("-Pizzas ").append(mobile.getOrder().getPizzas());
            mobile=mobile.getNext();
        }
        return message.toString();
    }

    public void destroyQueue() {
        OrderNode delete;
        delete = cab;
        mobile = cab;
        while (mobile != null) {
            mobile = mobile.getNext();
            delete = null;
            delete = mobile;
        }
    }
}
