package computer.components;

public class Desktop extends Computer {
    String monitor, motherBoard;

    public Desktop(){
        // Calling constructor of super class
        super();
        monitor = "TBA";
        motherBoard = "TBA";
    }

    public Desktop(String processorName, int ramSize, int hdSize, String monitor, String motherBoard) {
        super(processorName, ramSize, hdSize);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void display() {
        System.out.println("Processor name: "+processorName+"\nRam size: "+ramSize+"\nHard disk size: "+hdSize);
        System.out.println("Monitor brand: "+monitor+"\nMother board brand: "+motherBoard);
    }
}
