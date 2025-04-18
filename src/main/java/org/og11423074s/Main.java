package org.og11423074s;

import org.og11423074s.samples.Computer;
import org.og11423074s.samples.Display;
import org.og11423074s.samples.Memory;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Computer comp1 = new Computer(
                new Display("lg", 1200),
                new Memory("moto", 800)
        );

        Computer comp2 = new Computer(
                new Display("mag", 900),
                new Memory("king", 1000)
        );

        Computer.CPU gogo = comp2.new CPU("gogo", 800);

        Computer.CPU cpu2 = comp2.getCpu();
        cpu2.printDetails();

        Computer.CPU cpu1 = comp1.getCpu();
        cpu1.printDetails();




    }

}