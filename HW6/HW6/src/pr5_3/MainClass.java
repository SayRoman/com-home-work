package pr5_3;

/*
    Create a 2D array and a 3D array.
    Copy the 2D array into a part of the 3D array.
    1) Reference redirection.
    2) Real copy of the initial 2D array as a branch of the 3D array.
 */

public class MainClass {
    public static void main(String[] args) {
        TwoDArray _2Darray = new TwoDArray(2, 3);
        ThreeDArray _3Darray = new ThreeDArray(2, _2Darray.string, _2Darray.columns);
        int [][] array2d = new int[_2Darray.string][_2Darray.columns];
        int [][][] array3d = new int[_3Darray.bloc][_3Darray.string][_3Darray.columns];
        _2Darray.fillArray(array2d);
        _2Darray.showArray(array2d);
        System.out.println();
        System.out.println();
        _3Darray.fillArray(array3d);
        _3Darray.showArray(array3d);
    }
}
