package recap_2;

public class Soru_7 {
    public static void main(String[] args) {
        /* string seklinde verilen asagidaki fiyatlarin toplamini bulunuz
        string str1=$13.99
        String str2=$10.55
        ipucu:double pars double methodunu kullanabilirsiniz

         */
        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");
        double sayi1=Double.parseDouble(str1);
        double sayi2=Double.parseDouble(str2);


        System.out.println(" iki sayinin toplami : "+ (sayi1+sayi2)/100 + " $ ");



    }
}
