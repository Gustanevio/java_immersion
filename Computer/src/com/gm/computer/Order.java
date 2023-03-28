package com.gm.computer;

public class Order {

    private final int idOrder;
    private static int orderCounter;
    private Computer computers[];
    private static final int MAX_COMPUETERS = 10;
    private int computerCounter;

    public Order() {
        this.idOrder = ++Order.orderCounter;
        this.computers = new Computer[Order.MAX_COMPUETERS];
    }

    public void addComputer(Computer computer) {
        if (this.computerCounter < Order.MAX_COMPUETERS) {
            this.computers[this.computerCounter++] = computer;
        } else {
            System.out.println("Max limit foir per order is: " + Order.MAX_COMPUETERS);
        }
    }

    public void showOrder() {
        System.out.println("Order ID: " + this.idOrder);
        for (int i = 0; i < this.computerCounter; i++) {
            System.out.println(this.computers[i]);
        }
    }

}
