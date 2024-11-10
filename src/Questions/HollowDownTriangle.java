package Questions;

public class HollowDownTriangle {

  public static void main(String[] args) {
    int rows = 5;
    for (int i = rows; i >= 1; i--) {
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        if (i == rows || i == 1 || j == i || j == 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
