package HW3_1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        int y;


        System.out.println("Specify Point A Coordinates");
        System.out.print("Input x = ");
        x = s.nextInt();

        System.out.print("Input y = ");
        y = s.nextInt();

        System.out.println(" ");

        if (x > 0 & y > 0) {
            System.out.println("Point A is in I quarter");
        }
        else if (x < 0 & y > 0) {
            System.out.println("Point A is in II quarter");
        }
        else if (x < 0 & y < 0) {
            System.out.println("Point A is in III quarter");
        }
        else if (x > 0 & y < 0) {
            System.out.println("Point A is in IV quarter");
        }
        else System.out.println("Center");


    }
}
