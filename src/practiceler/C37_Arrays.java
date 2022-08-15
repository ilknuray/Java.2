package practiceler;

import java.util.Scanner;

public class C37_Arrays {
    public static void main(String[] args) {
        int [] arr=new int[8];
        Scanner scan=new Scanner(System.in);
        int count=0;

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i +".indexteki sayiyi giriniz");
            arr[i]= scan.nextInt();
            System.out.println(arr[i]);

            if(arr[i]%3==0){

                count++;

            }


        }
        System.out.println("3'e bolunebilen sayi : " +count);

    }
}
