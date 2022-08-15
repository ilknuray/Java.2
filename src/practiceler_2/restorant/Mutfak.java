package practiceler_2.restorant;

public class Mutfak {
    public String yemekler = "adanakebab,urfaciger,kusbasi,kusleme";
    public String araSicak = "yaylacorba,mercimek,duguncorba,corba";
    public String tatlilar = "baklava,sutlac,gullac,kazandibi,kunefe";
    public String icecekler = "ayran,salgam,kola";

    public Mutfak(String adana_kebab, String mercimek, String kunefe, String salgam) {
        this.yemekler=adana_kebab;
        this.araSicak=mercimek;
        this.tatlilar=kunefe;
        this.icecekler=salgam;
    }

    public Mutfak() {
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "yemekler='" + yemekler + '\'' +
                ", \naraSicak='" + araSicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }
}
