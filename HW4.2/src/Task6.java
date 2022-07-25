import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Нарисовать на экране лесенку.
        // Количество ступенек указывает пользователь с клавиатуры.

        Scanner s = new Scanner(System.in);
        System.out.print("Введите количество ступенек: ");
        int steps = s.nextInt();

        for (int i = 1; i <= steps; ++i) {

            for (int j = 1; j < i; ++j) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 3; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
            for (int j = 1; j < i + 1; ++j) {
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println("");
        }
    }
}

