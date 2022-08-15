package day25_constractor;

public class Car {
    /*
    bu class bizim kaliphanemizdir
    bir araba olusturmak icin ihtiyacimiz olan variable ve methodlari bu classlarda belirleriz
    sonra farkli class larda araba olusturmamiz gerekirse bu classtan bir obje olusturup
    burada belirlenen variable ve methodlara gore araba uretiriz
     */
    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public void benzinliArac() {
        System.out.println("bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("bu araba max hiza sahiptir");
    }
}
