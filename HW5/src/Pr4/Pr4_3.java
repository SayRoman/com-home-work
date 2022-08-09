package Pr4;

public class Pr4_3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
