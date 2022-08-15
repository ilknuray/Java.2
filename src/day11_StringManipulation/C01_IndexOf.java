package day11_StringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";
        /*verilen bir string de herhangi bir string veya charin ilk kullanildigi index i bize
        dondurur.
         */
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("r")); //7
        System.out.println(str.indexOf("j")); //-1
        System.out.println(str.indexOf("mek")); //10 verir cunku bunu bir harf olarak alir m nin indexini verir

        //  eger istedigimiz index ten sonrasini kontrol etmek istersek
        //o zaman ayni methodu iki parametreli olarak kullanabiliriz

        System.out.println(str.indexOf("g",6+1   ));     //yazilan index ten baslar

        //yukaridaki str da 2. veya 3. e nin indexxlerini bulunuz

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);

        //egr 2. e varsa 3.e nin olup olmadigini ve varsa index ini yazdiralm

        if(ikincie==-1) {
            System.out.println("ikinci e yok");
        }else{
            int ucuncue=str.indexOf("e",ikincie+1);

            if(ucuncue==-1) {
                System.out.println("ucuncu e yok");
            }else {
                System.out.println("ucuncu enin indeksi : " + ucuncue);

            }
        }

    }
}
