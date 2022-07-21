import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Задайте число рядов: ");
        int rows = s.nextInt() - 1;


        for (int i = rows; i >= 0; i--) {

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int j1 = 0; j1 <= i; j1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

