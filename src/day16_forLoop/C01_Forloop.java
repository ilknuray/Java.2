package day16_forLoop;

public class C01_Forloop {
    public static void main(String[] args) {

        // verilen bir pozitif tam sayinin
        //tam bolenlerini yazdiralim

        int input=20;
        int sayac=0;

        for(int i =1; i<=input ; i++){

            if(input%i==0){
                sayac++;
                System.out.print(i + " " +sayac);
            }
        }



    }
}
