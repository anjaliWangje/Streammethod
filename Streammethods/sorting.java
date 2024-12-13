package Streammethods;

import java.util.ArrayList;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("anjai");
        list.add("pranali");
        list.add("shivam");
        list.add("aboli");
        list.stream().sorted((String name1,String name2)->name1.
                length()-name2.length()).forEach(System.out::println);
    }
}
