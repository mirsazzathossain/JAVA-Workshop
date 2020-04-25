package dimension.one;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.Random rd = new java.util.Random();

        System.out.print("Inter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = rd.nextInt(400);
            //System.out.print(arr[i]+" ");
        }

        System.out.print("Array with "+n+" random elements:");
        for (int x:arr) {
            System.out.print(" "+x);
        }

    }
}
