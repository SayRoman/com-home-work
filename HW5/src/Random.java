public class Random {

    public int i;
    public int j;

    public int[][] createArray() {
        int[][] arr1 = new int[i][j];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 100);
            }

        }

        return arr1;
    }

    public void showArray(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");

            }
            System.out.println();
        }
    }

   /* public int[][] changeArray(int[][] arr1) {
        int [][] arr2 = new int[i][j];
        for (int k = 0; k < arr1.length; k++) {
            for (int l = 0; l < arr1[i].length; l++) {
                if (arr1[i][j] % 2 == 0){
                    arr2[k][l] = arr1[i][j];

                }
            }
        }return arr2;*/

    }




