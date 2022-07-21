import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        /*
        Определить номер подъезда девятиэтажного дома, по
        указанному номеру квартиры N. Считать, что на каждом
        этаже находится M квартир. Вывести в консоль номер подъезда.
         */

        // Девятиэтажный дом имеет 4 квартиры на одном этаже.
        // Девятиэтыжный дом имеет в наличии 5 подъездов.

        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер квартиры: ");
        int n = s.nextInt();

        if (n > 0 && n <= 36) {
            System.out.println("Номер подъезда дома: 1");
        } else if (n > 36 && n <= 72) {
            System.out.println("Номер подъезда дома: 2");
        } else if (n > 72 && n <= 108) {
            System.out.println("Номер подъезда дома: 3");
        } else if (n > 108 && n <= 144) {
            System.out.println("Номер подъезда дома: 4");
        } else {
            System.out.println("Номер подъезда дома: 5");
        }

    }
}
