package AlpSonmezSorulari;

import java.util.Scanner;

public class TekrarEdenHarf {
    //Java bir kelime içindeki harflerin kaç defa tekrar ettiğini bulacağız.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen string bir ifade giriniz");
        String str= sc.nextLine();
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }

            System.out.println(count);
        }
    }

}
