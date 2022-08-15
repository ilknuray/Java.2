package day40_final;

public class A {

      protected String isim="Cuneyt";
      final static String OKUL="Yildiz koleji";
      /*
      bir variable final olarak tanimlandiysa baska classlardan veya
      icinde bulundugumuz classtan bu variable a baska deger atanmasi
      mumkun degildir

      madem ki degeri degistirilemiyor genelde static yaparak
      bu variable a ulasim kolaylastirilabilir

      ve genelde static final olarak belirlenen
      variable isimleri buyuk harfle yazilir
       */

    final void finalMethod(){
        System.out.println("final methodlar override edilemez");

        /*
        bir methodu final olarak isaretlerseniz
        bu method degistirilmez demektir.uzerine yazilamaz degistirilemez


         */
    }
    }

