package driver;

import java.io.IOException;

public class Driver {
    public static void main(String[] args) {
        try {
            Throws.writeToFile();
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
}
