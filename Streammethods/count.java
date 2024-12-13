package Streammethods;

import java.util.ArrayList;
import java.util.List;

public class count {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("anjai");
        list.add("pranali");
        list.add("shivam");
        list.add("aboli");
       long noofbigname= list.stream().filter((String name)->name.length()>5).count();
        System.out.println(noofbigname);

    }
}
