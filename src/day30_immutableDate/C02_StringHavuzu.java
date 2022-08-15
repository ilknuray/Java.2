package day30_immutableDate;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali can";
        String str2=str1+"";
        String str3=new String("Ali can");
        String hiclik="";
        String str4=str1.concat(hiclik);

        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true

        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str3));//true

        System.out.println(str1.equals(str4));
        System.out.println(str1==str4);

        System.out.println(str2.equals(str4));//true
        System.out.println(str2==str4);//false

        String str5="Ali can";
        String str6=str1;

        System.out.println(str1.equals(str5));//true
        System.out.println(str5==str1);//true

        System.out.println(str1.equals(str6));//true
        System.out.println(str1 ==str6);//true

        /*
         1:yeni bir string olustururken esitligin saginda new keywordu olursa java direk
        yeni bir obje ve referans olusturur.

         2:eger esitligin saginda bir method calisiyor veya arti islemi
         yapiliyorsa string immutable oldugundan degisikligi kaydetmek uzere
         hemen bir kopya string ve referans olusturur
         sonra degeri hesaplayip bu yeni kopya objenin icine koyar.

         eger yeni string objesi olusturulurken new kullanilmaz veya esitligin
         saginda bir arti(+) islemi olmazsa java batar.

         eger daha once olusturulan string objelerden (string havuzu)
         birebir ayni string varsa o objeyi ve referansini kullanir,
         birebir aynisi yoksa yeni bir obje olusturur

         (==)hem degerleri hemde referanslari kontrol eder
         string ifadelerde == her zaman dogru sonuc vermemesini sebebi yeni obje
         olusturmasidir.
         */
        System.out.println(str5.equals(str6));//true
        System.out.println(str5==str6);//true




    }
}
