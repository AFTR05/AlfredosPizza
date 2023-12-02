package org.example.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.nodes.OrderNode;

import javax.swing.*;
import java.util.Set;
import java.util.stream.Collectors;

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

    public void printQueue() {
        StringBuilder printer = new StringBuilder();
        mobile = cab;
        while (mobile != null) {
            printer.append("\nOrden: ")
                    .append("- Cliente: ").append(mobile.getOrder().getClient().getName())
                    .append(" - Pizzas: [");
            Set<PizzaTree> pizzas = mobile.getOrder().getPizzas();
            String pizzasInfo = pizzas.stream()
                    .map(pizzaTree -> "Nombre: " + pizzaTree.getName() + ", Precio: " + pizzaTree.getPrice())
                    .collect(Collectors.joining(" || "));
            printer.append(pizzasInfo+" ]");
            mobile = mobile.getNext();
        }
        JOptionPane.showMessageDialog(null, printer);
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
