package Streammethods;

import java.util.ArrayList;
import java.util.List;

public class limit {
    public static void main(String[] args) {
        List<String> name1=new ArrayList<>();
        name1.add("anjali");
        name1.add("aboli");
        name1.add("pranali");
        name1.add("shivam");
        name1.stream().limit(3).forEach(System.out::println);
    }
}
