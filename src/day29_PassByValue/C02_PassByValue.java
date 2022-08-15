package day29_PassByValue;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        veilen dort elemanli bir arrayi metoda gonderelim metod yeni uc elemanli bir
        array oluturup bu yeni arraye rastgele 100 den kucuk degerler atayalim
        methodta arrayi yazdiralim
        main methodta method call dan sonra yeniden methodu yazdiralim
         */
        int []arr={3,5,8,10};

        arrayDegistir(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayDegistir(int[] arr) {
        arr=new  int[3];
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);
        System.out.println(Arrays.toString(arr));

        /*
        birden fazla element iceren array ve array list gibi yapilarda da passby value gecerlidir

        egr method ta array veya listin kendisi degistirilirse passbyValue ozelligi
        nedeniyle java degisen degeri degil
        array veya list in orjinal degerini alir

        Ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse java obje degismedigi icin
        (referans ayni)ayni array veya listi bize dondururancak icindeki elementler degismis olacaktir


         */
    }
}
