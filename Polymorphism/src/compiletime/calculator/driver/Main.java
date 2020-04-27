package compiletime.calculator.driver;

import compiletime.calculator.operations.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.Addition(12, 14));
        System.out.println(Math.Addition(12, 14, 16));
        System.out.println(Math.Addition(12.23, 14.55));
    }
}
