package Pr4;

public class Pr4_4 {
    public static void main(String[] args) {
        int[][] _2D_array = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1},
        };
        for (int i = 0; i < _2D_array.length; i++) {
            for (int j = 0; j < _2D_array[i].length; j++) {
                System.out.print(_2D_array[i][j] + " ");
            }
            System.out.println();

        }
    }
}
