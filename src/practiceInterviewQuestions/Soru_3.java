package practiceInterviewQuestions;

import day40_final.F;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_3 {
    /*
    Kullancidan alinan bir tamsayiya kadar fibonaccci dizisini olusturun


     */
    public static void main(String[] args) {
        List<Integer>fibonacciList=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);
        System.out.println("fibonacciList : " + fibonacciList);

        int i=1;

        if (sayi<=1){
            System.out.println("daha buyuk sayilar gir");
        }else{
            while (fibonacciList.get(i)<sayi){//fibonacci elemanlari sayidan kucuk oldugu muddetce
                fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i-1));
                i++;

            }
            System.out.println(fibonacciList);

        }



    }

}

