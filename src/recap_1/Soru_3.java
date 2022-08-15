package recap_1;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        /*kullanicidan kilosunu ve boyunu alip vucut kitle endeksini hesaplayan bir program yaziniz
        ipucu:vucut
        kitle endeksi(VKI)=vucut agirligi(kg)/boy uzunlugunun karesi(m)

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("kilo (kg)");
        double kilo= scan.nextDouble();
        System.out.println("boy (cm)");
        double boy= scan.nextDouble();
        boy/=100;
        

        System.out.println("VKI = " + kilo/(boy*boy) + "kg/m");
    }
}
