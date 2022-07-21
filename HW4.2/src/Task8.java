import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String number2 = s.next();
        int upDec = number2.length();
        System.out.print("Количество цифр в числе: ");
        System.out.println(upDec);
        int number = Integer.parseInt(number2);
        int number3 = 0;

        // написать код для выделения каждой цифры из числа и суммировании их.


        System.out.println("Сумма всех цифр в числе " + number + ": " + number3);


    }
}

