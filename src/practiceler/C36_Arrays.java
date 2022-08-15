package practiceler;

public class C36_Arrays {
    public static void main(String[] args) {
        int[] arr = {5, 7, -6, 4, 2, 1, 5, 3, 8, 1};
        int top = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 9) {
                    System.out.println(arr[i] + " ve " + arr[j] + " istenen toplam : " + top);
                }

            }

        }
    }
}
