package day11_StringManipulation;

public class
C02_lastIndexOf {
    public static void main(String[] args) {
        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";


        //verilen kelime cumlede kullanilmamis
        //verilen kelime bir kere kullanilmis
        //birden fazla kullanilmis

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeLastIndex=cumle.lastIndexOf(kelime);


        if (kelimeIlkIndex==-1) {
            System.out.println("kelime cumlede yok");
        }else if (kelimeIlkIndex==kelimeLastIndex) {
            System.out.println("cumlede sadece bir kere kullanilmis");
        } else{
            System.out.println("cumlede birden fazla kullanilmis");


        }



    }
}
