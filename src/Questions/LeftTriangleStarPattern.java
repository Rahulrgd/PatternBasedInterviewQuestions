package Questions;

public class LeftTriangleStarPattern {

  public static void main(String[] args) {
    LeftTriangleStarPattern.printPattern(6);
  }

  private static void printPattern(int num) {
    for(int i=1; i<=num; i++){
        for(int j=1; j<=num-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
}
