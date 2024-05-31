package gr.aueb.cf.ch6;

public class TwoDimArrayApp {

    public static void main(String[] args) {
        int[][] grid = new int [2][2];

        grid[0][0] = 0;  // 1η γραμμή 1η στήλη
        grid[0][1] = 1;  // 1η γραμμή 2η στήλη
        grid[1][0] =2;   // 2η γραμμή 1η στήλη
        grid[1][1] =3;   // 2η γραμμή 2η στήλη

        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
