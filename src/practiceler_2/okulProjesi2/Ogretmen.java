package practiceler_2.okulProjesi2;

public class Ogretmen extends Kisi{
    String bolum;
    String sicilNo;

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(){

    }

    public String getBolum() {
        return bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}'+super.toString();
    }
}
