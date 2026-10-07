package DAY4;

public class RightTriangle {
    public static void main(String [] args){
        int rows=5;
        int cols = 5;
        int stars = 2;
        //int spaces = 0;
        //first row
         System.out.println("*");
    
        //middle cols
        for(int row=1;row<rows-1;row++){
            System.out.print("*");
            for(int s=0;s< row-1;s++){
                System.out.print(" ");
                
            }
            //spaces++;
            System.out.println("*");
            System.out.println();
        }
        //last row
        for(int col=0;col<cols;col++){
            System.out.print("*");
        }
       
    }
}
