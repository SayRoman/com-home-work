package pr5_3;


public class TwoDArray {

    int string;
    int columns;

    public TwoDArray() {
    }

    public TwoDArray(int string, int columns) {
        this.string = string;
        this.columns = columns;
    }

    public int[][] fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
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

}
