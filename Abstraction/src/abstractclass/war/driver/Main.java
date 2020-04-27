package abstractclass.war.driver;

import abstractclass.war.weapons.Bomb;
import abstractclass.war.weapons.Sword;
import abstractclass.war.weapons.Weapon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many weapons to collect: ");
        int n = scanner.nextInt();
        ArrayList<Weapon>arr = new ArrayList<Weapon>();

        for (int i = 0; i < n; i++) {
            int distance = random.nextInt(50);
            if(distance<10) arr.add(new Sword());
            else arr.add(new Bomb());
        }

        for (Weapon w:arr) w.action();
    }
}
