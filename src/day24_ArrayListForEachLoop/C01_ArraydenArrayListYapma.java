package day24_ArrayListForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapma {

    public static void main(String[] args) {

        String[]arr={"ismail","Nurullah","fatih"};
        /*
        uzun listeler olusturmamiz gerktiginde tek tek
        eklemek yerine array olusturup  bunlari liste cevirmek daha pratik olabilir
        1-loop ile array deki tum elementleri list e atabiliriz
        2-arrays.aslist() kullanabiliriz ancak bu methodun iki tane yan etkisi vardi
         -Arrays classi kullanildigi icin array ozellikleri gecerli olur
          dolayisiyla list te olan add remove gibi size i degistiren methodlar bu ssekilde olusturulan
          listlerde kullanilamaz
         -kaynak olan array ile urun olan list ozdeslesir.birinde yaîlan degisiklik
          otomatik olarak digerinede islenir
         */
        List<String>sinifList= Arrays.asList(arr);
        System.out.println(sinifList);//otomatik olusur[ismail, Nurullah, fatih]

       /* 1.yan etki
        sinifList.add("erdi");exeption verir
        siniflist.remove(1).yine hata verir
        */

        //2.yan etki
        arr[1]="emre";
        System.out.println("degisim sonrasi array : " +Arrays.toString(arr));
        System.out.println("arrayi degistirince list : " +sinifList);

        sinifList.set(0,"utku");
        System.out.println("listi degistirince list : " +sinifList);
        System.out.println("listi degistirince array : " +Arrays.toString(arr));


    }
}
