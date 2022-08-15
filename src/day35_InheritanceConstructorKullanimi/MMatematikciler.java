package day35_InheritanceConstructorKullanimi;

public class MMatematikciler extends LOgretmen {
    MMatematikciler(){
        System.out.println("matematik parametresiz constructor");
    }
    MMatematikciler(String isim){
        this();
        System.out.println("Matematik parapetreli constructror");
    }

    public static void main(String[] args) {
        MMatematikciler obj1=new MMatematikciler("Tugba");
    }

}
