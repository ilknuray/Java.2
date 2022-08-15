package practiceler;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class C12_StringManipulation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dort adet kelime giriniz \naralarda entere basiniz");

        String kelime1= scan.nextLine();
        String kelime2= scan.nextLine();
        String kelime3= scan.nextLine();
        String kelime4= scan.nextLine();

        String cumle="";
        kelime1=kelime1.substring(0,1).toUpperCase()+kelime1.substring(1);
        cumle=cumle.concat(kelime1+" ").concat(kelime2+" ").concat(kelime3+" ").concat(kelime4+" ").replace(".","");
        System.out.println(cumle);

    }

}
