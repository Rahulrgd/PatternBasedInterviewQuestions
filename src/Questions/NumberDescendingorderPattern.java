package Questions;

public class NumberDescendingorderPattern {

  public static void main(String[] args) {
    int rows = 5;
    for (int i = 1; i<=rows; i++) {
        int number = rows;
        for(int j=1; j<=i; j++){
            System.out.print(number);
            number--;
        }
        System.out.println();
    }
  }
}
