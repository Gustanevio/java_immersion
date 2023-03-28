package com.gm.computer;

public class TestComputer {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Keyboard keyboardHP = new Keyboard("Bluetooth", "HP");
        Mouse mouseHP = new Mouse("Bluetooth", "HP");
        Computer computerHP = new Computer("Computer HP", monitorHP, keyboardHP, mouseHP);

        Order order1 = new Order();
        order1.addComputer(computerHP);
        order1.showOrder();
    }
}
