package Pr3;/* Write a program to detect and print prime numbers
(integers evenly divisible only by themselves and 1),
using two nested for loops and the modulus operator (%)
 */

public class Task4 {
    public static void main(String[] args) {
        Task4 obj = new Task4();
        int[] arrayNumber = new int[100];
        obj.fillArray(arrayNumber);
        //obj.showArray(arrayNumber);
        System.out.println();
        obj.primeNumbers(arrayNumber);
    }

    public void primeNumbers(int[] array) {
        for (int i = 2; i < array.length; i++) {
            int k = 0;
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0) {
                    k++;
                }
            }
            if (k < 2) {
                System.out.print(i + " Простое число\n");
            }
        }
    }

    public int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


