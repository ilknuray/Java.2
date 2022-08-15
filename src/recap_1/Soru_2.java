package recap_1;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
        //mesafeyi ve hizi alip sureyi hesaplayan bir kod tanimi yaziniz
        //ornegin istanbul ankara arasi 400km dir bu yolu ort 120km/sa
        //hizla giden bir arac ne kadar surede hedefe varir

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen mesafeyi km giriniz");
        double mesafe = scan.nextDouble();
        System.out.println("lutfen hizi giriniz");
        double hiz = scan.nextDouble();

        System.out.println("gecen sure : " + mesafe / hiz + " " + "saat");

    }
}
