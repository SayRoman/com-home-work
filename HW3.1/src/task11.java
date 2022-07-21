import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {

        /*
        Найти корни квадратного уравнения и вывести их на
        экран, если они есть. Если корней нет, то вывести сообщение об этом.
        Конкретное квадратное уравнение определяется коэффициентами a, b, c,
        которые вводит пользователь с клавиатуры.
         */

        // Квадратное уравнение — это уравнение вида ax^2 + bx + c = 0,
        // где a — первый или старший коэффициент, не равный нулю;
        // b — второй коэффициент, c — свободный

        //уточнить как задавать параметры как и для целого числа так и для вещественного.

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = s.nextInt();
        System.out.print("Enter number b: ");
        int b = s.nextInt();
        System.out.print("Enter number c: ");
        int c = s.nextInt();

        int d = (b * b) - 4 * a * c;

        System.out.println("");
        if (a == 0) {
            System.out.println("a - cannot be zero");
        } else if (d < 0) {
            System.out.print("No roots");
        } else if (d == 0) {
            double x1x2 = -b/(2 * a);
            System.out.print("There's only one root x1;x2: " + x1x2);
        } else {
            double x1 = ((b * -1) + Math.sqrt(d) / (2 * a));
            double x2 = ((b * -1) - Math.sqrt(d) / (2 * a));
            System.out.println("There are two different roots:");
            System.out.println("The first root is x1: " + x1);
            System.out.print("The second root is: x2:  " + x2);


        }
    }
}

