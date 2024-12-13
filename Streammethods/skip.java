package Streammethods;

import java.util.ArrayList;
import java.util.List;

public class skip {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("aboli");
        list.add(" prnali");
        list.add("anjali");
        list.add("shivam");
        list.stream().skip(3).forEach(System.out::println);
    }
}
