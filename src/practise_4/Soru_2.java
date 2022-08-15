package practise_4;

public class Soru_2 {
    public static void main(String[] args) {
        //cm olarak verilen bir sayiyi metre ve km donusturen bir method yaziniz
        double input=400;
        donustur(input);
    }

    public static void donustur(double input) {

        double cMetre=0;
        double metre =input/100;
        double kMetre=input/100000;

        System.out.println(metre+"metre"+kMetre+"kilometre");




    }
}
