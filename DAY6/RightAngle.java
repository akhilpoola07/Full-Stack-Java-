package DAY6;

public class RightAngle  {
    public static void main(String[] args) {
        int rows = 11;
        int cols = 11;
        int space = 1;
        
        if(rows%2==0||cols%2==0)
            System.out.println("can not print rhombus");
        else{
            for (int s =0 ;s<cols/2;s++)
            {
                System.out.println(" ");
            }
            System.out.println("*");
            for(int row = 1;row<=rows-1;row++){
                System.out.print("*");
                for(int s = 0; s<space;s++){
                    System.out.print(" ");
                }
                
                System.out.print("*");
                System.out.println();
                space+=2;
            }
        }
    }
}
