package day31_TimeFormatterVarrags;

public class C03_VarragslaToplama {
    public static void main(String[] args) {

        //verilen kac int olursa olsun hepsini toplayip
        //sonucu yazdiran bir method olusturalim


        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
    }
    public static void toplaYazdir(int... sayi){
        /*
        int... sayi bu gosterim int variable lardan
         olisan bir varargs demektir
         varargs array alt yapisini kullanir

         */
        int top=0;
        int girilenSayiAdedi=sayi.length;
        for (int each:sayi
             ) {
            top+=each;
        }
        System.out.println("girilen"+ girilenSayiAdedi + " adet sayinin toplami : "+ top);









    }
}
