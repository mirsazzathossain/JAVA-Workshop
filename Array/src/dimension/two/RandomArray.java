package dimension.two;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Enter number of row: ");
        int row = sc.nextInt();
        int[][] arr = new int[row][];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number of column for row "+i+" : ");
            int col = sc.nextInt();
            arr[i] = new int[col];

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rd.nextInt(50);
            }
        }

        System.out.println("2D Array is:");
        for (int[] first:arr) {
            for (int element:first) {
                System.out.print(element+" ");
            }
            System.out.println("");
        }

    }
}
