package HW3_1;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        /*
        Программа запрашивает шестизначное число.
        После ввода определяет, будет ли являться «счастливым» билет с таким номером
        (сумма первых трех цифр совпадает с суммой трех последних).
           Пример входных данных:
                423027
                954832
                Вывод:
                Да
                Нет
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строго шестизначное число: ");
        Integer i = sc.nextInt();
        String s = i.toString();
        char [] r = s.toCharArray();
        int summOfFirstPart = r[0] + r[1] + r[2];
        int summOfSecondPart = r[3] + r[4] + r[5];
        if (summOfFirstPart == summOfSecondPart) {
            System.out.println("Lucky ticket!");
        } else {
            System.out.println("Unlucky ticket");
        }
        System.out.println();


    }
}
