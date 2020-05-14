package computer.driver;

import computer.components.HardDisk;

public class Main {

    public static void main(String[] args) {
        HardDisk hardDisk = new HardDisk();
        hardDisk.setType("SSD");
        hardDisk.setPrice(5000);

        System.out.println("Hard disk type: "+hardDisk.getType());
        System.out.println("Hard disk price: "+hardDisk.getPrice());
    }
}
