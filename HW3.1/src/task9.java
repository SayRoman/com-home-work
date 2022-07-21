import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        /*
        Даны координаты начала и координаты конца отрезка.
        Если считать отрезок обозначением горки, то в одном случае он обозначает спуск,
        в другом – подъем. Определить и вывести на экран – спуск это или подъем,
        ровная дорога или вообще отвесная.
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Координаты начала отрезка AB");
        System.out.print("Введите значение x1: ");
        int x1 = s.nextInt();
        System.out.print("Введите значение y1: ");
        int y1 = s.nextInt();
        System.out.println("Координаты конца отрезка AB");
        System.out.print("Введите значение x2: ");
        int x2 = s.nextInt();
        System.out.print("Введите значение y2: ");
        int y2 = s.nextInt();

        System.out.println("");

        if (y1 == y2 && x1 != x2) {
            System.out.print("Дорога ровная");
        } else if (y1 < y2 ) {
            System.out.print("Подъём");
        } else if (y1 > y2) {
            System.out.print("Спуск");
        } else if (x1 == x2 && y1 == y2) {
            System.out.print("это не отрезок, а точка");
        } else {
            System.out.println("Отвесная дорога");
        }
    }
}
