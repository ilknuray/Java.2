package day24_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {
        int[]arr={2,6,2,3,6,8,9,1};
        List<Integer>liste=new ArrayList<>();

        //arraydeki tek sayilari liste atayalim

        for (int each:arr//gelecek data tipi loop icinde ne isim verdigim ve nerden aldigim
             ) {
            if(each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}
