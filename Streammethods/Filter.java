package Streammethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<String>name1=new ArrayList<>();
        name1.add("anjali");
        name1.add("aboli");
        name1.add("pranali");
        name1.add("shivam");
        name1.stream().filter((String name)->name.length()>6).forEach(System.out::println);
    }
}
