import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task7 {
    public static void main(String[] args) {

        /*
        Пользователь вводит с клавиатуры букву.
        Программа должна определить, в какой раскладке введена буква –
        в латинской или кирилице. Вывести в консоль: «латиница», если
        буква введена латиницей или «кирилица»,
        если буква относится к кирилическому алфавиту. Если введена цифра,
        а не буква, вывести «цифра». Если символ не относится ни к буквам,
        ни к цифрам, вывести «невозможно определить»
        */
        Scanner s = new Scanner(System.in);
        System.out.print("Enter only one a simbol: ");
        String simbol = s.nextLine();
        Pattern letter = Pattern.compile("[a-zA-Z]{1}");
        Matcher mletter = letter.matcher(simbol);
        Pattern pl = Pattern.compile("[а-яА-Я]{1}");
        Matcher mletter1 = pl.matcher(simbol);
        Pattern number = Pattern.compile("[0-9]{1}");
        Matcher mnumber = number.matcher(simbol);

        System.out.println("");

        if (mletter.matches() == true) {
            System.out.println("Your simbol \'" + simbol + "\' is Latin");
        } else if (mletter1.matches() == true) {
            System.out.println("Your simbol \'" + simbol + "\' is Cyrillic");
        } else if (mnumber.matches() == true) {
            System.out.println("Your simbol \'" + simbol + "\' is Digit");
        } else {
            System.out.println("Impossible to determine");
        }
    }
}
