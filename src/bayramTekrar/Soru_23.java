package bayramTekrar;

import java.util.Scanner;

public class Soru_23 {
    public static void main(String[] args) {
        // Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        // 1. 0()dahil ile 50 arasi - D   2. 50(dahil) ile 60 arası - C
        // 3. 60(dahil) ile 80 arası - B  4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.

        // switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
        // switch() de int, byte, short, char, String kullanilir.

        Scanner scan=new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not= scan.nextInt();




        switch (not){
            case 1 :
                System.out.println("lutfen notunuzu giriniz" );
                not= scan.nextInt();
                if (not>=0 || not<50){
                    System.out.println("Notunuz:D");
                }
             break;

            case 2 :
                System.out.println("Lutfen notunuzu giriniz");
                not= scan.nextInt();
                if (not>=50 || not<60){
                    System.out.println("Notunuz:C");
                }
                break;
            case 3:
                System.out.println("Lutfen nounuzu giriniz");
                not= scan.nextInt();
                if (not>=60 || not<79){
                    System.out.println("Notunuz:B");
                }
                break;
            case 4:
                System.out.println("Lutfen notunuzu giriniz");
                not= scan.nextInt();
                if (not>=80 || not<=100){
                    System.out.println("Notunuz:A");
                }
                break;

            default:
                System.out.println("gecerli not giriniz");

        }
    }
}
