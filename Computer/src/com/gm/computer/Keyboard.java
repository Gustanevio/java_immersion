package com.gm.computer;

public class Keyboard extends InputDevices{
    private final int idKeyboard;
    private static int keyboardCounter;

    public Keyboard(String type, String brand) {
        super(type, brand);
        this.idKeyboard = ++Keyboard.keyboardCounter;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "idKeyboard=" + idKeyboard + ", " + super.toString() +'}';
    }


    
    
    
}
