package HW3_1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        int day = s.nextInt();

        switch (day) {
            case (1): {
                System.out.println("1 - это понедельник");
            }
            ;
            break;
            case (2): {
                System.out.println("2 - это вторник");
            }
            break;
            case (3): {
                System.out.println("3 - это среда");
            }
            break;
            case (4): {
                System.out.println("4 - это четверг");
            }
            break;
            case (5): {
                System.out.println("5 - это пятница");
            }
            break;
            case (6): {
                System.out.println("6 - это суббота");
            }
            break;
            case (7): {
                System.out.println("2 - воскресенье");
            }
            break;
            default: {
                System.out.println("Вы ввели некоректные данные");
            }
        }
    }
}
