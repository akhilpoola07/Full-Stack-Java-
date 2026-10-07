import java.util.*;
public class scopes 
{
    public static String data = "This is insi";
    public static void main(String[] args)
    {

        int  AB= 100;
        System.out.println("AB :" + AB);
        String data = "This is inside the main class    ";
        System.out.println(data);
        {
            data = "This is inside the Scope ";
            AB = 200;
            System.out.println("data : "+data);
            System.out.println("Ab is :" + AB);
        }
        System.out.println(data);
        System.out.println("Ab is :" + AB);
    }
    public static void HELLO(){
        System.out.println(data);
    }
 }

