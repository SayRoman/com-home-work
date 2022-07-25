package Pr2;

import java.util.Scanner;

public class CoinFlipping {

    static int randome() {
        int n = 1;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 2);
            n = array[i];
        }
        return n;
    }

    public static void main(String[] args) {
        CoinFlipping obj = new CoinFlipping();
        randome();
        Scanner s = new Scanner(System.in);
        System.out.print("Орёл или решка?\n");
        //System.out.println(randome());

        if (randome() == 0) {
            System.out.print("Орёл");
        } else {
            System.out.print("Решка");

        }
    }
}
