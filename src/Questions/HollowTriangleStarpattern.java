package Questions;

public class HollowTriangleStarpattern {

  public static void main(String[] args) {
    int rows = 5;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        if (j == 1 || i == rows || j == i) {
          System.out.print("* ");
        } else {
            System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
