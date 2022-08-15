package recap_1;

public class Soru_10 {
    public static void main(String[] args) {
        /*final notu tanimlayin,nested ternary ile cozunuz
        'A' "gayet basarili"
        'B' "basarili"
        'C' "ha gayret"
        bu notlar disindakilere de digerleri yazdiriniz
         */

        char finalNotu='B';
        String sonuc=(finalNotu=='A' ) ?("gayet basarili") : (finalNotu=='B') ? "basarili" : (finalNotu=='C') ? "ha gayret" : "digerleri";
        System.out.println(sonuc);
    }
}
