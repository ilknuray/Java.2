package practise_4;

public class Soru_1 {
    public static void main(String[] args) {
        /*
        problem tanimi:
        bir string icindeki tum karakterleri en fazla birkez yazdiran parametreli bir method yaziniz
        input:aabbccccddddaaa
        output:abcd
         */
        String str="aabbcccddddaaa";
        tekrarYok(str);




    }

    public static void tekrarYok(String str) {

        String cumle="";//degeri hiclik oldugu icin isleme etki etmesin diye bu sekilde atama yaptik

        for (int i = 0; i <str.length() ; i++) {
            if(!cumle.contains(str.substring(i,i+1))){//tekrarsiz karakterleri dondurecegimiz icin sonucumuz
                                                      //str dan gelecek bir karakteri icermesin
                cumle+=str.substring(i,i+1);



            }

        }
        System.out.println(cumle);

        }
    }

