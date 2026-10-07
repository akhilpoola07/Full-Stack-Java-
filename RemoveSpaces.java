import java.util.Scanner;
public class RemoveSpaces {
    public static void main (String args[]){
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        String Temp = sc.nextLine();
        sc.close();
        //String noSpaces=str.replaceAll("o","");
        //System.out.println("String with no spaces : "+noSpaces);
        String Del_String = str.replaceAll(Temp,"");
        System.out.println(Del_String);
    }
}
