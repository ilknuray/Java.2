package day39_exceptions;

public class C04_ExceptionsTurleri {
    public static void main(String[] args) {

        String str;
        //System.out.println(str);deger atamasi yapmadan bir variable
        // kullanmaya calisirsaniz java compiletime da bunu farkeder
        // ve size izin vermez

        str=null;

       // System.out.println(str.length());NullPointerException rte

        Object obj="Java Java Java";
        Integer sayi=(Integer) obj;//ClassCastException

        /*
        java bazi casting islemlerine compile time da izin vermez

        ancak bazen syntax uygun olabilir bu durumda java kodun calismasina
        itiraz etmez
         */

    }
}
