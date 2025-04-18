package org.og11423074s.samples;

public class Computer {

    private Display display;
    private Memory memory;
    private CPU cpu;

    public Computer(Display display, Memory memory) {
        this.display = display;
        this.memory = memory;
        cpu = new CPU("Inkel", 1200);
    }

    public CPU getCpu() {
        return cpu;
    }

    public CPU createCPU() {
        return new CPU("moto", 800);
    }

    public void printComputerDetails() {
        System.out.println(display);
        System.out.println(memory);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "display=" + display +
                ", memory=" + memory +
                ", cpu=" + cpu +
                '}';
    }

    public class CPU {
        private String brand;
        private int speed;

        public CPU(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        public void printDetails() {
//            System.out.println(display);
//            System.out.println(memory);
            printComputerDetails();
        }
    }

}
