package com.gm.computer;

public class InputDevices {
    protected String type;
    protected String brand;

    public InputDevices() {
    }

    public InputDevices(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InputDevices{");
        sb.append("type=").append(type);
        sb.append(", brand=").append(brand);
        sb.append('}');
        return sb.toString();
    }
    
    
}
