import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите количество ярусов Ёлочки: ");
        int rows = s.nextInt();
        drawChristmasTree(rows);

    }

    private static void drawChristmasTree(int rows) {

        for (int i = 0; i < rows; i++) {
            triangle(i + 1, rows);
        }
    }

    private static void triangle(int n, int max) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < max - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
