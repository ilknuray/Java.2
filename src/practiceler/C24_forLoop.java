package practiceler;

public class C24_forLoop {
    public static void main(String[] args) {
        //0 255 arasi harflerin sayi ve harf degerleri yaziniz

       // for (int i = 0; i <=255 ; i++) {
       //     char karakter=(char) i;//data casting
         //   System.out.println(i + " -->"+ karakter);

       // }
        System.out.println("while ile");
        int i=0;


        while(i<=255){
            char sembol= (char) i;
            System.out.println(i+" - "+ sembol);
            i++;
        }

        System.out.println("do while ile");
        int a=0;
        do{
            char karak=(char) a;
            System.out.println(a+" - "+karak);
            a++;

        }while (a<=255);

    }
}
