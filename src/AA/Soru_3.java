package AA;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().toUpperCase().charAt(0);

        if(harf>'A'&&harf<'Z'){
            System.out.println("dogru giris yaptiniz");
        }else{
            System.out.println("Hatali giris yaptiniz");
        }
    }
}
