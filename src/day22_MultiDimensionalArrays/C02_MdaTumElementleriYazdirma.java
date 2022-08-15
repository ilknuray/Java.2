package day22_MultiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {
        //verilen bir mda nin tum elementlerini yazdiran bir method olusturun


        int [][]sayilar={{1,5,6,9},{2,5},{3,1,6}};

        elemntleriYazdir(sayilar);
    }

    public static void elemntleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) {//outer array icin bu kisim yazilir
            for (int j = 0; j < sayilar[i].length ; j++) {//inner array icinbu kisim yazilir
                System.out.print(sayilar[i][j] + " ");

            }

        }
    }
}
