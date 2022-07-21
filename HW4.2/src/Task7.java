import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число больше нуля: ");

        int num = s.nextInt();
        int reversed = 0;

        if (num <= 0) {
            System.out.print("Вы ввели некорректные дынные!");
        }
        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;
        }

        System.out.println("Перевёрнутое число: " + reversed);
    }
}
