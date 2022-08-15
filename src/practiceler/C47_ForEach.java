package practiceler;

public class C47_ForEach {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        //once cift sayilar sonra tek sayilari foreach loop ile yazdiriniz.
        for (int each:arr) {
            if(each%2==0){
                System.out.print(each+" ");
            }

        }
        System.out.println("");
        for (int each2:arr) {
            if(each2%2==1){
                System.out.print(each2+" ");
            }

        }
    }
}
