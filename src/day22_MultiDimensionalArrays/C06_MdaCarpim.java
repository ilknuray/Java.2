package day22_MultiDimensionalArrays;

public class C06_MdaCarpim {
    public static void main(String[] args) {
        //asagidaki mda in ic arraylerinde ki son elemanlarin caroimini ekrana yazdiran bir programa yaziniz

        int [][] arr={{1,2,3},{4,5},{6}};
        int carpim=1;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {

                if(j==arr[i].length-1){
                    carpim*=arr[i] [j] ;

            }

        }
            System.out.println("son elemenlarin carpimi : " +carpim);
    }
}}
