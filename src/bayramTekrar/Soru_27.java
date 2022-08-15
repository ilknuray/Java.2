package bayramTekrar;

public class Soru_27 {
    public static void main(String[] args) {
       // 1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       şeklini konsola yazdiriniz.

        int input=6;
        for (int i = input; i >=1 ; i--) {
            for (int j =1; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");

        }

    }
}
