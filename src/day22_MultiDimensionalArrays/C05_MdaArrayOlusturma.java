package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C05_MdaArrayOlusturma {
    public static void main(String[] args) {
        /*
        asagicaki multi dimensional arrayin ic arraylerindeki tum arraylerin toplamini
        birer birer bulan ve herbir sonucu yeni bir array in elemani yapan
        ve yeni arrayi ekrana yazdiran bir program yaziniz

         */
        int [][] input={{1,2,3},{4,5},{6,7}};
        int[]yeniArray=new int[input.length];
        int toplam=0;

        for (int i = 0; i <input.length ; i++) {//outer array
            for (int j = 0; j <input[i].length ; j++) {//inner arrayi kontrol eder

                toplam+=input[i][j];
            }
            yeniArray[i]=toplam;
            toplam=0;
        }
        System.out.println("istenen yeni array : " + Arrays.toString(yeniArray));
    }
}
