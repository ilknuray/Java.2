package practiceler;

public class C41_MDArrays {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{2,3,1},{5,5,5},{2,1,3}};
        //min arrayi yazdir
        int min=arr[0][0];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               if(arr[i][j]<min){
                   min=arr[i][j];
               }


            }

        }
        System.out.println("min = " + min);


    }
}
