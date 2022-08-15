package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 ozellikler : "+ kamyon1.toString() );

        Kamyon kamyon2=new Kamyon("mercedes","4140",2005,500000);
        System.out.println("kamyon 2 bilgileri : "+kamyon2.toString());

        //to string demesek bile ozelliginden dolayi yazdirir
        // cunku diger tarafa atama yaptim yani kalip sayfaya

        Kamyon kamyon3=new Kamyon("scania","s540");
        System.out.println("kamyon 3bilgileri : "+kamyon3.toString());





    }
}
