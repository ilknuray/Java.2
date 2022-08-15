package practiceler_2.restorant;

public class Musteri {
    public static void main(String[] args) {

        Mutfak menu=new Mutfak();
        System.out.print("menu = " + menu.toString());

        Mutfak siparisim=new Mutfak("adanakebab","mercimek","kunefe","salgam");
        System.out.println("siparisim : "+ siparisim);


    }

}
