package computer.components;

public class Computer {
    // Can't access from outside class
    // private String processorName;
    // private int ramSize, hdSize;

    // Can access if any subclass extends this class
    protected String processorName;
    protected int ramSize, hdSize;

    Computer() {
        processorName = "TBA";
        ramSize = 0;
        hdSize = 0;
    }

    Computer(String processorName, int ramSize, int hdSize) {
        this.processorName = processorName;
        this.ramSize = ramSize;
        this.hdSize = hdSize;
    }
}
