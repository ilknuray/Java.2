package ocaSorulari;

public class Soru_1postIncrement {
    public static void main(String[] args) {

        int num1=9;
        int num2=num1++;

        System.out.println("num2 = " + num2);//num2 9 olur cunku post increment once atama yapar sonra degeri artirir
         //int num2=++num1 deseydim num2=10 olurdu cunku pre increment once artirir sonra deger atar

        if (num2 < 10) {
            System.out.println(num2 + "Hello world");
        }else{
            System.out.println(num1 + "Hello Universal");
        }

    }
}
