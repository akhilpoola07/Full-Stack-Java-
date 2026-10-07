import java.util.Scanner;
public class Sumofdigits 
{
    public static void main(String[] args){
        

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Number :");
        int number = s.nextInt();
        Sumofdigits obj1 = new Sumofdigits();
        int sum = obj1.sumofdigit(number);
        System.out.println("Sum of digits is :"+ sum);
        s.close();
    }
    public int sumofdigit(int num){
        int sum = 0;
        while(num > 0)
        {
            int temp = num% 10;
            sum = sum+temp;
            num = num/10;  
         }
        return sum;
        }
}
