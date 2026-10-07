package DAY4;

public class Switch {
    public static void main(String [] args){
        int day=30;
        //if(day<1 || day>7){
           // System.out.println("the range is from 1-7");
       // }
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Days are only in the range of 1 to 7");

        }
    }
}
