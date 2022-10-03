package HW3_1;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        /* Даны два числа x и y.
        Программа должна вывести в консоль YES, – если оба числа четные,
        либо оба числа нечетные; иначе программа ничего не выводит.

        */

        // Уточнить у преподавателя, стоит ли писать код для преобразования вещественного
        // числа в натрульное?

        Scanner s = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Enter x: ");
        x= s.nextInt();
        System.out.print("Enter y: ");
        y= s.nextInt();

         if (x % 2 == 0 && y % 2 == 0 ){
            System.out.print("Yes");
        } else if (x % 2 != 0 && y % 2 != 0 ) {
            System.out.print("Yes");
        } else {
            System.out.println("");}
    }
}
