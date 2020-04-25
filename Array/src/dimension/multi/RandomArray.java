package dimension.multi;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of dimension: ");
        int dimension = scanner.nextInt();

        int[][][] arr = new int[dimension][][];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number of row in dimension "+(i+1)+" : ");
            int row = scanner.nextInt();
            arr[i] = new int[row][];

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter number of col in dimension "+(i+1)+" row "+j+" : ");
                int col = scanner.nextInt();
                arr[i][j] = new int[col];

                for (int k = 0; k < arr[i][j].length; k++) {
                    // Between 25 and 30
                    arr[i][j][k] = random.nextInt(5)+25;
                }
            }
        }

        System.out.println(dimension+"D array is:");
        for (int[][] temp:arr ) {
            for (int[] first:temp) {
                for (int element:first) {
                    System.out.print(element+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
