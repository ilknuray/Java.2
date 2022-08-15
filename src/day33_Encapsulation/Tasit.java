package day33_Encapsulation;

public class Tasit {
   private String tasiTuru;
   private boolean muayenesiVarMi;
   private int yil;

    public String getTasiTuru() {
        return tasiTuru;//tek satirlik islemi var privite olan tasit turune baska classtan ulasamayacagim icin
        //bu method bu classtaki privite lara ulasabilir  ;   tasit turune ulasip onu aliyor
        //bana donduruyor.istenen farkli classlara return ediyor
    }

    public void setTasiTuru(String tasiTuru) {//set mettotlarinda sadece bir satir var
        //return olmadigi icin sadece atama yapiyor amayazdirma yok
        this.tasiTuru = tasiTuru;
    }

    public boolean isMuayenesiVarMi() {//getter yazdirma yapacagi icin true false donmesi adina
        //basina is ekliyor isVariable ismi seklinde olur
        return muayenesiVarMi;
    }

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
