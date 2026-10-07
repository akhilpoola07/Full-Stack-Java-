package DAY5;

public class SpaceTriangle {
    public static void main(String[] args) {
        int rows = 7;
        int cols=9;
        int stars=2;
        int spaces = cols/2;
        
        for (int i = 1; i <= 1; i++) {

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.println("* ");
        }
        spaces--;
        //middlr
            for (int j = 1; j < rows-2; j++) {
                for(int i=j;i<=spaces;i++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int spa=1;spa<=2*j-1;spa++)
                {
                    System.out.print(" ");
                }
                
                System.out.println("* ");
            }
           
        
        for (int i = cols; i >= 1; i--) {
            System.out.print("*");
        }
    }
}
