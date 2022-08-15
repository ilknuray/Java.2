package replitSorular;

public class Soru23 {
    public static void main(String[] args) {
        /*
        // isim1 çift sayıda karakter içeriyorsa,

    // ikinci kelimeyi ilk adın ortasına yerleştirin

    // ilk kelime tek sayida karakter iceriyorsa

    // “isim1, isim2 ye eklenemiyor” yazdırın

    // Örneğin:
    // isim1= mehmet
    // isim2= ahmet
    // Yazdır ==> mehahmetmet

    // isim1= memet
    // isim2= ahmet
    // Yazdır ==> isim1, isim2 ye eklenemiyor
         */
        String isim1="ilknur";
        String isim2="fatih";

        if(isim1.length()%2==0){
            System.out.println(isim1.substring(0,isim1.length()/2)+isim2+isim1.substring(isim1.length()/2));
        }else{

            System.out.println("isim 1 isim 2'ye eklenmiyor");
        }
    }
}
