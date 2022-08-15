package practiceler;

import java.util.Arrays;
import java.util.Scanner;

public class C46_Arrays {
    public static void main(String[] args) {
       // kullanicini girdigi bir arrayin en buyuk elemani ile en kucuk elemaninin
        // farkini bulan bir method create ediniz
        farkiniBul();


    }

    private static void farkiniBul() {
        Scanner scan=new Scanner(System.in);
        System.out.print("integer bir array olusturunuz : " );
        int uzunluk=scan.nextInt();

        int [] arr=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("arrayin " +(i+1) + ".elemanini giriniz : ");//i oldugunda 0;diyecegi icn index
                                                                            // degil eleman sorduk
            arr[i]=scan.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("arraydeki en buyuk eleman ve en kucuk eleman arasindaki fark : " +(arr[uzunluk-1]-arr[0]));
    }
}
