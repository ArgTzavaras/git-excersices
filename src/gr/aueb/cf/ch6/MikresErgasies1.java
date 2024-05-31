package gr.aueb.cf.ch6;

public class MikresErgasies1 {

    public static void main(String[] args) {
        int [] quantities = {100, 200, 500, 20, 50};
        int position = 0;
        int values = 500;

        position = getElementPosition(quantities, 500);

        System.out.printf("Position  :  %d", position);

    }

    public static int getElementPosition(int[]arr, int values) {
        if( arr == null ) return -1;

        for (int i = 0; i < arr.length - 1 ; i++) {
            if (arr[i] == values) {
                return i;
            }
        }
        return -1;

    }
}
