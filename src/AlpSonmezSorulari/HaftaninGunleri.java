package AlpSonmezSorulari;

import java.util.Arrays;

public class HaftaninGunleri {
    /*
dizi örneği ekleyelim. Bu örnekte haftanın günlerini dizilerde kullancağız.*/
    public static void main(String[] args) {
        String [] gunler=new String[7];
        gunler[0]="pazartesi";
        gunler[1]="sali";
        gunler[2]="carsamba";
        gunler[3]="persembe";
        gunler[4]="cuma";
        gunler[5]="cumartesi";
        gunler[6]="pazar";
        System.out.println(Arrays.toString(gunler));
        System.out.println(gunler[4]);
    }

}
