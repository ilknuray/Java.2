package day24_ArrayListForEachLoop;

public class C07_SayilarinKareToplami {
    public static void main(String[] args) {
        int []sayilar={2,3,4,5,7,8,7,6,9,3};
        int toplam=0;
        for (int each:sayilar
             ) {
            toplam=toplam+each*each;
        }
        System.out.println("kareler toplami : " +toplam);

    }
}
