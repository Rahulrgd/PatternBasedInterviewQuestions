package Questions;

public class DiamondShapePatternProgram {

  public static void main(String[] args) {
    DiamondShapePatternProgram.printPattern(6);
  }

  private static void printPattern(int rows) {
    // Top half dimond pattern
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=rows-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    // Bottom half dimond pattern
    for(int i=rows-1; i>=1; i--){
        for(int j=rows; j>i; j--){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
  }
}
