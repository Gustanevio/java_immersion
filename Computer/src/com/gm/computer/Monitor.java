package com.gm.computer;

public class Monitor {
    private final int idMonitor;
    private String brand;
    private double size;
    private static int monitorCounter;

    public Monitor() {
        this.idMonitor = ++Monitor.monitorCounter;
    }

    public Monitor(String brand, double size) {
        this();
        this.brand = brand;
        this.size = size;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", brand=").append(brand);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
