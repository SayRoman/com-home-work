package Pr4;
/* Find the maximum mark in a group of students.
 Print this mark itself and its index.
 */

public class Pr4_2 {
    public static void main(String[] args) {
        Pr4_2 obj = new Pr4_2();
        String[][] array = new String[][]{
                {"Name   ", "LastName", " Result"},
                {"Ivan   ", "  Ivanov", "10"},
                {"Petro  ", "   Popov", "9"},
                {"Andry  ", " Fedotov", "10"},
                {"Antony ", "   Mamov", "7"},
                {"Igor   ", "  Vlasov", "8"}
        };
        obj.showArray(array);
        System.out.println();
        obj.showArrayOfResults(array);
        String maxMark = "10";
        System.out.println();
        //obj.equalsResult(array[][]);

        for (int i = 1; i < array.length; i++) {
            for (int j = 2; j < array[i].length; j++) {
                if (array[i][j].equals(maxMark)) {
                    System.out.println("Yes");
                }
            }
        }
    }

    public void showArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void showArrayOfResults(String[][] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 2; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
