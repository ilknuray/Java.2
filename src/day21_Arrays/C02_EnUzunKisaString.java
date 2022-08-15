package day21_Arrays;

public class C02_EnUzunKisaString {
    public static void main(String[] args) {

        //verilen String bir arrayde en uzun ve en kisa Stringleri yazdiran bir method olusturun
        String []str={"erdal","onur","hayrullah","mihrican"};
        enUzunVeEnKisayiYazdir(str);
    }

    public static void enUzunVeEnKisayiYazdir(String[] str) {
        
        String enUzunKelime=str[0];
        String enKisaKelime=str[0];

        for (int i = 1 ;i <str.length ; i++) {
            if (str[i].length()>enUzunKelime.length()){
                enUzunKelime=str[i];
            }
            if(str[i].length()<enKisaKelime.length()){
                enKisaKelime=str[i];
            }
        }
        System.out.println("en uzun kelime : " +enUzunKelime);
        System.out.println("en kisa kelime : " +enKisaKelime);
    }
}
