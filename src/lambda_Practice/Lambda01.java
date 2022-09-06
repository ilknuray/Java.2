package lambda_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    //ODEV::okul projesinde listele methonu lambda expression ile yapiniz.
    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create
     ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    static ArrayList<String>names=new ArrayList<>(Arrays.asList("Tulay","zekeriya","hasan","ismail","fatih","ersin","mevlit"));

    public static void aHarfiniSil(ArrayList<String>isimler){
        System.out.println(isimler.stream().//akisa alindi
                map(t -> t.toLowerCase()).//kucukharfe cevrildi
                filter(t -> !t.contains("a")).//a harfi olmayanlar filtrelendi
                collect(Collectors.toList()));//liste atildi
        //2.yol
        isimler.removeIf(t->t.contains("a")||t.contains("A"));
        System.out.println(names);

    }

}
