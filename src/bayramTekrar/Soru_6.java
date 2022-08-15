package bayramTekrar;

public class Soru_6 {
    public static void main(String[] args) {
   //     RegexKarakterler
//d ifadesi tum rakamlari(digit) temsil eder.
/*D rakamlardisindaki hersey
\\S space disindaki hersey
\\s space ifadesidir.
\\w ifadesi (word->kelime ve hadf) a-z A-Z 0-9 _  bunlari kapsar
\\W ifadesi a-z A-Z 0-9 _ disindakileri kapsar
    /*
       yukarıdaki operatörleri String b = "Java 1235 ?!@$_";  ifadesinde çalışalım
 */
        String  b = "Java 1235 ?!@$_";
        b=b.replaceAll("\\W","");
        b=b.replaceAll("\\d","");
        b=b.replaceAll("_","");
        System.out.println(b);
    }
}
