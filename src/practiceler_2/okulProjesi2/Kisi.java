package practiceler_2.okulProjesi2;

public class Kisi {
    //ortak ozellikler

   private String adSoyad;
   private String kimlikNo;
   private int yas;


    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }
    public Kisi(){

    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setYas(int yas) {//yas kontrolu yapiniz
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
