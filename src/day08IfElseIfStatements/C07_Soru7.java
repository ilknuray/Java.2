package day08IfElseIfStatements;

import java.util.Scanner;

public class C07_Soru7 {
    public static void main(String[] args) {
        /*kullanicidan artik yil olup olmadigini  test etmek icin yil girmesini isteyiniz
        1:dort ile bolunemeyen yillar artik yil degildir
        2:dort ile bolunup 100 ile bolunemeyen yillar artik yildir
        3:4un kati olmasini ragmen 100 ile bolunebilen yillardan sadece 400 un kati olanlar artik yildir
         */

    Scanner scan=new Scanner(System.in);
    System.out.println("Lutfen bir yil giriniz");
    int yil= scan.nextInt();

    if(yil%4!=0){
        System.out.println("artik yil degil");
    }
    else if(yil%100!=0){
        System.out.println("artik yil");

    }
    else if(yil%400!=0) {
        System.out.println("artik yil degil");
    }
    else{
        System.out.println("artik yil");
    }
}}
