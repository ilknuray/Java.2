package recap_1;

import java.util.Scanner;

public class Soru_13 {
    public static void main(String[] args) {
        //not hesapalayici
        //A 90/100
        //B 80/89
        //C 70/79
        //D60/69
        //F 0/59

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        int not = scan.nextInt();

        if (90 >= not && not <= 100) {
            System.out.println("A");
        } else if (not >= 80 && not <= 89) {
            System.out.println("B");
        } else if (not > 70 && not <= 79) {
            System.out.println("C");
        } else if (not > 60 && not <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");


        }
    }
}
