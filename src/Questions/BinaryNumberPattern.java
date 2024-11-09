package Questions;

import java.util.Scanner;

public class BinaryNumberPattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows: ");
    int rows = sc.nextInt();
    BinaryNumberPattern.printPattern(rows);
    sc.close();
  }

  private static void printPattern(int rows) {
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=rows; j++){
            if((i+j)%2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
  }
}
