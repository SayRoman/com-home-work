package pr5_3;

public class ThreeDArray {
    int bloc;
    int string;
    int columns;

    public ThreeDArray() {
    }

    public ThreeDArray(int bloc, int string, int columns) {
        this.bloc = bloc;
        this.string = string;
        this.columns = columns;
    }

    public int[][][] fillArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }
        return array;
    }

    public void showArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
