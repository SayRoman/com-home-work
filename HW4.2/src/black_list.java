import com.sun.jdi.event.StepEvent;

import java.util.Scanner;

public class black_list {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число  и высоту ярусов Ёлочки: ");
        System.out.print("");
        int nJar = sc.nextInt();
        int rows = sc.nextInt();

        for (int a = 0; a < nJar; a++) {

            for (int i = 0; i < rows; i++) {

                for (int j = rows; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j1 = 0; j1 <= i; j1++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = rows; j > i; j--) {
                    System.out.print(" ");
                }

                System.out.println();


            };
        }
    }
}
