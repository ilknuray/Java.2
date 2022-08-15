package day30_immutableDate;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("kenan");
        list.add("enes");
        list.add("ismail");
        System.out.println(list);

        list.set(1,"Yasemin");
        System.out.println(list);

        list.remove("ismail");
        System.out.println(list);
    }
}
