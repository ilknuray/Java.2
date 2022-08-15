package practiceler;

import java.util.Arrays;

public class C42_MDArrays {
    public static void main(String[] args) {
        //String 2d  array olustur String de $varsa 3.2 ile carp € varsa 4.2 ILE CARP
        //elemanlarin tioplamini double olarak, yazdir

        String [][] str={{"$12","$22","$0"},{"€9","€40","$1"},{"€12","$2","$0"}};
        double top=0;

        for (int i = 0; i < str.length ; i++) {
            for (int j = 0; j <str[i].length ; j++) {
                if(str[i][j].contains("$")){
                    top+=Double.parseDouble(str[i][j].replace("$",""))*3.2;

                }else {
                    top+=Double.parseDouble(str[i][j].replace("€",""))*4.2;
                }

            }

        }

        System.out.println(top);


    }
}
