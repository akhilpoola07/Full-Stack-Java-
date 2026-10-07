package DAY6;

public class RhombusPattrn {
    public static void main(String[] args) {
        System.out.println("hi");
        int row = 9;
        int spaces = row/2;
        for (int i = 1; i <= 1; i++) {

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.println("* ");
        }
        spaces--;
        for(int k=1;k<row-2;k++){

        
            for(int l=k;l<spaces;l++ ){
                System.out.print(" ");
                
            }
            System.out.print("*");
            for(int j = 1;j<=2*k-1;j++){
                System.out.print(" ");
                System.out.println("*");
            }
            System.out.println("*");

        } 
      }
}

