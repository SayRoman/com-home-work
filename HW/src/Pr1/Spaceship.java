package Pr1;

import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        name();
        age();
    }
    static void name() {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String fisrtName = s.next();
        System.out.print("Ваше имя: " + fisrtName + "!\n");
    }
    static void age (){
        Scanner s = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = s.nextInt();
        System.out.print("Ваш возраст: " + age);
    }
}
