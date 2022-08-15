package bayramTekrar;

public class Soru_28 {
    public static void main(String[] args) {
            /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */
        String str="a,b,c,d,e,f";
        for (int i = 'a'; i <='f' ; i++) {
            for (int j = 'b' ;j <=i ; j++) {


                System.out.print(i + j);
            }
        }
        System.out.println("");
    }
}
