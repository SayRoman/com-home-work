package Pr2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Понять почему на консоль запрашивает повторный ввод размера массива, если снять комментарии?
        Task4 obj = new Task4();
        System.out.print("Укажите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //obj.arrayLenght();
        int[] array = new int[/*obj.arrayLenght*/num];
        obj.randomArithmetic(array);
        System.out.println(obj.randomArithmetic(array));
    }

    /*static int arrayLenght() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }*/

    public int randomArithmetic(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 1000);
            if (array[i] == 0) {
                break;
            }
            sum += array[i];
        }
        int randomArithmetic = sum / array.length;
        return randomArithmetic;
    }
}


