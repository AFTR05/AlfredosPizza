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

    public Integer amountQueue() {
        Integer count=0;
        mobile = cab;
        while (mobile != null){
            count++;
            mobile=mobile.getNext();
        }
        return count;
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
