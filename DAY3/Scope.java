public class Scope {
    public static void main(String[] args) {
        //scope is {  code .....}
        //literals
        int num=0b1111;
        
        System.out.println(num);
        //Operators
        //Arthimetic
         int a=12,b=6;
         System.out.println(a+b);
         System.out.println(a-b);
         System.out.println(a*b);
         System.out.println(a/b);
         System.out.println(a%b);
         //logical 
         boolean x=true,y=false;
         System.out.println(x&&y);
         System.out.println(x||y);
         System.out.println(!x);
         // if condition 
         if (a>b){
            System.out.println(" yeah it is true ");
         }
         //boolean if condition 
         boolean is=true;
         if (is){
            System.out.println("it is true");
         }
         //if condition without braces
         if (4>2)
            System.out.println("4 is greater than 2");
        //if-else condition
        if (20<22 & 20<21)
            System.out.println("it is greater");
        
        else
            System.out.println("it is smaller ");
        
        //if-else boolean
        boolean israining=false;
        if(israining)
        System.out.println("it is rain");
        else 
            System.out.println("it is not raining ");
        //else-if condition


    }
}
