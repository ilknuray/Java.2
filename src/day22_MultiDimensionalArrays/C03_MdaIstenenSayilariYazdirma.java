package day22_MultiDimensionalArrays;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {
        //verilen iki katli bir mda arrayde outer ve inner indexi ayni olan sayilarin toplamini bulunuz

        int[][]sayilar={{1,5,6,9,4},{2,5,5,8},{3,1,6}};

        int istenenTop=0;

        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {

                if(i==j){

                    istenenTop=sayilar[i][j];
                }

            }
            System.out.println(istenenTop);
        }
    }
}
