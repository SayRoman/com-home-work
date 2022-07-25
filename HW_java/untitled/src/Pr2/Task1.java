package Pr2;

import java.util.Scanner;

public class Task1 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Task1 obj = new Task1();
        obj.storage();
        System.out.println(obj.storage());
    }

    private int storage() {
        System.out.print("Введите слово: ");
        String s = sc.next();
        return s.length() * 2;
    }
}
