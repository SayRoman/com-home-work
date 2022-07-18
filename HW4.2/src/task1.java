import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите число рядов: ");
        int r = s.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int a = r; a > i; a-- ) {
                System.out.print(" ");}
            for (int b = 1; b <= i; b ++) {
                System.out.print("*");}
            System.out.println();
        }


    }
}
