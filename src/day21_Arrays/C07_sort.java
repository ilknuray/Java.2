package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {

        int [] sayilar={5,7,8,3,1,6,4};
        //array i arrays classini kullanarak natural sirali hale getirebiliriz

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }
}
