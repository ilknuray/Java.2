package day08IfElseIfStatements;

import java.util.Scanner;

public class C03_Soru_3 {
    public static void main(String[] args) {

        //kullanicidan 100 uzerinden notunu isteyin.notu harf sistemine cevirip yazdirin
        //50'den kucukse "D",50-60 arasi "C",60-80 arasi "B",80'in uzerinde ise "A" yazdirin
        //gecersiz not girirse gecerli not giriniz deyin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen0 dan 100 e kadar bir not giriniz");
        double note= scan.nextDouble();

        if (note<50){
            System.out.println("D");
        }
        else if (note<60){
            System.out.println("C");
        }
        else if (note<80){
            System.out.println("B");
        }
        else if (note>80){
            System.out.println("A");
        }
        else{
            System.out.println("Lutfen gecerli bir not giriniz");
        }

    }
}
