package day35_InheritanceConstructorKullanimi;

public class Cchild extends BParent {
    String isim="Child isim belirtilmedi";
    protected  String ghildKlubu="Child klubu";
    Cchild(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {
        AGrandParent gp1=new AGrandParent();
        //bu objeyi olusturmak icin grandpa constructor calisir
        //parent veya child cons calismaz
        Cchild cchild1=new Cchild();
        cchild1.grandpaKulupAdi="Child";
        cchild1.parentKlup="Child2";
        //child 1objesi icin child cons calisir
    }
}
