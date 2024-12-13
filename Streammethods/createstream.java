package Streammethods;

import java.util.ArrayList;
import java.util.List;

public class createstream {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("anjali");
        list.add("abolii");
        list.add("shivam");
        list.stream().forEach(System.out::println);
    }
}
