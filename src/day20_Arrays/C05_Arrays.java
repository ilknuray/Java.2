package day20_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //verilen uc elemanli bir arrayin tum elemanlarini bir soldaki konuma tasiyacak bir
        //program yazin ornegin;
        //[1,2,3] ise output=[2,3,1] seklinde olsun

        int arr[]={1,2,3};

        int temp=arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));

        //yukarida yaptigimiz arrayi tekrar ilk durummuna getirelim

        temp=arr[arr.length-1];

        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];

        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
        
    }
}
