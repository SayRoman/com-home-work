package HW3_1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        System.out.println("Перед Вами список животных:");
        System.out.println("\t1 - кошка;");
        System.out.println("\t2 - собака;");
        System.out.println("\t3 - мышь;");
        System.out.println("\t4 - лошадь;");
        System.out.println("\t5 - корова;");
        System.out.println("\t6 - лягушка;");
        System.out.println("\t7 - курица;");
        System.out.println("\t8 - свинья;");
        System.out.println("\t9 - петух;");
        System.out.println("\t10 - коза.");

        Scanner s = new Scanner(System.in);
        System.out.println("Выберете животное, что бы прочитать звук, который оно создаёт.");
        System.out.print("Введите номер животного: ");
        int n = s.nextInt();

        switch (n) {
            case 1: {
                System.out.println("Кошка создает звук: мяу-мяу");}
            break;
            case 2: {
                System.out.println("Собака создает звук: гав-гав");}
            break;
            case 3: {
                System.out.println("Мышь создает звук: пи-пи-пи-пи");}
            break;
            case 4: {
                System.out.println("Лошадь создает звук: иго-го-го");}
            break;
            case 5: {
                System.out.println("Корова создает звук: мууу");}
            break;
            case 6: {
                System.out.println("Лягукша создает звук: ква-ква");}
            break;
            case 7: {
                System.out.println("Курица создает звук: ко-ко-ко");}
            break;
            case 8: {
                System.out.println("Свинья создает звук: хрю-хрю");}
            break;
            case 9: {
                System.out.println("Петух создает звук: ку-ка-ре-ку");}
            break;
            case 10: {
                System.out.println("Коза создает звук: мееее");}
            break;
            default: {
                System.out.print("Вы ввели некорректные данные");
            }
        }


    }
}
