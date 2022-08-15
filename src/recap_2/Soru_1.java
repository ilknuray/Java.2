package recap_2;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {
        /*gunleri goeterebilen bir program yaziniz
        gun pzt veya sali ise java dersi gunleri

        gun per veya cuma ise
        selenyum dersi gunleri

        gun car veya cumartesi ise sql dersi gunleri

        aksi halde:izin gunu
        (if kullanmayin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi = scan.next();

        switch (gunIsmi) {
            case "pazartesi":
            case "sali":
                System.out.println("java dersi gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("selenyum dersi gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("sql dersi gunleri");
                break;
            default:
                System.out.println("izin gunu");
        }
    }
}
