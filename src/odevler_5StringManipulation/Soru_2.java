package odevler_5StringManipulation;

public class Soru_2 {
    public static void main(String[] args) {

        //KULLANICIDAN BIR CUMLE VE BIR KELIME ISTEYIN kelimenin cumledeki kullanimina bakarak
        //asagidaki uc cumleden uygun olani yazin

        // 1:girilen kelime cumlede kullanilmamis
        // 2:girilen kelime cumlede bir kere kullanilmis
        // 3:girilen kelime cumlede birden fazla kullanilmis

        String cumle="Cok calismam gerek Cok";
        String kelime="Cok";

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);


        if (kelimeIlkIndex==-1){
            System.out.println("girilen kelime cumlede kullanilmamis");

            }else if(kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("girilen kelime cumlede bir kere kullanilmis");
        }else{
            System.out.println("girilen kelime cumlede birden fazla kullanilmis");

            }
        }



        }


