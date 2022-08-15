package recap_1;

import java.util.Scanner;

public class Soru_12 {
    public static void main(String[] args) {

        //kullanicidan y veya n girdiginde ekrana yes veya no yazdiran bir kod yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen y yada n giriniz");
        char harf=scan.next().charAt(0);

        if (harf=='n'|| harf=='N') {
            System.out.println("no");
        } else if (harf=='y' || harf=='Y') {
            System.out.println("yes");
        }else{
            System.out.println("yanlis giris yaptiniz lutfen sadece y veya n giriniz");
        }
    }
}
