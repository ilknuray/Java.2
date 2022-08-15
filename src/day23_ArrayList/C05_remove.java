package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1);

        sayilar1.remove(1);

        //sayilardan olusan bir list varsa java remove methoduna sayi yazdigimizda direk index olark kabul eder
        System.out.println(sayilar1);

        //illa 5 i silsin

        Integer sil=5;
        sayilar1.remove(sil);
        System.out.println(sayilar1);

        //veya

        sayilar1.remove(sayilar1.indexOf(2));//2yi silmek icin once indexini bulup remove icine yazdirirm
        System.out.println(sayilar1);

    }
}
