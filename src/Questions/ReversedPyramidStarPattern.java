package Questions;

public class ReversedPyramidStarPattern {

  public static void main(String[] args) {
    ReversedPyramidStarPattern.printPattern(6);
  }

  private static void printPattern(int rows) {
    for(int i=rows; i>=1; i--){
        for(int j=1; j<=rows-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
  }
}
