package gr.aueb.cf.ch6;

public class ArrayMinApp2 {

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 8, 9, 8, 2, 11};

        // Ορίζουμε ως min value το max-int , οπότε κάποιο στοιχείο θα είναι
        //  μικρότερο από max-int εκτός εάν όλα τα στοιχεία  του πίνακα είναι ax-int
        // πότε τότε το osition αραμένει θ ,  που είναι το σωστό
        int minValue =Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min Value: %d, Min Posistion: %d", minValue ,minPosition + 1);

    }
}
