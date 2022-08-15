package replitSorular;

import java.util.ArrayList;
import java.util.List;

public class Soru_39 {
    /*
    Array i ARRAYLIST e çeviren Java Kodunu yazınız.

Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

Beklenen Çıktı:
[Python, JAVA, PHP, Perl, C#, C++]
     */
    public static void main(String[] args) {
        String[] str={"Python", "JAVA", "PHP", "Perl", "C#", "C++" };
        List<String> str1=new ArrayList<>();
        for(int i=0;i<str.length;i++){
            str1.add(str[i]);
        }
        System.out.println(str1);

    }
}
