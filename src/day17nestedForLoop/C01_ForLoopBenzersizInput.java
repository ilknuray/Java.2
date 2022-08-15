package day17nestedForLoop;

public class C01_ForLoopBenzersizInput {
    public static void main(String[] args) {
        //verilen bir stringdeki kullanilan harfleri
        //tekrarsiz olarak yazdirip
        //kelimede kullanilan farkli harf sayisini veren bir method yaziniz



        String str="Java her zaman guzel";
                harfSayisiBul(str);

    }

    public static void harfSayisiBul(String str) {
        String benzersizInput="";
        String islenecekKelime=str.replaceAll("\\W","");//Javaherzamanguzel
        System.out.print(str.substring(0,1));//J
        benzersizInput+=str.substring(0,1);//J

        for (int i = 0; i <islenecekKelime.length() ; i++) {
           if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
               System.out.print(" , " +islenecekKelime.substring(i,i+1));
               benzersizInput+=islenecekKelime.substring(i,i+1);
           }


        }
        System.out.println("");
        System.out.println("str : " +str);
        System.out.println("benzersiz input : " +benzersizInput);

    }
}
