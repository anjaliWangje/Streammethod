package Streammethods;

import java.util.ArrayList;
import java.util.List;

public class Sortingoperation {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("anjai");
        list.add("pranali");
        list.add("shivam");
        list.add("aboli");
        list.stream().sorted().forEach(System.out::println);
    }
}
