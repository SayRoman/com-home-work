import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        //Нарисовать на экране лесенку.
        // Количество ступенек указывает пользователь с клавиатуры.

        Scanner s = new Scanner(System.in);
        System.out.print("Введите длину ступеньки: ");
        int stepLength = s.nextInt();
        System.out.print("Введите глубину ступеньки: ");
        int stepDepth = s.nextInt();
        System.out.print("Введите количество ступенек: ");
        int numberOfSteps = s.nextInt();
        System.out.println();
        System.out.println("Лестница из " + numberOfSteps + " ступенек.");



    }
}
