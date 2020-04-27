package computer.driver;

import computer.components.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Computer c = new Computer();
        // Computer c = new Computer("Msi", 4, 3.3f, "SSD", 6509.4f);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter computer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ram size: ");
        int ram = scanner.nextInt();
        System.out.print("Enter processor speed: ");
        float speed = scanner.nextFloat();

        Computer c = new Computer(name, ram, speed);

        c.display();
    }
}
