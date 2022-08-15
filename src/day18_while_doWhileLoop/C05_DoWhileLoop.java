package day18_while_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        //9 dan 190a kadar 7nin kati olan tum sayilarinalinnn

        int bas=9;
        int bitis=190;

        int temp=bas;


                //while loop ile
        while (temp<bitis){
            if(temp%7==0){
                System.out.println( temp +" ");
            }
            temp++;

        }
        //do while
        System.out.println();
        temp=bas;
        do {
            if (temp % 7 == 0) {
                System.out.println(temp + " ");
            }
            temp++;
        }while (temp<bitis);

    }
}
