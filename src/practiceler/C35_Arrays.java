package practiceler;

import java.util.Arrays;

public class C35_Arrays {
    public static void main(String[] args) {
        String str="HeySiri";
        str=str.replace("Hey","Bye");
        System.out.println(str);

        String [] arr=new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));


    }
}
