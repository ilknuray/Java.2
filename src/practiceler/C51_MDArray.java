package practiceler;

public class C51_MDArray {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6,7},{8,9,6,7},{1}};
        int elemanSayisi=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println(arr[i][j]);
                elemanSayisi++;

            }

        }
        System.out.println(elemanSayisi);
    }
}
