package practiceler;

import java.util.Arrays;

public class C48_ForEach {
    public static void main(String[] args) {

        String[]list={"fruits","vegetables","meat","milk"};
        for (String each:list) {
            System.out.println(each +each.length());

        }
        for (String each:list) {

            if(each.startsWith("v")){
                break;
            }
            System.out.println(each);

        }


    }
}
