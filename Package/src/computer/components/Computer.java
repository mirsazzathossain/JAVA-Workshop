package computer.components;

import java.util.Scanner;

public class Computer {
    String brand;
    int ram;
    float speed;
    HardDisk hd;

    // public because we will call this from outside of this package
    public Computer(){
        brand = "TBA";
        ram = 0;
        speed = (float) 0.0;
        hd = new HardDisk();
    }

    public Computer(String brand, int ram, float speed, String type, float price) {
        this.brand = brand;
        this.ram = ram;
        this.speed = speed;
        hd = new HardDisk(type, price);
    }

    public Computer(String brand, int ram, float speed) {
        Scanner scanner = new Scanner(System.in);
        this.brand = brand;
        this.ram = ram;
        this.speed = speed;
        hd = new HardDisk();
        System.out.print("Enter hard disk type: ");
        String type = scanner.next();
        System.out.print("Enter hard disk price: ");
        float price = scanner.nextFloat();
        hd.setType(type);
        hd.setPrice(price);
    }

    public void display(){
        System.out.println("Brand: "+brand+"\nRam: "+ram+"\nSpeed: "+speed+"\nHard Disk Type: "+hd.getType()+"\nHard Disk Price: "+hd.getPrice());
    }


}
