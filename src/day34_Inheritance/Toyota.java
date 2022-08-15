package day34_Inheritance;

public class Toyota {
    protected String marka="toyota";
    protected String model="Model belirtilmedi";
    protected String yakit="Yakit belirtilmedi";

    protected void motor(){
        System.out.println("toyota cevrecidir");
    }
    protected void aku(){
        System.out.println("toyota modelleri farkli akuler kullanir");
    }
}
