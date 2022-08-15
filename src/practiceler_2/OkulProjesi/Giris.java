package practiceler_2.OkulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        System.out.println("*****Okulumuza Hosgeldiniz*****");

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Lutfen bransinizi giriniz");
        String brans = scan.nextLine();
        scan.nextLine();



        System.out.println("Lutfen telefon numaranizi giriniz");
        String telNo = scan.next();

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyisim, yas, brans, telNo);

        List<OgretmenBilgileri> ogretmenList = new ArrayList<>();

        ogretmenList.add(adayOgretmen);
        System.out.println("ogretmenList = " + ogretmenList);


    }
}