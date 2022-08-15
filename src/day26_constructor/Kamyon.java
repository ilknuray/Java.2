package day26_constructor;

public class
Kamyon {

    public String marka = "marka belirtilmedi";
    public String model = "model belirtilmedi";
    public int yil;
    public int fiyat;


    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }


    @Override
    public String toString() {
        return
                "\nmarka='" + marka+
                "\nmodel='" + model +
                " \nyil=" + yil +
                " \nfiyat=" + fiyat ;

    }

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;

        /*
        bizim temel amacimiz kamyon runner argument olarak girilen degerin
        kamyon classinda intance variable a atanmasi ancak scope konusunda ogrendigimiz gibi
        kamyon consructar scopenda marka oldugu icin instance markaya gitmiyor


        bu karisikligi gidermek icin instance variablelari belirli hale getirmeliyiz
        java bunun icin this keyword u olusturmustur

        genel kullanim acisindan this keywordu kodu herkesin
        alamasini kolaylastirdigi icin tercih edilir
         */

    }
    public Kamyon(){

}

    }

