package day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {
        String str="123a5";

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sadece rakamlardan olusmalidir");
        }
        catch (Exception e){
            System.out.println("ongorulemeyen bir hata olustu");
        }

        System.out.println("sayinin karesi : " + sayi*sayi);




        /*
        kullanicidan string olarak bir deger aliyor ve bunu integer a
        ceviriyorsak NumberFormatException ile karsilasabilecegimizi
        ongoruruz.NFE aldigimizda kodun durmamasini istiyorsak try catch ile
        cevreleyebiliriz

        eger bilmedigim bir exception dazha olusursa ve kodum durmasin istiyorsak
        bir kere daha catch cumlasi ekleyip ona en genis exception i ekleyebiliriz

         */

    }
}
