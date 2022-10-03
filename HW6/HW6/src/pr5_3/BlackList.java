package pr5_3;

public class BlackList {
    public int[][] fillarray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    public void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        BlackList b = new BlackList();
        int x = 2;
        int y = 3;
        int[][] array = new int[x][y];

        b.fillarray(array);
        b.showArray(array);
    }

}



