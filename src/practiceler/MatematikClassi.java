package practiceler;

public class MatematikClassi {
    public static void main(String[] args) {
        int sayi1=-12;
        int sayi2=5;

        System.out.println("sayi 1in mutlak degeri : "+ Math.abs(sayi1));
        System.out.println("buyuk olani bulma : "+ Math.max(sayi1,sayi2));
        System.out.println(" 2, 6, 8 den buyuk olani bulma : "+ Math.max(2,Math.max(6,8)));
        System.out.println("kucuk olani bulma : "+Math.min(sayi1,sayi2));
        System.out.println("karekok : "+Math.sqrt(sayi1));
        System.out.println("2 nin 3. kuvveti : "+Math.pow(2,3));
        System.out.println("round 3.1 i yuvarla : "+Math.round(3.1));
        System.out.println("ust tamsayiya yuvarlma : "+Math.ceil(3.1));
        System.out.println("alt tamsayiya yuvarlama : "+Math.floor(3.1));

        //math.random double algilar ve 0 ile 1 arasunda sayi uretir

        int sayi=(int)(Math.random()*100);
    }
}
