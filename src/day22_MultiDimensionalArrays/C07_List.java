package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        /*
        array de [] kullanilir listte ise <> diamond kullanilir
         */
        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);

        //bir list e eleman eklemek icin *
        isimler.add("basak");
        System.out.println(isimler.add("ayse"));//true doner

        /*
        string de bir method calistirdigimizda assign yapmazsak
        string degismiyordu

        ****listin tek kotu tarafi array alt yapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir

         */



    }
}
