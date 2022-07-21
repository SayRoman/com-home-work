import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите время от 0 до 24 часов:");
        int hours = s.nextInt();

        /* с 0 до 6 часов — ночь. С 7 до 12 часов — утро.
        С 13 до 18 часов — день. С 19 до 24 часов — вечер.
        */

        switch (hours) {
            case (0):
            case (1):
            case (2):
            case (3):
            case (4):
            case (5):
            case (6): {
                System.out.println("Доброй ночи");}
            break;
            case (7):
            case (8):
            case (9):
            case (10):
            case (11):
            case (12): {
                System.out.println("Доброе утро");}
            break;
            case (13):
            case (14):
            case (15):
            case (16):
            case (17):
            case (18): {
                System.out.println("Добрый день");}
            break;
            case (19):
            case (20):
            case (21):
            case (22):
            case (23):
            case (24): {
                System.out.println("Доброй вечер");}
            break;
            default: {
                System.out.println("Вы ввели некорректные данные");}
        }
    }
}
