package practiceler;

public class C38_Arrays {
    public static void main(String[] args) {
        int[][]arr1={{2,3},{4,5,6},{5}};
        int[][]arr2={{-7,6,-9},{0,12},{19}};

        int top=0;

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                top+=arr1[i][j];
            }

        }
        System.out.println("top = " + top);

        int top2=0;
        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j <arr2[i].length ; j++) {
                top2+=arr2[i][j];


            }

        }
        System.out.println("top2 = " + top2);
        System.out.println(top + top2);

        }



    }

