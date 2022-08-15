package AlpSonmezSorulari;

import java.util.Scanner;

public class BosluksuzCumle {
    /*
    bir cümleyi nasıl boşluksuz bir şekilde yazabileceğimiz göstemerye çalışacağım.
'
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen string bir cumle olusturunuz");
        String cumle= scan.nextLine();

        cumle=cumle.replaceAll(" ","");
        System.out.println(cumle);
    }
}
