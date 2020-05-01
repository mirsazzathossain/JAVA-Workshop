package driver;

import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        try {
            age = scanner.nextInt();
            if(age < 2 || age > 120){
                throw new AgeRestrictionException("Age must be between 2-120");
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    static class AgeRestrictionException extends Exception{
        public AgeRestrictionException(String message){
            super(message);
        }
    }
}
