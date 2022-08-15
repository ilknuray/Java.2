package day31_TimeFormatterVarrags;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdir("Ali","Ayse","Fatih");
    }

    public static void enUzunKelimeyiYazdir(String...kelime) {

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
