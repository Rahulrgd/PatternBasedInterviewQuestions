package Questions;

public class TriangleCharacterPattern {
    public static void main(String[] args) {
        int rows = 5;
        for(int i=0; i<rows; i++){
            for(int j=0; j<=rows-i; j++){
                System.out.print(" ");
            }
        }
    }
}