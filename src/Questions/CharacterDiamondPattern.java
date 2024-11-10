package Questions;

public class CharacterDiamondPattern {

  public static void main(String[] args) {
    int rows = 5;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j <= rows - i; j++) {
        System.out.print(" ");
      }
      System.out.print((char) ('A' + i));
      if (i > 0) {
        for (int j = 1; j <= i * 2; j++) {
          System.out.print(" ");
        }
        System.out.print((char) ('A' + i));
      }
      System.out.println();
    }
    // for(int i=1; i<rows; i++){
    //     System.out.println();
    //     for(int j=0; j<=i+1; j++){
    //         System.out.print(" ");
    //     }
    //     System.out.print((char)('A'+(rows-i-1)));
    //     for(int j=1; j<=2*(rows-i); j++){
    //         System.out.print(" ");
    //     }
    //     System.out.print((char)('A'+(rows-i-1)));
    // }
    for (int i = rows - 2; i >= 0; i--) {
      System.out.print("  ");
      for (int j = 2; j <= rows - i; j++) {
        System.out.print(" ");
      }
      System.out.print((char) ('A' + i));
      if (i > 0) {
        for (int j = 1; j <= i * 2; j++) {
          System.out.print(" ");
        }
        System.out.print((char) ('A' + i));

        System.out.println();
      }
    }
  }
}
