package homeWork.Pr7.second;

import java.io.Serializable;

public class Connection {
    private int instanceCounter = 5;
    private int[] id;

    public int[] getId() {
        return id;
    }

    private int[] arrCon = new int[instanceCounter];

    public int[] getArrCon() {
        return arrCon;
    }

    public void regID(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }
    }


}
