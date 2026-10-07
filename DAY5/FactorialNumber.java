package DAY5;

public class FactorialNumber {
        public static void main(String [] args){
        int n=20;
        int sum=1;
        for(int i = n;i>0;i--)
        {
           sum=i*sum;
        }
        System.out.println("Factorial of a Number is :"+ sum);
    }
}
