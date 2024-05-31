package gr.aueb.ch12;

import gr.aueb.cf.ch12.model.Order;

public class MainOrder {

    public static void main(String[] args) {
        Order newOreder = new Order(1, 22.5, "Pizza", 4);

        System.out.println("Description: " + newOreder.getDescription());
        System.out.println();
    }
}
