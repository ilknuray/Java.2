package day17nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        a
        a n
        a n k
        a n k a
        a n k a r
        a n k a r a
        a n k a r
        a n k a
        a n k
        a n
        a
         */
        String input="Ankara";
        for (int i =1;  i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));
            }
            System.out.println("");

        }
        for (int i = input.length() ;i >=1; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");

        }
    }
}
