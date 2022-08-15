package practiceler_2;

import java.util.Arrays;
import java.util.Scanner;

public class interviewQuestions {
    /*
    kullanicidan bir string aliniz
    stringde var olan her karakterin sayisini ekrana yazdiriniz
    or:hallolur yaaa
    a=>4 l=>3 gibi
     */
    /*
    oncelikle split medodu kullan
    sort yap
    forloop
    if
    sout
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen string bir ifade giriniz");
        String str= scan.nextLine();

        String [] arr=str.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int karakterSayisi=0;

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i-1].equals(arr[i])){
                karakterSayisi++;
            }else{
                System.out.println(arr[i-1]+ " karakteri " + (karakterSayisi+1));
                karakterSayisi=0;
            }if(i==arr.length-1){//forloopta en sona geldiginde
                System.out.println(arr[i]+ " karakteri " + (karakterSayisi+1));

            }

        }


    }

}
