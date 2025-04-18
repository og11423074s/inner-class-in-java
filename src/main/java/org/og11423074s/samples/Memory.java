package org.og11423074s.samples;

public class Memory {
    private String brand;
    private int speed;

    public Memory(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
