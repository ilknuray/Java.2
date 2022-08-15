package day13_MethodCreation;

public class C01_MethidCreation {


    public static void main(String[] args) {

       //input olarak verilen iki integer i toplayip sonucunu yazdiran bir method olusturun

        int input1=10;
        int input2=20;
        //method dort adimda olusturulur
       // 1.adim method call
        //2.adim argument eklenmesi gerekiyorsz ekleyelim
        //eger methodun return type void ten farkli olacaksa
        //bir variable olusturup method call u assign edelim

        topla(input1,input2);




    }

    public static void topla(int input1, int input2) {
        //3.adim method decleration da degismesi gereken yerleri degistir
        //4.eger return type void disinda bir seyse return keyword u
        //ve donecek degeri hesaplamaliyiz
        System.out.println("girilen iki sayinin toplami : " +(input1+input2));

    }


    }

