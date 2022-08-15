package practiceler;

public class C23_forloop {
    public static void main(String[] args) {
        int top=0;

        for (int i =100 ; i >=0 ; i--) {
            if (i%13==0){
                System.out.println(i);
                top+=i;
            }
        }
        System.out.println(top);

    }
}
