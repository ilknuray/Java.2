package day33_Encapsulation;

public class Ogretmen {

    private String isim;
    private String soyisim;
    private String brans;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

        /*
        Bazen de yetkileri sinirlamak degilde yapilan isi daha
        iyi tanimlamak icin encapsulation kullanilir

        Bu yaklasimi kullanan classlarda tum variablelar privite
        yapilip hepsi icin getter ve setter olusturulur
         */
}

