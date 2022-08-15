package day35_InheritanceConstructorKullanimi;

public class KDizelCorolla extends HCorolla{
    KDizelCorolla(){
        System.out.println("parametresiz");
    }
    KDizelCorolla(String isim){
        super(isim);
        System.out.println("Kdizel parametreli constructor");
    }

    public static void main(String[] args) {
        KDizelCorolla obj1=new KDizelCorolla();
    }
}
