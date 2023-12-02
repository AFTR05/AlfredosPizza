package org.example;

import org.example.domain.entities.PizzaTree;
import org.example.infrastructure.controllers.ModelFactoryController;
import org.example.infrastructure.utils.AnimationGenerator;
import org.example.infrastructure.utils.BinaryTreeReadings;
import org.example.infrastructure.utils.CreatorDefaultObject;
import org.example.service.imp.ClientServiceImp;
import org.example.service.imp.OrderServiceImp;
import org.example.service.imp.PizzaServiceImp;

import javax.swing.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ModelFactoryController mfc=ModelFactoryController.getInstance();
        mfc.generateClients();
        mfc.generatePizzas();
        mfc.generateOrders();
        Integer opc=0;
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("1.Mostrar menu de pizzas\n2.Mostrar ordenes\n3. Atender pedidos\n4.Salir" +
                    "\nDigite la opción"));
            switch (opc) {
                case 1 -> mfc.printPizzas();
                case 2 -> mfc.printOrders();
                case 3 -> mfc.attendOrders();
            }
        }
        while (opc!=4);
    }
}