import java.util.Scanner;
public class SumofDigitsString {
    public static void main(String[] args){
        

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Number :");
        String str = s.nextLine();
        s.close();
        int sum = 0;
        String ch="";
        for(int i=0;i<=str.length()-1;i++){
            ch=String.valueOf(str.charAt(i));
            sum+=Integer.parseInt(ch);
        }
        System.out.print("sum is :"+sum);
}
}
