import java.util.Scanner;
// Как сместить ряды в право на n "_" равное количеству рядов.
// При спуске вниз на строку уменьшать пустое место на 1, что получить параллелограмм?
public class task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число рядов: ");

        int rows = s.nextInt();
        for (int j =1; j <= rows; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= rows - 2; i++) {
            System.out.print("*");
            for (int j = 2; j <= rows - 1; j++) {
                System.out.print(" "); // Если пустое место заменить на "*",
                                       // то будет заполненный параллелограмм.
            }
            System.out.print("*");
            System.out.println();
        }
        for (int j = 1; j <= rows; j++) {
            System.out.print("*");
        }System.out.println();
    }
}

