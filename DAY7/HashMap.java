package DAY7;

import java.util.*;

public class HashMap {
    public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Akhil", 1);
    map.put("Ranjith", 2);
    map.put("Balaji", 3);
    map.put("Kumar", 4);
    map.put("Reddy", 5);
    map.put("Hello", 6);
    map.put("World", 7);
    System.out.println(map);
    System.out.println(map.get("Akhil"));
    System.out.println(map.remove("world"));
    System.out.println("After update"+map);
    HashMap<String,Scores> score1 = new Hashmap<>();
    Scores.add("Akhil",new Scores("Hello",23));
    System.out.println(score1);
}

}                 
class Scores{
    
    String Name;
    int mark;
    Scores.Put(String Name,int mark){
        this.Name = Name;
        this.mark = mark;
    }
}
