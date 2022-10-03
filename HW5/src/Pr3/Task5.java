package Pr3;

public class Task5 {
    char[][] arrayPlayArea = new char[10][10];

    public static void main(String[] args) {
        Task5 obj = new Task5();
        obj.createPlayArea();
        obj.showPlayArea();
        obj.randomNUmber();
        obj.createStone(obj.randomNUmber());
        System.out.println();
        System.out.println();
        obj.showStoneArea(obj.createStone(obj.randomNUmber()));

    }



    public void showStoneArea(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public char[][] createStone(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 40) {
                    array[i][j] = 's';
                } else if (array[i][j] < 40) {
                    array[i][j] = '*';
                }
            }
        }
        return array;
    }

    public char[][] randomNUmber() {
        char[][] arrayRandomNumber = new char[8][8];
        for (int i = 0; i < arrayRandomNumber.length; i++) {
            for (int j = 0; j < arrayRandomNumber[i].length; j++) {
                arrayRandomNumber[i][j] = (char) (Math.random() * 100);
            }
        }
        return arrayRandomNumber;
    }

    public void createPlayArea() {
        for (int i = 0; i < arrayPlayArea.length; i++) {
            for (int j = 0; j < arrayPlayArea[i].length; j++) {
                arrayPlayArea[i][j] = '*';
            }
        }
    }

    public void showPlayArea() {
        for (int i = 0; i < arrayPlayArea.length; i++) {
            for (int j = 0; j < arrayPlayArea[i].length; j++) {
                System.out.print(arrayPlayArea[i][j] + " ");
            }
            System.out.println();
        }
    }
}
