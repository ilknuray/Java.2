package day07IfStatements;

public class C01_AndOperatoru {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;
        System.out.println(a>0 && b<20 && c>=b);//true


        System.out.println(a<0 && b<20 && c>=b);//false,ilk false buldugunda sonucun false olacagini bilir ve
                                               // geriye kalan sartlari
                                                //incelemez.

        System.out.println(a<0 & b<20 & c>=b);//buda false ancak tek and oldugu icin yine de hepsini kontrol eder
                                              //ve && operatorune gore daha yavas calisir.ama hepsi
                                              //dogru ise ayni hizda calisir.




    }
}
