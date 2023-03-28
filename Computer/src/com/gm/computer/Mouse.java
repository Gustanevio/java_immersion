package com.gm.computer;

public class Mouse extends InputDevices {

    private final int idMouse;
    private static int mouseCounter;

    public Mouse(String type, String brand) {
        super(type, brand);
        this.idMouse = ++Mouse.mouseCounter;
    }

    @Override
    public String toString() {
        return "Mouse{" + "idMouse=" + idMouse + " , " + super.toString() + '}';
    }

}
