import java.util.*; 

public class ReverseWordsRuntime {
    public static void main(String args[]){
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter Comma-seperated words : ");
        String str= sc.nextLine();
        sc.close();
        String[] words = str.split(",");
        //System.out.print(Arrays.toString(words));
        StringBuilder result = new StringBuilder();
        for(int i=0;i<words.length;i++){
            String reversed = new StringBuilder(words[i]).reverse().toString();
            result.append(reversed);
            if (i<words.length-1){
                result.append(",");
            }
        }
        System.out.println("Reversed Words : "+result.toString() );

    }
}
