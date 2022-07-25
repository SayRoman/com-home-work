package Pr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Задайте дистанцию в километрах: ");
        final double distance = s.nextDouble();
        System.out.print("Задайте время в часах: ");
        final double time = s.nextDouble();
        System.out.println("Ваша скорость cоставляет: " + Math.round(distance / time) + " км/ч.\n" +
            "Погрешность вычислений составляет ~ 1 км/ч.");
    }
}
