public class IfElse_conditions {
    public static void main(String[] args)
    {
        System.out.println("This program for loan Approval criteria");
        int Credit_score= 70;
        boolean Hasjob=true;
        int age = 12;
        if(Credit_score >=75 && Hasjob==true)
        System.out.println("loan is Approved from the bank");
        else if(age>18)

        System.out.println("loan is Approved by the bank");
        else
            System.out.println("loan is not Approved by the bank");
    }
}
