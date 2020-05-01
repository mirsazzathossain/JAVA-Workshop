package driver;

import java.util.InputMismatchException;
import java.util.Scanner;

public class avoidAllExceptions {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, InputMismatchException, ArithmeticException {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        a = scanner.nextInt();
        System.out.print("Enter divisor: ");
        b = scanner.nextInt();
        System.out.println("Quotient is: ");
        System.out.println(a / b);
        int[] arr = {0, 1, 2, 3};

        for (int i = 0; i < 5; i++) {
            if (arr[i] == 0) System.out.print("Ready ");
            else if (arr[i] == 4) System.out.print("You are out!");
            else System.out.print(i + " ");
        }
    }
}
