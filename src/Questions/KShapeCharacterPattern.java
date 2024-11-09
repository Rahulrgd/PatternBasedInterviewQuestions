package Questions;

public class KShapeCharacterPattern {
    public static void main(String[] args) {
        int rows =5;
        for(int i=0; i<rows; i++){
            for(char ch='A'; ch<='A'+(rows-(i+1)); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        for(int i=0; i<rows; i++){
            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
