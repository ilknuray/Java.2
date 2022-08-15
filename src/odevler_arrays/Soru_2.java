package odevler_arrays;

public class Soru_2 {
    public static void main(String[] args) {
        //son elemanlari carptiran bir program

        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};
        int caroim = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (j == arr[i].length - 1) {
                    caroim *= arr[i][j];

                }

            }
            System.out.println(caroim);


        }

    }

}