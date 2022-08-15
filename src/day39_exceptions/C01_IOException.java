package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        java dan bilgisayarimizdaki bir dosyaya erismek
        istiyorsak fileInputStream Claasindan yardim aliriz
        ayni sekilde javadan bilgisayarimizdaki bir dosyaya
        ekleme veya update yapmak istersek FileInputStream
        classindan yardim aliriz
         */
        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");
        /*
        goruldugu gibi ct de altini kirmizi cizen her durum cterror degildir
        java da bazi exception larda ctexception dir
        ozellikle dosya okuma ve yazma ile ilgili exceptionlar ctexceptiondir


        Ctexception olustugunda java cozum icin iki ihtimal onerir
        1-try catch ile cevrelemek
        2-method signaturune throws keyword ile beklenen exception
        turunu yazmak

        throws exception sadece olayin farkinda oldugumuzun deklarasyonudur
        exception in handle edilmesinde hic bir rolu yoktur
        yani try catch ile handle(kontrol altina aldigimiz)
        exceptionlarda kod calismaya devam ediyordu
        Ancak throws exceptions yazdigimizda java bir exceptionla
        karsilasirsa hic birsey yapmamisiz gibi hata mesaji yayinlayip
        calismayi durdurur
         */
    }
}
