package Questions;

public class DownwardTriangleStarPattern {

  public static void main(String[] args) {
    DownwardTriangleStarPattern.printPattern(6);
  }

  private static void printPattern(int rows) {
    for(int i=rows; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
  }
}
