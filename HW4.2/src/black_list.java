public class black_list {
    public static void main(String[] args) {

        //подсказка для параллелограмма
        int count = 10;
        for (int j = 1; j <= count; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= count - 2; i++) {
            for (int j = 0; j < count + i; j++) {
                if (j == i || j == (count + i - 1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int k = 0; k < (2*count - 1); k++)
            if (k < (count-1)) System.out.print(" ");
            else System.out.print("*");

    }
}
