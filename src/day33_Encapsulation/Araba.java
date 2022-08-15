package day33_Encapsulation;

public class Araba {
    String marka="Marka belirtilmedi";//markanin access modifier i default access modifier
                                       //oldugundan package icinde kullanilabilir
    private String model="Model belirtilmedi";
    private String yakit="Elektrikli";//tum arabalar elektrikli ise bu variablin degistirilmemesi lazim
    //privite yaptigimiz model ve yakit variblelarina erisimi yetkilendirelim
    //modele deger atanabilsin ama gorulmesin(setter)
    //yakit ise gorulebilsin ama deger atanamasin(getter)

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }

}
