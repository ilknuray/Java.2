package practiceler;

public class C43_MDArrays {
    public static void main(String[] args) {
        //mda daki cift sayilari topla
        
        int [][]arr={{1,3,6},{2,8},{5,7,9,14}};
        int top=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]%2==0){
                    top+=arr[i][j];
                    
                }
                
            }
            
        }
        System.out.println("top = " + top);
    }
}
