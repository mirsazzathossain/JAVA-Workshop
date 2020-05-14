package computer.driver;

import computer.components.Desktop;

public class Main {

    public static void main(String[] args) {
        Desktop desktop = new Desktop("Intel", 8, 500, "hp", "Msi");
        desktop.display();
    }
}
