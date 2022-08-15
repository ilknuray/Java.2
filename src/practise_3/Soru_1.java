package practise_3;

public class Soru_1 {
    public static void main(String[] args) {




        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         */
        String kelime1="cesaret";
        String kelime2="insana";
        String kelime3="sinirlarini";
        String kelime4="ogretir";

        kelime1=kelime1.replace("c","C");

        System.out.println(kelime1+" " +kelime2 +" "+kelime3 +" " +kelime4 + ".");


        System.out.println(kelime1.substring(0,1).toUpperCase()+kelime1.substring(1)+
        " " + kelime2 + " " + kelime3 + " "+ kelime4 +".");







    }}