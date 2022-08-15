package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
         /*
  Soru 6) Interview Question: Kullanicidan 100’den kucuk bir tamsayi isteyin.
  1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
- Sayi 3’un kati ise sayi yerine "Java" yazdirin.
- Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
- Sayi hem 3’un hem 5’in kati ise sayi yerine "Java Guzeldir" yazdirin.

   */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir pozitf tamsayi giriniz");
        int sayi = sc.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("java guzeldir" + "\n ");
            } else if (i % 5 == 0) {
                System.out.print("guzeldir" + " ");
            } else if (i % 3 == 0) {
                System.out.print("java" + " ");
            } else {
                System.out.print(i + " ");
            }
        }

    }
}
