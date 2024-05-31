package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Diary {

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int d = 0;
      int m = 0;
      int y = 0;

      System.out.printf(" Δώστε έτος ");
      y = in.nextInt();

      System.out.printf(" Δώστε μήνα ");
      m = in.nextInt();

      System.out.printf(" Δώστε ημέρσ ");
      d = in.nextInt();

      System.out.printf("%d/ %d / %d ", d,m,y);

  }

}


