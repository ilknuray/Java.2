package day35_InheritanceConstructorKullanimi;

public class BParent extends AGrandParent{
    protected String isim="Parent isim belirtilmedi";
    protected  String parentKlup="Parent kulubu";



    BParent(){
        System.out.println("parent constructor calisti");
    }
}
