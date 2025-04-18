package org.og11423074s.samples;

public class Display {
    private String brand;
    private int size;

    public Display(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Display{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
