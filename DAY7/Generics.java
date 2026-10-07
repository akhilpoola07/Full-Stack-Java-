package DAY7;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        Addition<Integer> addition = new Addition<>();
        addition.add(1, 2);
        System.out.println(addition.add());

        Container<Integer> container = new Container(120);

    }
}               
