import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        System.out.println("Enter a String");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        sc.close();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev+=str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str+" is a Palindrome");
        } else {
            System.out.println(str +" is Not a palindrome");
        }
    }
}
