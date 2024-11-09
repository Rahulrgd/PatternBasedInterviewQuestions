package Questions;

import java.util.Scanner;

public class PascalsTriangle {
    // number = number * (i - j) / (j + 1);
    // This formula is derived from the properties of binomial coefficients.

  public static void main(String[] args) {
    PascalsTriangle.printPattern(6);
  }

  private static void printPattern(int rows) {
    for(int i=0; i<rows; i++){
        for(int j=0; j<rows-i; j++){
            System.out.print(" ");
        }
        int number =1;
        for(int j=0; j<=i; j++){
            System.out.print(number + " ");
            number = number * (i-j)/(j+1);
        }
        System.out.println();
    }
  }
}
