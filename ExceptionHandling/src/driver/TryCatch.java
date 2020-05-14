package driver;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter dividend: ");
            a = scanner.nextInt();
            System.out.print("Enter divisor: ");
            b = scanner.nextInt();
            System.out.println("Quotient is: ");
            System.out.println(a/b);
            int[] arr = {0, 1, 2, 3};

            for (int i = 0; i < 5; i++) {
                if(arr[i] == 0) System.out.print("Ready ");
                else if(arr[i] == 4) System.out.print("You are out!");
                else System.out.print(i+" ");
            }
        }
        catch (InputMismatchException exception){
            System.out.println(exception);
        }
        catch (ArithmeticException exception){
            System.out.println(exception);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (Exception exception){
            System.out.println(exception);
        }
        finally {
            System.out.print("You are out!");
        }


    }
}
