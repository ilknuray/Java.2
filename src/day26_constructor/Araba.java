package day26_constructor;

public class Araba {


        /*
        farkli bir package dzki bir class dan obje olusturdugumuzda
         access modifier da dikkate almaliyiz
         */
        public String marka="marka belirtilmedi";
        public String model="model belirtilmedi";
        public int yil;
        public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;
    }
    public Araba(){

    }

    public void benzinliArac(){
            System.out.println("benzinli");
        }

       public void maxHiz(int hiz){System.out.println("max hiz");}
/*
biz herhangi bir constructor olusturdugumuzda java default
costructoru silerprojede sorun olmamasi icin default cons yerine
parametre siz olusturmaliz
 */
}
