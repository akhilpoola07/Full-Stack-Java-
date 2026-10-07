package DAY7;

public class Exception {
    public static void main(String [] args)
    {
        // the try block is used to find the Error or exception at run time;
        try{
            System.out.println("hello");
            int j=10;
            int k;
            int l = j/k;
            System.out.println("the Result is "+l);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("The exception is ......");
        }
        finally {
            System.out.println(l);
        }
    }
}
