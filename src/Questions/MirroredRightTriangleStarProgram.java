package Questions;

public class MirroredRightTriangleStarProgram {

  public static void main(String[] args) {
    MirroredRightTriangleStarProgram.printPattern(6);
  }

  private static void printPattern(int rows) {
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=rows-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
}
