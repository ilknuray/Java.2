package practiceler_2;

public class varargs {
    public static void main(String[] args) {
        /*
        niormal toplama
        varargs ile topla
         */
        int [] arr={17,23,33,9,20,55};
        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        System.out.println("varargsToplaList(25,55,63,21,20) = " + varargsToplaList(25, 55, 63, 21, 20));
        System.out.println("varargsTopla(arr) = " + varargsTopla(arr));
        //varargs array gibi davrandigi icin herhangi bir arrayi parametre olarak verebiliriz

    }

    private static int varargsTopla(int...i) {
        int top=0;
        for (int each:i) {
            top+=each;

        }
        return top;

    }

    private static int varargsToplaList(int i, int i1, int i2, int i3, int i4) {
        int top = 0;
        int bas=i;
        int son=i4;
        for (int j = bas; j <=son ; j++) {
            top+=j;

        }






        return top;
    }
            private static int arrTopla(int[] arr) {
        int top=0;
        for (int each:arr) {
            top+=each;

        }
        return top;
    }
}
