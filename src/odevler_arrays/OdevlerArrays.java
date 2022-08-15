package odevler_arrays;

public class OdevlerArrays {
    public static void main(String[] args) {

        int[][]sayilar={{1,2,3},{4,5,6}};
        hepsiniCarp(sayilar);
    }

    public static void hepsiniCarp(int[][] sayilar) {
        int carpma=1;
        for (int[] each:sayilar
             ) {
            for (int each2:each
                 ) {
                carpma*=each2;

            }


        }System.out.println(carpma);


            }


        }






