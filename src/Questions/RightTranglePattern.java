package Questions;

public class RightTranglePattern {

  public static void main(String[] args) {
    RightTranglePattern.printPattern(6);
  }

  private static void printPattern(int num) {
    for(int i=0; i<=num; i++){
        for(int j=0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
}
