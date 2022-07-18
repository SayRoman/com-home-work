import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.print("Введите размер: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println();
        System.out.print("Ромб\n");
        int z = 1;
        for (int i = 0; i <= num / 2 + 1; i++) {
            int prob = (num - z) / 2;

            for (int j = 0; j < prob; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < z; k++) {
                System.out.print("*");
            }
            System.out.println();

            z = z + 2;
        }
        z = num - 2;

        for (int i = num / 2; i > 0; i--) {
            int prob = (num - z) / 2;
            for (int j = 0; j < prob; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < z; k++) {
                System.out.print("*");
            }
            System.out.println();
            z = z - 2;
        }
    }
}
