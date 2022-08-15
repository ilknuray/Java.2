package kodBloklari;

import java.util.Scanner;

public class AsalMi {
    //Bu örnekte kullanıcı tarafından girilen sayının asal sayı olup olmadığını metot kullanarak
    // bulacağız ve ekrana yazdıracağız.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen  sayi giriniz");
        int sayi1= sc.nextInt();
       asalMi(sayi1);

    }

    public static void asalMi(int sayi1) {

        int count=0;
        for (int i = 2; i <sayi1 ; i++) {
            if(sayi1%i==0) {
                count++;
            }
            }if(count==0){
                System.out.println(sayi1);
            }else {
            System.out.println("asal sayi degildir");

            }

        }
    }
