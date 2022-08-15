package practiceler_2.OkulProjesi;

public class OgretmenBilgileri {
    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;

    public OgretmenBilgileri() {

    }


    @Override
    public String toString() {
        return "OgretmenBilgileri" + "\nisim : " + isim
                + "\nsoyisim : " + soyisim
                + "\nyas : " +
                yas +
                "\nbrans : " + brans + "\ntelNo : " +
                tel
                ;
    }

    public OgretmenBilgileri(String isim, String soyisim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;


    }
}
