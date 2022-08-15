package practiceler_2;

import java.util.Scanner;

public class UzunKelime {
    public static void main(String[] args) {
        /*
        kullanicidan gelen cumleyi parametre olarak alan ve
        ve cumledeki en uzun kelimeyi return eden methodu create ediniz
        Trick:ayni uzunlukta iki veya daha fazla kelime varsa
        stringdeki en uzun ilk sozcuk return edilsin
        noktalama isaretlerini dikkate almayin ve
        cumlenin bos olmayacagini varsayin

         */
        Scanner scsan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = scsan.nextLine();

        System.out.println("enUzunKelime(cumle) = " + enUzunKelime(cumle));
        //ben bugun javayi daha cok sevdim ama cok zorlandi

    }

    public static String enUzunKelime(String cumle) {//en uzun kelime
        String arr[]=cumle.split("");//her harften boler
        int max=0;
        String enUzun="";
        for (int i = 0; i<arr.length; i++) {
            if(arr[i].length()>max){
                max=arr[i].length();//ilk calistiginda 3
                enUzun=arr[i];
            }

        }







        return enUzun;
    }

}
