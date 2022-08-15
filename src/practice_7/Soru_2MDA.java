package practice_7;

public class Soru_2MDA {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,},{2,8},{5,7,9,14}};
        ciftleriTopla(arr);

        System.out.println(ciftleriTopla(arr));


    }

    public static int ciftleriTopla(int[][] arr) {
        int toplam=0;
        for (int[] each1:arr) {

            for (int each2 : each1) {

                if (each2 % 2 == 0) {
                    toplam += each2;

                }
            }
        }
        return toplam;


    }

   /*
   girilen mda arraydeki cift sayilar toplayan bir method,yaziniz
    */


}














