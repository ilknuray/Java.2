package recap_1;

import java.util.Scanner;

public class Soru_11 {
    public static void main(String[] args) {

        //kullaniciya ad,memleket,su anki konum,yas,boy soran bir program olusturun
        //ve yasadiklari yeri seviyorlarsa
        //bu bilgiyi yazdirin

        //next() only can read the first word
        //nextline() can read the whole line

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen giriniz = adinizi  " +
                "soy " +
                "isminizi " +
                "su anki konum" +
                "giriniz");
        String bilgiler= scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("lutfen boyunuzu giriniz");
        double boy= scan.nextDouble();

        System.out.println("bulundugunuz  konumu seviyor musunuz");
        boolean seviyorMu=scan.nextBoolean();

        System.out.println("seviyorMu = " + seviyorMu);
        System.out.println("boy = " + boy);
        System.out.println("yas = " + yas);
        System.out.println("bilgiler = " + bilgiler);
    }
}
