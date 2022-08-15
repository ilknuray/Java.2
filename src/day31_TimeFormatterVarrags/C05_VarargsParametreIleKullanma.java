package day31_TimeFormatterVarrags;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

            enUzunKelimeyiYazdir(5,"Ali","Ayse","Fatih","ilknur");

            /*
            varargs teorik olarak sonsuz sayida element alabilir
            bir methodda parametre olarak en sonda olmali
            varargs in sinirini bilmesi icin parametrelerin
            sonuncusu olabilir oncesinde farkli parametreler olabilir
            ancak varargs dan sonra parametre olamaz
            bu kuraldan oturu bir method da sadece bir tane varargs
            olabilir
             */
        }

        public static void enUzunKelimeyiYazdir(int kelimeSayisi, String...kelime) {

            String enUzunKelime=kelime[0];

            for (String each:kelime
            ) {
                if(each.length()>enUzunKelime.length()) {


                    enUzunKelime = each;
                }
            }
            System.out.println("girilen kelimelerin en uzunu : " + enUzunKelime);
        }


    }

