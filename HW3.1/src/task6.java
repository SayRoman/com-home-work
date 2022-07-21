import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        /* Определить количество дней в году, который вводит
        пользователь, и вывести их в консоль. В високосном году –
        366 дней, тогда как в обычном – 365. Високосными годами
        являются все годы, делящиеся нацело на 4, за исключением
        столетий, которые не делятся нацело на 400.
        */

        Scanner s = new Scanner (System.in);
        System.out.print("Enter year: ");
        int years = s.nextInt();
        System.out.println("\n");

        /* Количество дней высчитывается по определенной формуле:
           високосным годом (366 суток) является год,
           который делится без остатка на 4 за исключением годов,
           которые кратны 100 и не кратны 400.
         */

        if ((years % 4 == 0) && (years % 100 != 0) || (years % 400 == 0)) {
           System.out.print("Number of days in a year: 366");
        } else {
           System.out.print("Number of days in a year: 365");
        }
        }
        }



