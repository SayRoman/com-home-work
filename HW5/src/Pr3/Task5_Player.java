package Pr3;

import java.util.Scanner;

public class Task5_Player {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] array = new char[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '*';
                array[0][0] = '@';
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Куда хотите пойти? U (вверх), D (вниз), L (Влево), R (Вправо): ");
        String ans = sc.next();
        switch (ans) {
            case "D":
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = '*';
                        array[1][0] = '@';
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.print("Куда хотите пойти? Вв (вверх), Вн (вниз), Вл (Влево), Вп (Вправо): ");
                String ans1 = sc.next();
//                System.out.print("Продолжаем ");
            case "Dd":
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = '*';
                        array[2][0] = '@';
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.print("Куда хотите пойти? Вв (вверх), Вн (вниз), Вл (Влево), Вп (Вправо): ");
                String ans2 = sc.next();
                break;
            case "N":
                System.out.print("Стопарики");
                break;
            default:
                System.out.print("Что-то пошло не так");
        }
    }
}
