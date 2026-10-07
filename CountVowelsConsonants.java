import java.util.Scanner;
public class CountVowelsConsonants{
    public static void main(String [] args){
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        sc.close();
        int vowels  = 0;
        int consonants = 0;
        int digits = 0;
        int others = 0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if("aeiou".indexOf(ch) != -1){
                vowels++;
            } else if(ch >='a' && ch<='z'){
                consonants++;
            }else if(ch >='0' && ch<='9'){
                digits++;
            }else
                others++;

        }
        System.out.println("vowels : "+vowels);
        System.out.println("Consonants : "+consonants);
        System.out.println("Digits : "+digits);
        System.out.println("others : "+others);
    }
}
