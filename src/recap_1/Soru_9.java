package recap_1;

import java.util.Scanner;

public class Soru_9 {
    public static void main(String[] args) {
        /*kullanicidan yas bilgilerini alarak
        oy kullanma yasi:
        age >=18 ise oy kullanmaya uygun
        age>=70 UC kez oy kullanabilir
        70>age>=50 iki kez oy kullanabilir
        50>age>=18 Bir kez oy kullanabilir
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas= sc.nextInt();

        if (yas>=18) {
            System.out.println("oy kullanabilir");
        }else if (yas>=70) {
            System.out.println("uc kez oy kullanabilir");
        }else if(yas>70&&yas>=50) {
            System.out.println("iki kez oy kullanabilir");
        }else if (yas>50&&yas>=18) {
            System.out.println("bir kez oy kullanabilr");
        }else{
            System.out.println("lutfen gecerli bir yas giriniz");


        }
    }
}
