package day24_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_StringArray {
    public static void main(String[] args) {
        //iki string array olusturun ve bu arraylerdeki ortak elemanlari for each loop kullanarak bulunuz
        //sonucu ekrana yazdiriniz

        String[] arr1={"ali","veli","can","ayse"};
        String[]arr2={"ali","hasan","ayse","enes"};

        List<String>ortkIsim=new ArrayList<>();

        for (String each1:arr1
             ) {
            for (String each2:arr2
                 ) {
                if(each1.equalsIgnoreCase(each2)){
                    ortkIsim.add(each1);

                }
                }

            }
        if (ortkIsim.isEmpty()){
            System.out.println("hic ortak isim yok");
        }else{
            System.out.println("ortak isimler : " +ortkIsim);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
